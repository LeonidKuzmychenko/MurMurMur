package com.example.murmurmur.fragments.hotel.editinfo

import android.os.Bundle
import android.view.*
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import com.example.murmurmur.R

class HotelEditInfoFragment : Fragment() {

    private lateinit var viewModelHotel: HotelEditInfoFragmentViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        setHasOptionsMenu(true)
        return inflater.inflate(R.layout.fragment_hotel_edit_info, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModelHotel = ViewModelProvider(this).get(HotelEditInfoFragmentViewModel::class.java)
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.menu_fragment_hotel_edit_info, menu)
        super.onCreateOptionsMenu(menu, inflater)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.menu_item_fragment_hotel_edit_info_ok) {
            Navigation.findNavController(requireView()).popBackStack()
        }
        return super.onOptionsItemSelected(item)
    }
}