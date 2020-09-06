package com.example.murmurmur.fragments.list

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.murmurmur.MainActivity
import com.example.murmurmur.R
import com.example.murmurmur.fragments.list.adapter.CatsAdapter
import com.example.murmurmur.items.CatProfile
import kotlinx.android.synthetic.main.fragment_list.*
import java.util.*

class ListFragment : Fragment() {

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

}