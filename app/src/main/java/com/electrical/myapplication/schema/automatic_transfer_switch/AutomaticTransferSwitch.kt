package com.electrical.myapplication.schema.automatic_transfer_switch

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.electrical.myapplication.R

import com.electrical.myapplication.theory.ACTION_BAR_TITLE

class AutomaticTransferSwitch : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_automatic_transfer_switch)

            title = intent.getStringExtra(ACTION_BAR_TITLE)
            val actionBarShow: androidx.appcompat.app.ActionBar? = supportActionBar
            actionBarShow?.apply {
                setHomeButtonEnabled(true)
                setDisplayHomeAsUpEnabled(true)
            }

        }





        override fun onOptionsItemSelected(item: MenuItem): Boolean {
            when (item.itemId) {
                android.R.id.home -> {
                    finish()
                    return true
                }
            }
            return super.onOptionsItemSelected(item)
        }
    }