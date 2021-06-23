package com.example.coffee.onBoarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.widget.ViewPager2
import com.example.coffee.R
import com.example.coffee.screens.FirstScreen
import com.example.coffee.screens.SecondScreen
import com.example.coffee.screens.ThirdScreen


class ViewPagerFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        // Inflate the layout for this fragment
        //store the inflate to a view
        val view = inflater.inflate(R.layout.fragment_view_pager, container, false)

        //create a list of fragments

        val fragmentList = arrayListOf<Fragment>(
            FirstScreen(),
            SecondScreen(),
            ThirdScreen()
        )

        //create an adapter variable then initialize the viewPagerAdapter
        val viewPager: ViewPager2 = view.findViewById(R.id.viewPager)

        val adapter =  ViewPagerAdapter(

            fragmentList,
            requireActivity().supportFragmentManager,
            lifecycle)

        viewPager.adapter = adapter

        return view
    }

}