package com.electrical.myapplication.theory.protection_and_automation_devices

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.fragment.app.Fragment
import com.electrical.myapplication.R
import com.electrical.myapplication.theory.ACTION_BAR_TITLE


class ShowCategoryProtectionAndAutomationDevicesActivity : AppCompatActivity() {
    private var savedInstanceStateFragment: Bundle? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_category_protection_and_automation_devices)

        savedInstanceStateFragment = savedInstanceState

        val actionBarShow: androidx.appcompat.app.ActionBar? = supportActionBar
        actionBarShow?.apply {
            setHomeButtonEnabled(true)
            setDisplayHomeAsUpEnabled(true)
        }
        when (intent.getIntExtra(CATEGORY_NAME_PROTECTION_DEVICES, 0)) {
            CATEGORY_PROTECTION_AUTOMATIC_BREAKER -> {
                createFragment(ShowAutomaticBreakerFragment())
            }
            CATEGORY_PROTECTION_RESIDUAL_CURRENT_DEVICE -> {
                createFragment(ShowResidualCurrentDeviceFragment())
            }
            CATEGORY_PROTECTION_DIFFERENTIAL_AUTOMATIC -> {
                createFragment(ShowDifferentialAutomaticFragment())
            }
            CATEGORY_PROTECTION_SURGE_DEVICE -> {
                createFragment(ShowSurgeDeviceFragment())
            }
            CATEGORY_PROTECTION_VOLTAGE_RELAY -> {
                createFragment(ShowVoltageRelayFragment())
            }
            CATEGORY_PROTECTION_MAGNETIC_CONTROLLER -> {
                createFragment(ShowMagneticControllerFragment())
            }
            CATEGORY_PROTECTION_FUSE -> {
                createFragment(ShowFuseFragment())
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
                .add(R.id.fragment_container_protection_devices, newFragment)
                .commit()
        }
    }

    override fun onPause() {
        super.onPause()
        overridePendingTransition(R.anim.right_in, R.anim.left_out)
    }
}
