package com.electrical.myapplication.theory.ip_shield

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.electrical.myapplication.R
import com.electrical.myapplication.theory.ACTION_BAR_TITLE

class IpShield : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ip_shield)

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
    override fun onPause() {
        super.onPause()
        overridePendingTransition(
            R.anim.activity_down_up_close_enter,
            R.anim.activity_down_up_close_exit
        )
    }
}