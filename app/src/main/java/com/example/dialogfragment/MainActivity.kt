package com.example.dialogfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TableLayout
import com.example.dialogfragment.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val toolbar = binding.toolbar
        setSupportActionBar(toolbar)

        adapter()

    }

    private fun adapter() {


        val myAdapter = viewPagerAdapter(this)
        binding.viewPager.adapter = myAdapter


        val mediator = TabLayoutMediator(
            binding.tabLayoutMain,
            binding.viewPager

        )
/*
           object : TabLayoutMediator.TabConfigurationStrategy {
                override fun onConfigureTab(tab: TabLayout.Tab, position: Int) {

                    when (position) {

                        0 -> {
                            tab.text = "Chats"

                        }
                        1 -> {
                            tab.text = "Status"
                        }
                        2 -> {
                            tab.text = "Calls"
                   }}} })*/

        { tab, position ->
            when (position) {

                0 -> {
                    tab.text = "Chats"

                }
                1 -> {
                    tab.text = "Status"
                }
                2 -> {
                    tab.text = "Calls"
                }


            }
        }
        mediator.attach()

    }
}