package com.electrical.myapplication.theory.protection_and_automation_devices

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.electrical.myapplication.R
import com.electrical.myapplication.databinding.ActivityProtectionAndAutomationDevicesBinding

import com.electrical.myapplication.theory.ACTION_BAR_TITLE

const val CATEGORY_NAME_PROTECTION_DEVICES = "Protection and Automation devices"
const val CATEGORY_PROTECTION_AUTOMATIC_BREAKER = 1000
const val CATEGORY_PROTECTION_RESIDUAL_CURRENT_DEVICE = 1001
const val CATEGORY_PROTECTION_DIFFERENTIAL_AUTOMATIC = 1002
const val CATEGORY_PROTECTION_SURGE_DEVICE = 1003
const val CATEGORY_PROTECTION_VOLTAGE_RELAY = 1004
const val CATEGORY_PROTECTION_MAGNETIC_CONTROLLER = 1005
const val CATEGORY_PROTECTION_FUSE = 1006

class ProtectionAndAutomationDevicesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val bindingProtectionDevices =
            ActivityProtectionAndAutomationDevicesBinding.inflate(layoutInflater)
        setContentView(bindingProtectionDevices.root)

        title = intent.getStringExtra(ACTION_BAR_TITLE)
        val actionBarShow: androidx.appcompat.app.ActionBar? = supportActionBar
        actionBarShow?.apply {
            setHomeButtonEnabled(true)
            setDisplayHomeAsUpEnabled(true)
        }

        val showCategoryProtection =
            Intent(this, ShowCategoryProtectionAndAutomationDevicesActivity::class.java)

        bindingProtectionDevices.layoutProtectionDevicesPosition0.setOnClickListener {
            showCategoryProtection.putExtra(
                ACTION_BAR_TITLE,
                bindingProtectionDevices.titleProtectionDevices0.text
            )
            showCategoryProtection.putExtra(
                CATEGORY_NAME_PROTECTION_DEVICES,
                CATEGORY_PROTECTION_AUTOMATIC_BREAKER
            )
            startActivity(showCategoryProtection)
        }
        bindingProtectionDevices.layoutProtectionDevicesPosition1.setOnClickListener {
            showCategoryProtection.putExtra(
                ACTION_BAR_TITLE,
                bindingProtectionDevices.titleProtectionDevices1.text
            )
            showCategoryProtection.putExtra(
                CATEGORY_NAME_PROTECTION_DEVICES,
                CATEGORY_PROTECTION_RESIDUAL_CURRENT_DEVICE
            )
            startActivity(showCategoryProtection)
        }
        bindingProtectionDevices.layoutProtectionDevicesPosition2.setOnClickListener {
            showCategoryProtection.putExtra(
                ACTION_BAR_TITLE,
                bindingProtectionDevices.titleProtectionDevices2.text
            )
            showCategoryProtection.putExtra(
                CATEGORY_NAME_PROTECTION_DEVICES,
                CATEGORY_PROTECTION_DIFFERENTIAL_AUTOMATIC
            )
            startActivity(showCategoryProtection)
        }
        bindingProtectionDevices.layoutProtectionDevicesPosition3.setOnClickListener {
            showCategoryProtection.putExtra(
                ACTION_BAR_TITLE,
                bindingProtectionDevices.titleProtectionDevices3.text
            )
            showCategoryProtection.putExtra(
                CATEGORY_NAME_PROTECTION_DEVICES,
                CATEGORY_PROTECTION_SURGE_DEVICE
            )
            startActivity(showCategoryProtection)
        }
        bindingProtectionDevices.layoutProtectionDevicesPosition4.setOnClickListener {
            showCategoryProtection.putExtra(
                ACTION_BAR_TITLE,
                bindingProtectionDevices.titleProtectionDevices4.text
            )
            showCategoryProtection.putExtra(
                CATEGORY_NAME_PROTECTION_DEVICES,
                CATEGORY_PROTECTION_VOLTAGE_RELAY
            )
            startActivity(showCategoryProtection)
        }
        bindingProtectionDevices.layoutProtectionDevicesPosition5.setOnClickListener {
            showCategoryProtection.putExtra(
                ACTION_BAR_TITLE,
                bindingProtectionDevices.titleProtectionDevices5.text
            )
            showCategoryProtection.putExtra(
                CATEGORY_NAME_PROTECTION_DEVICES,
                CATEGORY_PROTECTION_MAGNETIC_CONTROLLER
            )
            startActivity(showCategoryProtection)
        }
        bindingProtectionDevices.layoutProtectionDevicesPosition6.setOnClickListener {
            showCategoryProtection.putExtra(
                ACTION_BAR_TITLE,
                bindingProtectionDevices.titleProtectionDevices6.text
            )
            showCategoryProtection.putExtra(
                CATEGORY_NAME_PROTECTION_DEVICES,
                CATEGORY_PROTECTION_FUSE
            )
            startActivity(showCategoryProtection)
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