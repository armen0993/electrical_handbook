package com.electrical.myapplication.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.fragment.app.Fragment
import com.electrical.myapplication.R
import com.electrical.myapplication.calculator.recycler_for_calculator.CATEGORY_CALCULATE_CABLE
import com.electrical.myapplication.calculator.recycler_for_calculator.CATEGORY_CALCULATE_NAME
import com.electrical.myapplication.calculator.selection_of_wire_cross_section.ShowCalculateCableFragment
import com.electrical.myapplication.theory.ACTION_BAR_TITLE

class ShowCalculatorCategoryActivity : AppCompatActivity() {
    private var savedInstanceStateFragment: Bundle? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_calculator_category)
        savedInstanceStateFragment = savedInstanceState


        val actionBarShow: androidx.appcompat.app.ActionBar? = supportActionBar
        actionBarShow?.apply {
            setHomeButtonEnabled(true)
            setDisplayHomeAsUpEnabled(true)
        }
        when (intent.getIntExtra(CATEGORY_CALCULATE_NAME, 0)) {
            CATEGORY_CALCULATE_CABLE -> {
                createFragment(ShowCalculateCableFragment())
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

    override fun onPause() {
        super.onPause()
        overridePendingTransition(R.anim.right_in, R.anim.left_out)
    }

    private fun createFragment(newFragment: Fragment) {
        title = intent.getStringExtra(ACTION_BAR_TITLE)
        if (savedInstanceStateFragment == null) {
            supportFragmentManager
                .beginTransaction()
                .add(R.id.fragment_container_calculate, newFragment)
                .commit()
        }
    }
}