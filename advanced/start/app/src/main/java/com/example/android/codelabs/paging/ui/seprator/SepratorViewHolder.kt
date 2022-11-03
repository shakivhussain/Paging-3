package com.example.android.codelabs.paging.ui.seprator

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.android.codelabs.paging.R

class SepratorViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    private val description: TextView = view.findViewById(R.id.separator_description)

    fun bind(sepratorTextView: String) {
        description.text = sepratorTextView
    }

    companion object {

        fun create(parent: ViewGroup): SepratorViewHolder {

            val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.seprator_view_item, parent, false)
            return SepratorViewHolder(view)
        }
    }
}