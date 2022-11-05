package com.auto.chrisroidresume

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import android.widget.PopupMenu
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.NavDestination

import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.NavigationUI.setupActionBarWithNavController
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.auto.chrisroidresume.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView
import nl.joery.animatedbottombar.AnimatedBottomBar

class MainActivity : AppCompatActivity() {

    private lateinit var navController: NavController
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Fragmnets calling
        val chrisFragment = ChrisFragment()
        val skillsFragment = SkillsFragment()
        val appFragment = AppFragment()



        //default fragmnet
        makeCurrentFragment(chrisFragment)

        //selectListener to the navigation bar
        binding.bottomBar.setOnTabSelectListener(object : AnimatedBottomBar.OnTabSelectListener {
            override fun onTabSelected(
                lastIndex: Int,
                lastTab: AnimatedBottomBar.Tab?,
                newIndex: Int,
                newTab: AnimatedBottomBar.Tab
            ) {

                //redirecting fragments
                when(newIndex){
                    0 -> makeCurrentFragment(chrisFragment);
                    1 -> makeCurrentFragment(skillsFragment);
                    2 -> makeCurrentFragment(appFragment);
                    else -> makeCurrentFragment(chrisFragment);
                }

                Log.d("bottom_bar", "Selected index: $newIndex, title: ${newTab.title}")


            }

            // An optional method that will be fired whenever an already selected tab has been selected again.
            override fun onTabReselected(index: Int, tab: AnimatedBottomBar.Tab) {
                Log.d("bottom_bar", "Reselected index: $index, title: ${tab.title}")
            }
        });

    }

    //selecting current fragment
    private fun makeCurrentFragment(fragment: Fragment) {

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.main,fragment)
            commit()
        }




    }

}
