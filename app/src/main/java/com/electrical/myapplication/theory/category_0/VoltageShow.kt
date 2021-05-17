package com.electrical.myapplication.theory.category_0

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.electrical.myapplication.R
import com.electrical.myapplication.theory.ACTION_BAR_TITLE

class VoltageShow : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_voltage_show)

        title = intent.getStringExtra(ACTION_BAR_TITLE)
        val actionBar: androidx.appcompat.app.ActionBar? = supportActionBar
        actionBar?.apply {
            setHomeButtonEnabled(true)
            setDisplayHomeAsUpEnabled(true)
        }
        if (intent.getIntExtra("key", 0) == 0) {


        }
        fun onOptionsItemSelected(item: MenuItem): Boolean {
            when (item.itemId) {
                android.R.id.home -> {
                    finish()
                    return true
                }
            }
            return super.onOptionsItemSelected(item)
        }
    }
}
