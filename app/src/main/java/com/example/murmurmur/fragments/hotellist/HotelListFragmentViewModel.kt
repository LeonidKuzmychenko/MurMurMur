package com.example.murmurmur.fragments.hotellist

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.murmurmur.items.CatProfile

class HotelListFragmentViewModel : ViewModel(){
    val list: LiveData<List<CatProfile>> = MutableLiveData()
}