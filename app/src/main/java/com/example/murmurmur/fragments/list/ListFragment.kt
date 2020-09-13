package com.example.murmurmur.fragments.list

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.murmurmur.R
import com.example.murmurmur.fragments.edit.InfoFragmentViewModel
import com.example.murmurmur.fragments.list.adapter.CatsAdapter
import com.example.murmurmur.items.CatProfile
import kotlinx.android.synthetic.main.fragment_list.*
import java.util.*

class ListFragment : Fragment() {

    private lateinit var viewModel: ListFragmentViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val listOfCat = listOf(
            CatProfile("Маруся","Олюся", Date()),
            CatProfile("Маруся","Олюся", Date()),
            CatProfile("Маруся","Олюся", Date()),
            CatProfile("Маруся","Олюся", Date()),
            CatProfile("Маруся","Олюся", Date()),
            CatProfile("Маруся","Олюся", Date()),
            CatProfile("Маруся","Олюся", Date()),
            CatProfile("Маруся","Олюся", Date()),
            CatProfile("Маруся","Олюся", Date()),
            CatProfile("Маруся","Олюся", Date()),
            CatProfile("Маруся","Олюся", Date()),
            CatProfile("Маруся","Олюся", Date()),
            CatProfile("Маруся","Олюся", Date()),
            CatProfile("Маруся","Олюся", Date()),
            CatProfile("Маруся","Олюся", Date()),
            CatProfile("Маруся","Олюся", Date()),
            CatProfile("Маруся","Олюся", Date()),
            CatProfile("Маруся","Олюся", Date())
        )
        val adapter = CatsAdapter(listOfCat)
        recyclerListOfCat.adapter = adapter
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_list, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(ListFragmentViewModel::class.java)
    }

}