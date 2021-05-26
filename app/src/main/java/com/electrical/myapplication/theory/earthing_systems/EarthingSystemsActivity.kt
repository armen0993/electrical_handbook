package com.electrical.myapplication.theory.earthing_systems

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.electrical.myapplication.R
import com.electrical.myapplication.databinding.ActivityEarthingSystemsBinding
import com.electrical.myapplication.theory.ACTION_BAR_TITLE


const val CATEGORY_NAME_EARTHING_SYSTEM = "Earthing Systems name"
const val CATEGORY_EARTHING_SYSTEM = 800
const val CATEGORY_POTENTIAL_CONTROL_SYSTEMS = 801

class EarthingSystemsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val bindingEarthingSystems = ActivityEarthingSystemsBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(bindingEarthingSystems.root)

        title = intent.getStringExtra(ACTION_BAR_TITLE)
        val actionBarShow: androidx.appcompat.app.ActionBar? = supportActionBar
        actionBarShow?.apply {
            setHomeButtonEnabled(true)
            setDisplayHomeAsUpEnabled(true)
        }

        val showCategorySystemsIntent = Intent(this, ShowCategoryEarthingSystemsActivity::class.java)

        bindingEarthingSystems.earthingSystemsPosition0.setOnClickListener {
            showCategorySystemsIntent.putExtra(
                ACTION_BAR_TITLE,
                bindingEarthingSystems.titleEarthingSystems0.text
            )
            showCategorySystemsIntent.putExtra(
                CATEGORY_NAME_EARTHING_SYSTEM,
                CATEGORY_EARTHING_SYSTEM
            )
            startActivity(showCategorySystemsIntent)

        }
        bindingEarthingSystems.earthingSystemsPosition1.setOnClickListener {
            showCategorySystemsIntent.putExtra(
                ACTION_BAR_TITLE,
                bindingEarthingSystems.titleEarthingSystems1.text
            )
            showCategorySystemsIntent.putExtra(
                CATEGORY_NAME_EARTHING_SYSTEM,
                CATEGORY_POTENTIAL_CONTROL_SYSTEMS
            )
            startActivity(showCategorySystemsIntent)
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