package com.electrical.myapplication.theory.electromechanical_converters

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.fragment.app.Fragment
import com.electrical.myapplication.R
import com.electrical.myapplication.theory.ACTION_BAR_TITLE
import com.electrical.myapplication.theory.laws_and_regulations.CATEGORY_NAME_LAWS

class ShowCategoryConverters : AppCompatActivity() {
    var savedInstanceStateFragment: Bundle? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_category_converters)
        savedInstanceStateFragment = savedInstanceState

        val actionBarShow: androidx.appcompat.app.ActionBar? = supportActionBar
        actionBarShow?.apply {
            setHomeButtonEnabled(true)
            setDisplayHomeAsUpEnabled(true)
        }

        when (intent.getIntExtra(CATEGORY_NAME_ELECTROMECHANICAL_CONVERTERS, 0)) {
            CATEGORY_TRANSFORMER -> {
                createFragment(ShowTransformerFragment())
            }
            CATEGORY_ELECTRICAL_ENGINE -> {
                createFragment(ShowElectricalEngineFragment())
            }
            CATEGORY_GENERATOR -> {
                createFragment(ShowElectricalGeneratorFragment())
            }
        }
    }

    private fun createFragment(newFragment: Fragment) {
        title = intent.getStringExtra(ACTION_BAR_TITLE)
        if (savedInstanceStateFragment == null) {
            supportFragmentManager
                .beginTransaction()
                .add(R.id.fragment_container_el_converters, newFragment)
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
}