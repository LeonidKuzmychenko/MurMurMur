package com.example.murmurmur.dagger2.module

import androidx.lifecycle.ViewModelProvider
import com.example.murmurmur.fragments.hotellist.HotelListFragment
import com.example.murmurmur.fragments.hotellist.HotelListFragmentViewModel
import com.example.murmurmur.fragments.hotellist.adapter.CatsAdapter
import com.example.murmurmur.items.CatProfile
import dagger.Module
import dagger.Provides
import java.util.*


@Module
class AppModule {

//    @Provides
//    fun provide(fragment: HotelListFragment) : HotelListFragmentViewModel{
//        return ViewModelProvider(fragment).get(HotelListFragmentViewModel::class.java)
//    }

    @Provides
    fun provideCatsAdapter(): CatsAdapter{
        return CatsAdapter()
    }

//    @Provides
//    fun provideCatList(): List<CatProfile>{
//        return listOf(
//            CatProfile("Маруся", "Олюся", Date()),
//            CatProfile("Маруся", "Олюся", Date()),
//            CatProfile("Маруся", "Олюся", Date()),
//            CatProfile("Маруся", "Олюся", Date()),
//            CatProfile("Маруся", "Олюся", Date()),
//            CatProfile("Маруся", "Олюся", Date()),
//            CatProfile("Маруся", "Олюся", Date()),
//            CatProfile("Маруся", "Олюся", Date()),
//            CatProfile("Маруся", "Олюся", Date()),
//            CatProfile("Маруся", "Олюся", Date()),
//            CatProfile("Маруся", "Олюся", Date()),
//            CatProfile("Маруся", "Олюся", Date()),
//            CatProfile("Маруся", "Олюся", Date()),
//            CatProfile("Маруся", "Олюся", Date()),
//            CatProfile("Маруся", "Олюся", Date()),
//            CatProfile("Маруся", "Олюся", Date()),
//            CatProfile("Маруся", "Олюся", Date()),
//            CatProfile("Маруся", "Олюся", Date())
//        )
//    }

}