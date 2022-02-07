package com.example.mememe

import android.content.ClipData
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class MemeMeViewModel : ViewModel() {

    private val _memeLiveData = MutableLiveData<List<ClipData.Item>>()
    val memeLiveData: LiveData<List<ClipData.Item>> = _memeLiveData
//  private val repository: MemeRepository = MemeRepository

    private fun fetchMeme() {
        viewModelScope.launch {
            // val randomMeme = repository.fetchMeme()
        }

        data class Item(
            val title: String,
            val url: String,
        )
    }
}