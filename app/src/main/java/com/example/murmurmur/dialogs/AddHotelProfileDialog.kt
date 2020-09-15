package com.example.murmurmur.dialogs

import android.app.Dialog
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment
import androidx.navigation.Navigation
import com.example.murmurmur.R


class AddHotelProfileDialog: DialogFragment() {

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val builder: AlertDialog.Builder = AlertDialog.Builder(requireActivity())
        builder.setMessage("Введите имя котика")
            .setView(R.layout.dialog_fragment_hotel_add_profile)
            .setPositiveButton("Добавить") { dialog, id ->
                val action= AddHotelProfileDialogDirections.actionAddHotelProfileDialogToHotelEditInfoFragment()
                action.id = -2
                parentFragment?.requireView()?.let {
                    Navigation.findNavController(it).navigate(action)
                }
            }
        return builder.create()
    }

}