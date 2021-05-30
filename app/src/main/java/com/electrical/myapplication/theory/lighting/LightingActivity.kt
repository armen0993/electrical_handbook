package com.electrical.myapplication.theory.lighting

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.electrical.myapplication.R
import com.electrical.myapplication.databinding.ActivityLightingBinding


import com.electrical.myapplication.theory.ACTION_BAR_TITLE

const val CATEGORY_NAME_LIGHTING = "Lighting name"
const val CATEGORY_LIGHTING_INCANDESCENT_LAMP = 300
const val CATEGORY_LIGHTING_TYPES_OF_LAMPS = 301
const val CATEGORY_LIGHTING_TYPES_OF_BASES = 302
const val CATEGORY_LIGHTING_LUMEN_AND_LUX = 203
const val CATEGORY_LIGHTING_COLORFUL_TEMPERATURE = 304
const val CATEGORY_LIGHTING_LED = 305

class LightingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val bindingLighting = ActivityLightingBinding.inflate(layoutInflater)
        setContentView(bindingLighting.root)

        val showLightingIntent = Intent(this, ShowCategoryLighting::class.java)

        title = intent.getStringExtra(ACTION_BAR_TITLE)
        val actionBarShow: androidx.appcompat.app.ActionBar? = supportActionBar
        actionBarShow?.apply {
            setHomeButtonEnabled(true)
            setDisplayHomeAsUpEnabled(true)
        }
        bindingLighting.layoutLightingPosition0.setOnClickListener {
            showLightingIntent.putExtra(ACTION_BAR_TITLE, bindingLighting.titleLighting0.text)
            showLightingIntent.putExtra(CATEGORY_NAME_LIGHTING, CATEGORY_LIGHTING_INCANDESCENT_LAMP)
            startActivity(showLightingIntent)

        }
        bindingLighting.layoutLightingPosition1.setOnClickListener {
            showLightingIntent.putExtra(ACTION_BAR_TITLE, bindingLighting.titleLighting1.text)
            showLightingIntent.putExtra(CATEGORY_NAME_LIGHTING, CATEGORY_LIGHTING_TYPES_OF_LAMPS)
            startActivity(showLightingIntent)

        }
        bindingLighting.layoutLightingPosition2.setOnClickListener {
            showLightingIntent.putExtra(ACTION_BAR_TITLE, bindingLighting.titleLighting2.text)
            showLightingIntent.putExtra(CATEGORY_NAME_LIGHTING, CATEGORY_LIGHTING_TYPES_OF_BASES)
            startActivity(showLightingIntent)

        }
        bindingLighting.layoutLightingPosition3.setOnClickListener {
            showLightingIntent.putExtra(ACTION_BAR_TITLE, bindingLighting.titleLighting3.text)
            showLightingIntent.putExtra(CATEGORY_NAME_LIGHTING, CATEGORY_LIGHTING_LUMEN_AND_LUX)
            startActivity(showLightingIntent)

        }
        bindingLighting.layoutLightingPosition4.setOnClickListener {
            showLightingIntent.putExtra(ACTION_BAR_TITLE, bindingLighting.titleLighting4.text)
            showLightingIntent.putExtra(
                CATEGORY_NAME_LIGHTING, CATEGORY_LIGHTING_COLORFUL_TEMPERATURE
            )
            startActivity(showLightingIntent)

        }
        bindingLighting.layoutLightingPosition5.setOnClickListener {
            showLightingIntent.putExtra(ACTION_BAR_TITLE, bindingLighting.titleLighting5.text)
            showLightingIntent.putExtra(CATEGORY_NAME_LIGHTING, CATEGORY_LIGHTING_LED)
            startActivity(showLightingIntent)

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