package com.example.murmurmur.fragments.grooming.cat

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.murmurmur.R

class GroomingCatFragment : Fragment() {

    private lateinit var catFragmentViewModel: GroomingCatFragmentViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.grooming_cat_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        catFragmentViewModel = ViewModelProvider(this).get(GroomingCatFragmentViewModel::class.java)
    }

}