package com.example.murmurmur.dagger2

import com.example.murmurmur.dagger2.module.AppModule
import com.example.murmurmur.fragments.hotellist.HotelListFragment
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class])
interface AppComponent {

    fun inject(fragment: HotelListFragment)

}