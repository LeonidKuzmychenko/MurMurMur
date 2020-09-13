package com.example.murmurmur

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration

    //1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setToolbar()
        setupActionBarWithNavController()
        setupWithNavController()
    }

    //2
    private fun setToolbar() {
        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
    }

    //3
    private fun setupActionBarWithNavController() {
        val fragments = setOf(R.id.listFragment, R.id.groomingFragment)
        val drawerLayout: DrawerLayout =
            findViewById(R.id.activity_main_drawer_layout) //link to main_activity view
        appBarConfiguration = AppBarConfiguration(fragments, drawerLayout)
        val navController = Navigation.findNavController(this, R.id.nav_host_fragment)
        setupActionBarWithNavController(navController, appBarConfiguration)
    }

    //4
    private fun setupWithNavController() {
        val navController = Navigation.findNavController(this, R.id.nav_host_fragment)
        val navView: NavigationView =
            findViewById(R.id.nav_view) //link to main_activity NavigationView
        navView.setupWithNavController(navController)
    }

    //5
    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment)
        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }

}