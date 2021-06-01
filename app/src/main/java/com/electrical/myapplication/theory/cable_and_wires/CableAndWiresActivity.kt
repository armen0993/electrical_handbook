package com.electrical.myapplication.theory.cable_and_wires

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.electrical.myapplication.R
import com.electrical.myapplication.databinding.ActivityCableAndWiresBinding
import com.electrical.myapplication.theory.ACTION_BAR_TITLE

const val CATEGORY_NAME_CABLE = "Cable name"
const val CATEGORY_CABLE_CONDUCTOR_COLOR = 400
const val CATEGORY_CABLE_DECRYPTION = 401
const val CATEGORY_CABLE_TYPES_OF_CABLES = 402
const val CATEGORY_CABLE_CONNECTING_WIRES = 403
const val CATEGORY_CABLE_SELECTION_OF_SECTION = 404


class CableAndWiresActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val bindingCable = ActivityCableAndWiresBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(bindingCable.root)

        val showCategoryCableIntent = Intent(this, ShowCategoryCable::class.java)

        title = intent.getStringExtra(ACTION_BAR_TITLE)
        val actionBarShow: androidx.appcompat.app.ActionBar? = supportActionBar
        actionBarShow?.apply {
            setHomeButtonEnabled(true)
            setDisplayHomeAsUpEnabled(true)
        }

        bindingCable.layoutCablePosition0.setOnClickListener {
            showCategoryCableIntent.putExtra(ACTION_BAR_TITLE, bindingCable.titleCable0.text)
            showCategoryCableIntent.putExtra(CATEGORY_NAME_CABLE, CATEGORY_CABLE_CONDUCTOR_COLOR)
            startActivity(showCategoryCableIntent)
        }
        bindingCable.layoutCablePosition1.setOnClickListener {
            showCategoryCableIntent.putExtra(ACTION_BAR_TITLE, bindingCable.titleCable1.text)
            showCategoryCableIntent.putExtra(CATEGORY_NAME_CABLE, CATEGORY_CABLE_DECRYPTION)
            startActivity(showCategoryCableIntent)
        }
        bindingCable.layoutCablePosition2.setOnClickListener {
            showCategoryCableIntent.putExtra(ACTION_BAR_TITLE, bindingCable.titleCable2.text)
            showCategoryCableIntent.putExtra(CATEGORY_NAME_CABLE, CATEGORY_CABLE_TYPES_OF_CABLES)
            startActivity(showCategoryCableIntent)
        }
        bindingCable.layoutCablePosition3.setOnClickListener {
            showCategoryCableIntent.putExtra(ACTION_BAR_TITLE, bindingCable.titleCable3.text)
            showCategoryCableIntent.putExtra(CATEGORY_NAME_CABLE, CATEGORY_CABLE_CONNECTING_WIRES)
            startActivity(showCategoryCableIntent)
        }
        bindingCable.layoutCablePosition4.setOnClickListener {
            showCategoryCableIntent.putExtra(ACTION_BAR_TITLE, bindingCable.titleCable4.text)
            showCategoryCableIntent.putExtra(CATEGORY_NAME_CABLE, CATEGORY_CABLE_SELECTION_OF_SECTION)
            startActivity(showCategoryCableIntent)
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