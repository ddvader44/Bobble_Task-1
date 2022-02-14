package com.ddvader44.bobble_1.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ddvader44.bobble_1.R
import com.ddvader44.bobble_1.viewmodels.HeadViewModel
import kotlinx.android.synthetic.main.item_row_parent.view.*


open class ParentAdapter : RecyclerView.Adapter<ParentAdapter.DataViewHolder>() {

    var headsList = HeadViewModel.heads
    var onItemClick: ((String) -> Unit)? = null

    inner class DataViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        init {
            itemView.setOnClickListener {
                onItemClick?.invoke(headsList[adapterPosition])
            }
        }

        fun bind(result: String) {
            itemView.content_title.text = result
            val childAdapter = ChildAdapter(result)
            itemView.child_recycler_view.layoutManager = LinearLayoutManager(itemView.context, LinearLayoutManager.HORIZONTAL,false)
            itemView.child_recycler_view.adapter = childAdapter

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = DataViewHolder(
        LayoutInflater.from(parent.context).inflate(
            R.layout.item_row_parent, parent,
            false
        )
    )

    override fun onBindViewHolder(holder: DataViewHolder, position: Int) {
        holder.bind(headsList[position])
    }

    override fun getItemCount(): Int = headsList.size


}