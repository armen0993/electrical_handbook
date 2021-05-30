package com.electrical.myapplication.theory.power_plants_and_substations

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.view.MenuItem
import com.electrical.myapplication.R
import com.electrical.myapplication.databinding.ActivitySubstationsBinding
import com.electrical.myapplication.theory.ACTION_BAR_TITLE

const val CATEGORY_NAME_SUBSTATIONS = "Power plants and substation"
const val CATEGORY_SUBSTATIONS = 300
const val CATEGORY_NUCLEAR_PLANT = 301
const val CATEGORY_THERMAL_POWER_PLANT = 302
const val CATEGORY_SOLAR_PLANT = 303
const val CATEGORY_HYDROELECTRIC_PLANT = 304
const val CATEGORY_WIND_PLANT = 305
const val CATEGORY_GEOTHERMAL_PLANT = 306

class Substations : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val bindingSubstations = ActivitySubstationsBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(bindingSubstations.root)


        val showCategorySubstationsIntent =
            Intent(this, ShowCategorySubstationsActivity::class.java)

        title = intent.getStringExtra(ACTION_BAR_TITLE)
        val actionBarShow: androidx.appcompat.app.ActionBar? = supportActionBar
        actionBarShow?.apply {
            setHomeButtonEnabled(true)
            setDisplayHomeAsUpEnabled(true)
        }



        bindingSubstations.substationsPosition0.setOnClickListener {
            showCategorySubstationsIntent.putExtra(
                ACTION_BAR_TITLE,
                bindingSubstations.titleSubstationsPlant.text
            )
            showCategorySubstationsIntent.putExtra(CATEGORY_NAME_SUBSTATIONS, CATEGORY_SUBSTATIONS)
            startActivity(showCategorySubstationsIntent)
        }
        bindingSubstations.substationsPosition1.setOnClickListener {
            showCategorySubstationsIntent.putExtra(
                ACTION_BAR_TITLE,
                bindingSubstations.titleSubstationsNuclearPlant.text
            )
            showCategorySubstationsIntent.putExtra(
                CATEGORY_NAME_SUBSTATIONS,
                CATEGORY_NUCLEAR_PLANT
            )
            startActivity(showCategorySubstationsIntent)
        }
        bindingSubstations.substationsPosition2.setOnClickListener {
            showCategorySubstationsIntent.putExtra(
                ACTION_BAR_TITLE,
                bindingSubstations.titleSubstationsThermalPowerPlant.text
            )
            showCategorySubstationsIntent.putExtra(
                CATEGORY_NAME_SUBSTATIONS,
                CATEGORY_THERMAL_POWER_PLANT
            )
            startActivity(showCategorySubstationsIntent)
        }
        bindingSubstations.substationsPosition3.setOnClickListener {
            showCategorySubstationsIntent.putExtra(
                ACTION_BAR_TITLE,
                bindingSubstations.titleSubstationsSolarPlant.text
            )
            showCategorySubstationsIntent.putExtra(CATEGORY_NAME_SUBSTATIONS, CATEGORY_SOLAR_PLANT)
            startActivity(showCategorySubstationsIntent)
        }
        bindingSubstations.substationsPosition4.setOnClickListener {
            showCategorySubstationsIntent.putExtra(
                ACTION_BAR_TITLE,
                bindingSubstations.titleSubstationsHydroelectricPlant.text
            )
            showCategorySubstationsIntent.putExtra(
                CATEGORY_NAME_SUBSTATIONS,
                CATEGORY_HYDROELECTRIC_PLANT
            )
            startActivity(showCategorySubstationsIntent)
        }
        bindingSubstations.substationsPosition5.setOnClickListener {
            showCategorySubstationsIntent.putExtra(
                ACTION_BAR_TITLE,
                bindingSubstations.titleSubstationsWindPlant.text
            )
            showCategorySubstationsIntent.putExtra(CATEGORY_NAME_SUBSTATIONS, CATEGORY_WIND_PLANT)
            startActivity(showCategorySubstationsIntent)
        }
        bindingSubstations.substationsPosition6.setOnClickListener {
            showCategorySubstationsIntent.putExtra(
                ACTION_BAR_TITLE,
                bindingSubstations.titleSubstationsGeothermalPlant.text
            )
            showCategorySubstationsIntent.putExtra(
                CATEGORY_NAME_SUBSTATIONS,
                CATEGORY_GEOTHERMAL_PLANT
            )
            startActivity(showCategorySubstationsIntent)
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