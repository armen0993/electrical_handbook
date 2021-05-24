package com.electrical.myapplication.theory.sockets_and_plugs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.electrical.myapplication.R
import com.electrical.myapplication.databinding.ActivitySocketsAndPlugsBinding
import com.electrical.myapplication.theory.ACTION_BAR_TITLE

class SocketsAndPlugsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        var countClick = 0
        var countClick1 = 0
        var countClick2 = 0
        var countClick3 = 0
        var countClick4 = 0
        var countClick5 = 0
        var countClick6 = 0
        var countClick7 = 0
        var countClick8 = 0
        var countClick9 = 0
        var countClick10 = 0
        var countClick11 = 0
        var countClick12 = 0
        var countClick13 = 0


        val bindingSockets = ActivitySocketsAndPlugsBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(bindingSockets.root)

        title = intent.getStringExtra(ACTION_BAR_TITLE)
        val actionBarShow: androidx.appcompat.app.ActionBar? = supportActionBar
        actionBarShow?.apply {
            setHomeButtonEnabled(true)
            setDisplayHomeAsUpEnabled(true)
        }

        bindingSockets.iconDescriptionUpDown.setBackgroundResource(R.drawable.ic_info_sockets_plugs_down)
        bindingSockets.iconDescriptionUpDown1.setBackgroundResource(R.drawable.ic_info_sockets_plugs_down)
        bindingSockets.iconDescriptionUpDown2.setBackgroundResource(R.drawable.ic_info_sockets_plugs_down)
        bindingSockets.iconDescriptionUpDown3.setBackgroundResource(R.drawable.ic_info_sockets_plugs_down)
        bindingSockets.iconDescriptionUpDown4.setBackgroundResource(R.drawable.ic_info_sockets_plugs_down)
        bindingSockets.iconDescriptionUpDown5.setBackgroundResource(R.drawable.ic_info_sockets_plugs_down)
        bindingSockets.iconDescriptionUpDown6.setBackgroundResource(R.drawable.ic_info_sockets_plugs_down)
        bindingSockets.iconDescriptionUpDown7.setBackgroundResource(R.drawable.ic_info_sockets_plugs_down)
        bindingSockets.iconDescriptionUpDown8.setBackgroundResource(R.drawable.ic_info_sockets_plugs_down)
        bindingSockets.iconDescriptionUpDown9.setBackgroundResource(R.drawable.ic_info_sockets_plugs_down)
        bindingSockets.iconDescriptionUpDown10.setBackgroundResource(R.drawable.ic_info_sockets_plugs_down)
        bindingSockets.iconDescriptionUpDown11.setBackgroundResource(R.drawable.ic_info_sockets_plugs_down)
        bindingSockets.iconDescriptionUpDown12.setBackgroundResource(R.drawable.ic_info_sockets_plugs_down)
        bindingSockets.iconDescriptionUpDown13.setBackgroundResource(R.drawable.ic_info_sockets_plugs_down)

        bindingSockets.layoutDescriptionSocketPlugs.setOnClickListener() {
            if (countClick % 2 == 0) {
                bindingSockets.iconDescriptionUpDown.setBackgroundResource(R.drawable.ic_info_sockets_plugs_up)
                bindingSockets.descriptionSocketsAndPlugs.text =
                    getString(R.string.info_description_sockets_and_plugs)
                countClick++
            } else {
                bindingSockets.descriptionSocketsAndPlugs.text = ""
                bindingSockets.iconDescriptionUpDown.setBackgroundResource(R.drawable.ic_info_sockets_plugs_down)
                countClick++
            }
        }
        bindingSockets.layoutDescriptionSocketPlugs1.setOnClickListener() {
            if (countClick1 % 2 == 0) {
                bindingSockets.iconDescriptionUpDown1.setBackgroundResource(R.drawable.ic_info_sockets_plugs_up)
                bindingSockets.descriptionSocketsAndPlugs1.text =
                    getString(R.string.info_description_sockets_and_plugs_1)
                countClick1++
            } else {
                bindingSockets.descriptionSocketsAndPlugs1.text = ""
                bindingSockets.iconDescriptionUpDown1.setBackgroundResource(R.drawable.ic_info_sockets_plugs_down)
                countClick1++
            }
        }
        bindingSockets.layoutDescriptionSocketPlugs2.setOnClickListener() {
            if (countClick2 % 2 == 0) {
                bindingSockets.iconDescriptionUpDown2.setBackgroundResource(R.drawable.ic_info_sockets_plugs_up)
                bindingSockets.descriptionSocketsAndPlugs2.text =
                    getString(R.string.info_description_sockets_and_plugs_2)
                countClick2++
            } else {
                bindingSockets.descriptionSocketsAndPlugs2.text = ""
                bindingSockets.iconDescriptionUpDown2.setBackgroundResource(R.drawable.ic_info_sockets_plugs_down)
                countClick2++
            }
        }
        bindingSockets.layoutDescriptionSocketPlugs3.setOnClickListener() {
            if (countClick3 % 2 == 0) {
                bindingSockets.iconDescriptionUpDown3.setBackgroundResource(R.drawable.ic_info_sockets_plugs_up)
                bindingSockets.descriptionSocketsAndPlugs3.text =
                    getString(R.string.info_description_sockets_and_plugs_3)
                countClick3++
            } else {
                bindingSockets.descriptionSocketsAndPlugs3.text = ""
                bindingSockets.iconDescriptionUpDown3.setBackgroundResource(R.drawable.ic_info_sockets_plugs_down)
                countClick3++
            }
        }
        bindingSockets.layoutDescriptionSocketPlugs4.setOnClickListener() {
            if (countClick4 % 2 == 0) {
                bindingSockets.iconDescriptionUpDown4.setBackgroundResource(R.drawable.ic_info_sockets_plugs_up)
                bindingSockets.descriptionSocketsAndPlugs4.text =
                    getString(R.string.info_description_sockets_and_plugs_4)
                countClick4++
            } else {
                bindingSockets.descriptionSocketsAndPlugs4.text = ""
                bindingSockets.iconDescriptionUpDown4.setBackgroundResource(R.drawable.ic_info_sockets_plugs_down)
                countClick4++
            }
        }
        bindingSockets.layoutDescriptionSocketPlugs5.setOnClickListener() {
            if (countClick5 % 2 == 0) {
                bindingSockets.iconDescriptionUpDown5.setBackgroundResource(R.drawable.ic_info_sockets_plugs_up)
                bindingSockets.descriptionSocketsAndPlugs5.text =
                    getString(R.string.info_description_sockets_and_plugs_5)
                countClick5++
            } else {
                bindingSockets.descriptionSocketsAndPlugs5.text = ""
                bindingSockets.iconDescriptionUpDown5.setBackgroundResource(R.drawable.ic_info_sockets_plugs_down)
                countClick5++
            }
        }
        bindingSockets.layoutDescriptionSocketPlugs6.setOnClickListener() {
            if (countClick6 % 2 == 0) {
                bindingSockets.iconDescriptionUpDown6.setBackgroundResource(R.drawable.ic_info_sockets_plugs_up)
                bindingSockets.descriptionSocketsAndPlugs6.text =
                    getString(R.string.info_description_sockets_and_plugs_6)
                countClick6++
            } else {
                bindingSockets.descriptionSocketsAndPlugs6.text = ""
                bindingSockets.iconDescriptionUpDown6.setBackgroundResource(R.drawable.ic_info_sockets_plugs_down)
                countClick6++
            }
        }
        bindingSockets.layoutDescriptionSocketPlugs7.setOnClickListener() {
            if (countClick7 % 2 == 0) {
                bindingSockets.iconDescriptionUpDown7.setBackgroundResource(R.drawable.ic_info_sockets_plugs_up)
                bindingSockets.descriptionSocketsAndPlugs7.text =
                    getString(R.string.info_description_sockets_and_plugs_7)
                countClick7++
            } else {
                bindingSockets.descriptionSocketsAndPlugs7.text = ""
                bindingSockets.iconDescriptionUpDown7.setBackgroundResource(R.drawable.ic_info_sockets_plugs_down)
                countClick7++
            }
        }
        bindingSockets.layoutDescriptionSocketPlugs8.setOnClickListener() {
            if (countClick8 % 2 == 0) {
                bindingSockets.iconDescriptionUpDown8.setBackgroundResource(R.drawable.ic_info_sockets_plugs_up)
                bindingSockets.descriptionSocketsAndPlugs8.text =
                    getString(R.string.info_description_sockets_and_plugs_8)
                countClick8++
            } else {
                bindingSockets.descriptionSocketsAndPlugs8.text = ""
                bindingSockets.iconDescriptionUpDown8.setBackgroundResource(R.drawable.ic_info_sockets_plugs_down)
                countClick8++
            }
        }
        bindingSockets.layoutDescriptionSocketPlugs9.setOnClickListener() {
            if (countClick9 % 2 == 0) {
                bindingSockets.iconDescriptionUpDown9.setBackgroundResource(R.drawable.ic_info_sockets_plugs_up)
                bindingSockets.descriptionSocketsAndPlugs9.text =
                    getString(R.string.info_description_sockets_and_plugs_9)
                countClick9++
            } else {
                bindingSockets.descriptionSocketsAndPlugs9.text = ""
                bindingSockets.iconDescriptionUpDown9.setBackgroundResource(R.drawable.ic_info_sockets_plugs_down)
                countClick9++
            }
        }
        bindingSockets.layoutDescriptionSocketPlugs10.setOnClickListener() {
            if (countClick10 % 2 == 0) {
                bindingSockets.iconDescriptionUpDown10.setBackgroundResource(R.drawable.ic_info_sockets_plugs_up)
                bindingSockets.descriptionSocketsAndPlugs10.text =
                    getString(R.string.info_description_sockets_and_plugs_10)
                countClick10++
            } else {
                bindingSockets.descriptionSocketsAndPlugs10.text = ""
                bindingSockets.iconDescriptionUpDown10.setBackgroundResource(R.drawable.ic_info_sockets_plugs_down)
                countClick10++
            }
        }
        bindingSockets.layoutDescriptionSocketPlugs11.setOnClickListener() {
            if (countClick11 % 2 == 0) {
                bindingSockets.iconDescriptionUpDown11.setBackgroundResource(R.drawable.ic_info_sockets_plugs_up)
                bindingSockets.descriptionSocketsAndPlugs11.text =
                    getString(R.string.info_description_sockets_and_plugs_11)
                countClick11++
            } else {
                bindingSockets.descriptionSocketsAndPlugs11.text = ""
                bindingSockets.iconDescriptionUpDown11.setBackgroundResource(R.drawable.ic_info_sockets_plugs_down)
                countClick11++
            }
        }
        bindingSockets.layoutDescriptionSocketPlugs12.setOnClickListener() {
            if (countClick12 % 2 == 0) {
                bindingSockets.iconDescriptionUpDown12.setBackgroundResource(R.drawable.ic_info_sockets_plugs_up)
                bindingSockets.descriptionSocketsAndPlugs12.text =
                    getString(R.string.info_description_sockets_and_plugs_12)
                countClick12++
            } else {
                bindingSockets.descriptionSocketsAndPlugs12.text = ""
                bindingSockets.iconDescriptionUpDown12.setBackgroundResource(R.drawable.ic_info_sockets_plugs_down)
                countClick12++
            }
        }
        bindingSockets.layoutDescriptionSocketPlugs13.setOnClickListener() {
            if (countClick13 % 2 == 0) {
                bindingSockets.iconDescriptionUpDown13.setBackgroundResource(R.drawable.ic_info_sockets_plugs_up)
                bindingSockets.descriptionSocketsAndPlugs13.text =
                    getString(R.string.info_description_sockets_and_plugs_13)
                countClick13++
            } else {
                bindingSockets.descriptionSocketsAndPlugs13.text = ""
                bindingSockets.iconDescriptionUpDown13.setBackgroundResource(R.drawable.ic_info_sockets_plugs_down)
                countClick13++
            }
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