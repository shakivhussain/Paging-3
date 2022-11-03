package com.example.android.codelabs.paging.ui.loadstate

import android.view.ViewGroup
import androidx.paging.LoadState
import androidx.paging.LoadStateAdapter

class ReposLoadStateAdapter(private val retry: () -> Unit) :
    LoadStateAdapter<RepoLoadStateViewHolder>() {

    override fun onBindViewHolder(holder: RepoLoadStateViewHolder, loadState: LoadState) {
        holder.bind(loadState)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup, loadState: LoadState
    ): RepoLoadStateViewHolder {
        return RepoLoadStateViewHolder.create(parent, retry)
    }
}