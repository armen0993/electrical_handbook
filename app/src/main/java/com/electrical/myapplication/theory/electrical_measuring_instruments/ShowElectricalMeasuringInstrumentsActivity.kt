package com.electrical.myapplication.theory.electrical_measuring_instruments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.fragment.app.Fragment
import com.electrical.myapplication.R
import com.electrical.myapplication.theory.ACTION_BAR_TITLE


class ShowElectricalMeasuringInstrumentsActivity : AppCompatActivity() {
    private var savedInstanceStateFragment: Bundle? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_electrical_measuring_instruments)
        savedInstanceStateFragment = savedInstanceState

        val actionBarShow: androidx.appcompat.app.ActionBar? = supportActionBar
        actionBarShow?.apply {
            setHomeButtonEnabled(true)
            setDisplayHomeAsUpEnabled(true)
        }
        when (intent.getIntExtra(
            CATEGORY_NAME_ELECTROMECHANICAL_CONVERTERS,
            0
        )) {
            CATEGORY_VOLT_METER -> {
                createFragment(ShowVoltMeterFragment())
            }
            CATEGORY_CURRENT_METER -> {
                createFragment(ShowCurrentMeterFragment())
            }
            CATEGORY_OHMS_METER -> {
                createFragment(ShowOhmsMeterFragment())
            }
            CATEGORY_MULTI_METER -> {
                createFragment(ShowMultiMeterFragment())
            }
            CATEGORY_CURRENTS_CLAMP -> {
                createFragment(ShowCurrentsClampFragment())
            }
            CATEGORY_ELECTRIC_METER -> {
                createFragment(ShowElectricMeterFragment())
            }
        }
    }

    private fun createFragment(newFragment: Fragment) {
        title = intent.getStringExtra(ACTION_BAR_TITLE)
        if (savedInstanceStateFragment == null) {
            supportFragmentManager
                .beginTransaction()
                .add(R.id.fragment_container_electrical_measuring_instruments, newFragment)
                .commit()
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
        overridePendingTransition(R.anim.right_in, R.anim.left_out)
    }
}