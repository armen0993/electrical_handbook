package com.electrical.myapplication.theory.lighting

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.view.MenuItem
import androidx.fragment.app.Fragment
import com.electrical.myapplication.R
import com.electrical.myapplication.theory.ACTION_BAR_TITLE


class ShowCategoryLighting : AppCompatActivity() {
   private var savedInstanceStateFragment: Bundle? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_category_lighting)

        savedInstanceStateFragment = savedInstanceState

        val actionBarShow: androidx.appcompat.app.ActionBar? = supportActionBar
        actionBarShow?.apply {
            setHomeButtonEnabled(true)
            setDisplayHomeAsUpEnabled(true)
        }
        when (intent.getIntExtra(CATEGORY_NAME_LIGHTING, 0)) {
            CATEGORY_LIGHTING_INCANDESCENT_LAMP -> {
                createFragment(ShowIncandescentLampFragment())
            }
            CATEGORY_LIGHTING_TYPES_OF_LAMPS -> {
                createFragment(ShowTypesOfLampsFragment())
            }
            CATEGORY_LIGHTING_TYPES_OF_BASES -> {
                createFragment(ShowTypesOfBasesFragment())
            }
            CATEGORY_LIGHTING_LUMEN_AND_LUX -> {
                createFragment(ShowLumenAndLuxFragment())
            }
            CATEGORY_LIGHTING_COLORFUL_TEMPERATURE -> {
                createFragment(ShowColorfulTemperatureFragment())
            }
            CATEGORY_LIGHTING_LED -> {
                createFragment(ShowLedFragment())
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
                .add(R.id.fragment_container_lighting, newFragment)
                .commit()
        }
    }

    override fun onPause() {
        super.onPause()
        overridePendingTransition(R.anim.right_in, R.anim.left_out)
    }
}