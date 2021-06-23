package com.example.coffee.onBoarding

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

//pass three arguments (list,fragmentManger and lifecycle)
//the ViewPagerAdapter will extend FragmentStateAdapter
class ViewPagerAdapter(list: ArrayList<Fragment>,fragmentManager: FragmentManager, lifecycle: Lifecycle):FragmentStateAdapter(fragmentManager, lifecycle) {

    //create a fragmentList variable
    private val fragmentList: ArrayList<Fragment> = list

    override fun getItemCount(): Int {

        //return the size of the fragmentList
       return fragmentList.size
    }

    override fun createFragment(position: Int): Fragment {

       //return the position of the fragmentList
       return fragmentList[position]
    }

}