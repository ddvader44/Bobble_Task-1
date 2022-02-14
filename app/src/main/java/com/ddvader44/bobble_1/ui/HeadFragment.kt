package com.ddvader44.bobble_1.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.ddvader44.bobble_1.R
import com.ddvader44.bobble_1.adapter.ParentAdapter
import com.ddvader44.bobble_1.viewmodels.HeadViewModel
import kotlinx.android.synthetic.main.fragment_head.*

class HeadFragment : Fragment(R.layout.fragment_head)
{

    private val headViewModel: HeadViewModel by viewModels()
    private lateinit var parentAdapter: ParentAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupViews()
    }

    private fun setupViews() {
        parent_recycler_view.layoutManager = LinearLayoutManager(activity, LinearLayoutManager.VERTICAL,false)
        parentAdapter = ParentAdapter()
        parent_recycler_view.adapter = parentAdapter
    }
}