package com.electrical.myapplication.theory.electromechanical_converters

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.electrical.myapplication.R
import com.electrical.myapplication.databinding.ActivityElectromechanicalConvertersBinding
import com.electrical.myapplication.theory.ACTION_BAR_TITLE

const val CATEGORY_NAME_ELECTROMECHANICAL_CONVERTERS = "Electromechanical Converters name"
const val CATEGORY_TRANSFORMER = 700
const val CATEGORY_ELECTRICAL_ENGINE = 701
const val CATEGORY_GENERATOR = 702


class ElectromechanicalConvertersActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val bindingElectromechanicalConverters =
            ActivityElectromechanicalConvertersBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(bindingElectromechanicalConverters.root)

        title = intent.getStringExtra(ACTION_BAR_TITLE)
        val actionBarShow: androidx.appcompat.app.ActionBar? = supportActionBar
        actionBarShow?.apply {
            setHomeButtonEnabled(true)
            setDisplayHomeAsUpEnabled(true)
        }
        val showElectromechanicalConvertersIntent = Intent(this, ShowCategoryConverters::class.java)

        bindingElectromechanicalConverters.layoutElectromechanicalConvertersPosition0.setOnClickListener {
            showElectromechanicalConvertersIntent.putExtra(
                ACTION_BAR_TITLE,
                bindingElectromechanicalConverters.titleElectromechanicalConverters0.text
            )
            showElectromechanicalConvertersIntent.putExtra(
                CATEGORY_NAME_ELECTROMECHANICAL_CONVERTERS, CATEGORY_TRANSFORMER
            )
            startActivity(showElectromechanicalConvertersIntent)
            overridePendingTransition(R.anim.right_in, R.anim.left_out)

        }
        bindingElectromechanicalConverters.layoutElectromechanicalConvertersPosition1.setOnClickListener {
            showElectromechanicalConvertersIntent.putExtra(
                ACTION_BAR_TITLE,
                bindingElectromechanicalConverters.titleElectromechanicalConverters1.text
            )
            showElectromechanicalConvertersIntent.putExtra(
                CATEGORY_NAME_ELECTROMECHANICAL_CONVERTERS, CATEGORY_ELECTRICAL_ENGINE
            )
            startActivity(showElectromechanicalConvertersIntent)
        }
        bindingElectromechanicalConverters.layoutElectromechanicalConvertersPosition2.setOnClickListener {
            showElectromechanicalConvertersIntent.putExtra(
                ACTION_BAR_TITLE,
                bindingElectromechanicalConverters.titleElectromechanicalConverters2.text
            )
            showElectromechanicalConvertersIntent.putExtra(
                CATEGORY_NAME_ELECTROMECHANICAL_CONVERTERS, CATEGORY_GENERATOR
            )
            startActivity(showElectromechanicalConvertersIntent)
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