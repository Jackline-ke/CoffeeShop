package com.example.coffee

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController

class SplashFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_splash, container, false)

        //since we have used a nav components, we don't use startActivity instead we use findNavController()
        Handler().postDelayed({
            findNavController().navigate(R.id.action_splashFragment_to_viewPagerFragment)
        },3000)

        return view
    }

}