package com.electrical.myapplication.theory.power_plants_and_substations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.fragment.app.Fragment
import com.electrical.myapplication.R
import com.electrical.myapplication.databinding.ActivityShowCategorySubstationsBinding
import com.electrical.myapplication.theory.ACTION_BAR_TITLE
import com.electrical.myapplication.theory.laws_and_regulations.CATEGORY_NAME_LAWS

class ShowCategorySubstationsActivity : AppCompatActivity() {
    var savedInstanceStateFragment: Bundle? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        val bindingShowCategorySubstations =
            ActivityShowCategorySubstationsBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(bindingShowCategorySubstations.root)
        savedInstanceStateFragment = savedInstanceState

        val actionBarShow: androidx.appcompat.app.ActionBar? = supportActionBar
        actionBarShow?.apply {
            setHomeButtonEnabled(true)
            setDisplayHomeAsUpEnabled(true)
        }
        when (intent.getIntExtra(CATEGORY_NAME_SUBSTATIONS, 0)) {
            CATEGORY_SUBSTATIONS -> {
                createFragment(ShowSubstationsFragment())
            }
            CATEGORY_NUCLEAR_PLANT -> {
                createFragment(ShowNuclearPlantFragment())
            }
            CATEGORY_THERMAL_POWER_PLANT -> {
                createFragment(ShowThermalPowerPlantFragment())
            }
            CATEGORY_SOLAR_PLANT -> {
                createFragment(ShowSolarPlantFragment())
            }
            CATEGORY_HYDROELECTRIC_PLANT -> {
                createFragment(ShowHydroelectricPlantFragment())
            }
            CATEGORY_WIND_PLANT -> {
                createFragment(ShowWindPlantFragment())
            }
            CATEGORY_GEOTHERMAL_PLANT -> {
                createFragment(ShowGeothermalPlantFragment())
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

    private fun createFragment(newFragment: Fragment) {
        title = intent.getStringExtra(ACTION_BAR_TITLE)
        if (savedInstanceStateFragment == null) {
            supportFragmentManager
                .beginTransaction()
                .add(R.id.fragment_container_substations, newFragment)
                .commit()
        }
    }
    override fun onPause() {
        super.onPause()
        overridePendingTransition(R.anim.right_in, R.anim.left_out)
    }
}