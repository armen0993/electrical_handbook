package com.electrical.myapplication.theory.electrical_measuring_instruments

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.electrical.myapplication.databinding.ActivityElectricalMeasuringInstrumentsBinding
import com.electrical.myapplication.theory.ACTION_BAR_TITLE


const val CATEGORY_NAME_ELECTROMECHANICAL_CONVERTERS = "Electrical Measuring Instruments name"
const val CATEGORY_VOLT_METER = 600
const val CATEGORY_CURRENT_METER = 601
const val CATEGORY_OHMS_METER = 602
const val CATEGORY_MULTI_METER = 603
const val CATEGORY_CURRENTS_CLAMP = 604
const val CATEGORY_ELECTRIC_METER = 605

class ElectricalMeasuringInstrumentsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val bindingElectricalInstruments =
            ActivityElectricalMeasuringInstrumentsBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(bindingElectricalInstruments.root)


        title = intent.getStringExtra(ACTION_BAR_TITLE)
        val actionBarShow: androidx.appcompat.app.ActionBar? = supportActionBar
        actionBarShow?.apply {
            setHomeButtonEnabled(true)
            setDisplayHomeAsUpEnabled(true)
        }
        val electricalInstrumentsIntent =
            Intent(this, ShowElectricalMeasuringInstrumentsActivity::class.java)
        bindingElectricalInstruments.layoutMeasuringInstrumentsPosition0.setOnClickListener {
            electricalInstrumentsIntent.putExtra(
                ACTION_BAR_TITLE,
                bindingElectricalInstruments.titleMeasuringInstruments0.text
            )
            electricalInstrumentsIntent.putExtra(
                CATEGORY_NAME_ELECTROMECHANICAL_CONVERTERS,
                CATEGORY_VOLT_METER
            )
            startActivity(electricalInstrumentsIntent)
        }
        bindingElectricalInstruments.layoutMeasuringInstrumentsPosition1.setOnClickListener {
            electricalInstrumentsIntent.putExtra(
                ACTION_BAR_TITLE,
                bindingElectricalInstruments.titleMeasuringInstruments1.text
            )
            electricalInstrumentsIntent.putExtra(
                CATEGORY_NAME_ELECTROMECHANICAL_CONVERTERS,
                CATEGORY_CURRENT_METER
            )
            startActivity(electricalInstrumentsIntent)
        }
        bindingElectricalInstruments.layoutMeasuringInstrumentsPosition2.setOnClickListener {
            electricalInstrumentsIntent.putExtra(
                ACTION_BAR_TITLE,
                bindingElectricalInstruments.titleMeasuringInstruments2.text
            )
            electricalInstrumentsIntent.putExtra(
                CATEGORY_NAME_ELECTROMECHANICAL_CONVERTERS,
                CATEGORY_OHMS_METER
            )
            startActivity(electricalInstrumentsIntent)
        }
        bindingElectricalInstruments.layoutMeasuringInstrumentsPosition3.setOnClickListener {
            electricalInstrumentsIntent.putExtra(
                ACTION_BAR_TITLE,
                bindingElectricalInstruments.titleMeasuringInstruments3.text
            )
            electricalInstrumentsIntent.putExtra(
                CATEGORY_NAME_ELECTROMECHANICAL_CONVERTERS,
                CATEGORY_MULTI_METER
            )
            startActivity(electricalInstrumentsIntent)

        }
        bindingElectricalInstruments.layoutMeasuringInstrumentsPosition4.setOnClickListener {
            electricalInstrumentsIntent.putExtra(
                ACTION_BAR_TITLE,
                bindingElectricalInstruments.titleMeasuringInstruments4.text
            )
            electricalInstrumentsIntent.putExtra(
                CATEGORY_NAME_ELECTROMECHANICAL_CONVERTERS,
                CATEGORY_CURRENTS_CLAMP
            )
            startActivity(electricalInstrumentsIntent)

        }
        bindingElectricalInstruments.layoutMeasuringInstrumentsPosition5.setOnClickListener {
            electricalInstrumentsIntent.putExtra(
                ACTION_BAR_TITLE,
                bindingElectricalInstruments.titleMeasuringInstruments5.text
            )
            electricalInstrumentsIntent.putExtra(
                CATEGORY_NAME_ELECTROMECHANICAL_CONVERTERS,
                CATEGORY_ELECTRIC_METER
            )
            startActivity(electricalInstrumentsIntent)

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