package com.ddvader44.bobble_1.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ddvader44.bobble_1.R
import kotlinx.android.synthetic.main.item_row_child.view.*

open class ChildAdapter(var memberData: String) :
    RecyclerView.Adapter<ChildAdapter.DataViewHolder>() {

    private var membersList = arrayListOf("Dishit","Archita","Eren","Nietzche")


    var onItemClick: ((String) -> Unit)? = null

    inner class DataViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        init {
            itemView.setOnClickListener {
                onItemClick?.invoke(membersList[adapterPosition])
            }
        }

        fun bind(result: String) {
            itemView.name.setBackgroundResource(R.drawable.ic_cricket)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = DataViewHolder(
        LayoutInflater.from(parent.context).inflate(
            R.layout.item_row_child, parent,
            false
        )
    )

    override fun onBindViewHolder(holder: DataViewHolder, position: Int) {
        holder.bind(membersList[position])
    }

    override fun getItemCount(): Int = membersList.size


}