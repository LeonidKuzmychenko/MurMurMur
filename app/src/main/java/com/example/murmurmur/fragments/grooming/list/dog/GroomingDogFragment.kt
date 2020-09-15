package com.example.murmurmur.fragments.grooming.list.dog

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.murmurmur.R

class GroomingDogFragment : Fragment() {

    private lateinit var viewModel: GroomingDogViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        setHasOptionsMenu(true)
        return inflater.inflate(R.layout.fragment_grooming_dog, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(GroomingDogViewModel::class.java)
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.menu_fragment_grooming_dog, menu)
        super.onCreateOptionsMenu(menu, inflater)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
//        if (item.itemId == R.id.menu_item_fragment_hotel_edit_info_ok) {
//            val action = HotelInfoFragmentDirections.actionHotelInfoFragmentToHotelEditInfoFragment()
//            Navigation.findNavController(requireView()).navigate(action)
//        }
        return super.onOptionsItemSelected(item)
    }
}