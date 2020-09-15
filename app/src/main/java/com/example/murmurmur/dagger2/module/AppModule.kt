package com.example.murmurmur.dagger2.module

import com.example.murmurmur.fragments.hotel.list.adapter.CatsAdapter
import dagger.Module
import dagger.Provides

@Module
class AppModule {

    @Provides
    fun provideCatsAdapter(): CatsAdapter {
        return CatsAdapter()
    }

}