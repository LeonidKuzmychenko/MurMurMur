package com.example.murmurmur.fragments.hotel.list

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.*
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import com.example.murmurmur.R
import com.example.murmurmur.application.InitApp
import com.example.murmurmur.fragments.hotel.info.HotelInfoFragmentDirections
import com.example.murmurmur.fragments.hotel.list.adapter.CatsAdapter
import com.example.murmurmur.items.CatProfile
import kotlinx.android.synthetic.main.fragment_hotel_list.*
import java.util.*
import javax.inject.Inject

class HotelListFragment : Fragment() {

    private lateinit var viewModel: HotelListFragmentViewModel

    @Inject
    lateinit var adapter: CatsAdapter

    //5
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        Log.d("TestLog", "onActivityCreated")
        super.onActivityCreated(savedInstanceState)
        val list = listOf(
            CatProfile("Маруся", "Олюся", Date()),
            CatProfile("Маруся", "Олюся", Date()),
            CatProfile("Маруся", "Олюся", Date()),
            CatProfile("Маруся", "Олюся", Date()),
            CatProfile("Маруся", "Олюся", Date()),
            CatProfile("Маруся", "Олюся", Date()),
            CatProfile("Маруся", "Олюся", Date()),
            CatProfile("Маруся", "Олюся", Date()),
            CatProfile("Маруся", "Олюся", Date()),
            CatProfile("Маруся", "Олюся", Date()),
            CatProfile("Маруся", "Олюся", Date()),
            CatProfile("Маруся", "Олюся", Date()),
            CatProfile("Маруся", "Олюся", Date()),
            CatProfile("Маруся", "Олюся", Date()),
            CatProfile("Маруся", "Олюся", Date()),
            CatProfile("Маруся", "Олюся", Date()),
            CatProfile("Маруся", "Олюся", Date()),
            CatProfile("Маруся", "Олюся", Date())
        )

        adapter.setList(list)
    }

    //4
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        Log.d("TestLog", "onViewCreated")
        super.onViewCreated(view, savedInstanceState)

        recyclerListOfCat.adapter = adapter

        viewModel = ViewModelProvider(this).get(HotelListFragmentViewModel::class.java)
        viewModel.list.observe(viewLifecycleOwner, Observer {
            adapter.setList(it)
        })
    }

    //3
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        setHasOptionsMenu(true)
        Log.d("TestLog", "onCreateView")
        return inflater.inflate(R.layout.fragment_hotel_list, container, false)
    }

    //2
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d("TestLog", "onCreate")
        super.onCreate(savedInstanceState)
    }

    //1
    override fun onAttach(context: Context) {
        Log.d("TestLog", "onAttach")
        (context.applicationContext as InitApp).appComponent().inject(this)
        super.onAttach(context)
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.menu_fragment_hotel, menu)
        super.onCreateOptionsMenu(menu, inflater)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.menu_item_fragment_hotel_add) {
            Navigation.findNavController(requireView()).navigate(R.id.addHotelProfileDialog)
//            val action = HotelInfoFragmentDirections.actionHotelInfoFragmentToHotelEditInfoFragment()
//            Navigation.findNavController(requireView()).navigate(action)
        }
        return super.onOptionsItemSelected(item)
    }

}