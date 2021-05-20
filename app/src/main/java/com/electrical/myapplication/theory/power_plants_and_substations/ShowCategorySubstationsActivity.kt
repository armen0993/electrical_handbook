package com.electrical.myapplication.theory.power_plants_and_substations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.electrical.myapplication.R
import com.electrical.myapplication.databinding.ActivityShowCategorySubstationsBinding
import com.electrical.myapplication.theory.ACTION_BAR_TITLE
import com.electrical.myapplication.theory.laws_and_regulations.CATEGORY_NAME_LAWS

class ShowCategorySubstationsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val bindingShowCategorySubstations =  ActivityShowCategorySubstationsBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(bindingShowCategorySubstations.root)


        val actionBarShow: androidx.appcompat.app.ActionBar? = supportActionBar
        actionBarShow?.apply {
            setHomeButtonEnabled(true)
            setDisplayHomeAsUpEnabled(true)
        }
        val container = R.id.fragment_container_substations

        when (intent.getIntExtra(CATEGORY_NAME_SUBSTATIONS, 0)) {
            CATEGORY_SUBSTATIONS -> {
                title = intent.getStringExtra(ACTION_BAR_TITLE)
                supportFragmentManager
                    .beginTransaction()
                    .add(container, ShowSubstationsFragment())
                    .commit()
            }
            CATEGORY_NUCLEAR_PLANT -> {
                title = intent.getStringExtra(ACTION_BAR_TITLE)
                supportFragmentManager
                    .beginTransaction()
                    .add(container, ShowNuclearPlantFragment())
                    .commit()
            }
            CATEGORY_THERMAL_POWER_PLANT -> {
                title = intent.getStringExtra(ACTION_BAR_TITLE)
                supportFragmentManager
                    .beginTransaction()
                    .add(container, ShowThermalPowerPlantFragment())
                    .commit()
            }
            CATEGORY_SOLAR_PLANT -> {
                title = intent.getStringExtra(ACTION_BAR_TITLE)
                supportFragmentManager
                    .beginTransaction()
                    .add(container, ShowSolarPlantFragment())
                    .commit()
            }
            CATEGORY_HYDROELECTRIC_PLANT -> {
                title = intent.getStringExtra(ACTION_BAR_TITLE)
                supportFragmentManager
                    .beginTransaction()
                    .add(container, ShowSolarPlantFragment())
                    .commit()
            }
            CATEGORY_WIND_PLANT -> {
                title = intent.getStringExtra(ACTION_BAR_TITLE)
                supportFragmentManager
                    .beginTransaction()
                    .add(container, ShowWindPlantFragment())
                    .commit()
            }
            CATEGORY_GEOTHERMAL_PLANT -> {
                title = intent.getStringExtra(ACTION_BAR_TITLE)
                supportFragmentManager
                    .beginTransaction()
                    .add(container, ShowGeothermalPlantFragment())
                    .commit()
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