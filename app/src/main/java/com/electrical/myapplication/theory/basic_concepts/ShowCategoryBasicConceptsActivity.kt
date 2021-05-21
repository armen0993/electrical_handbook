package com.electrical.myapplication.theory.basic_concepts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.fragment.app.Fragment
import com.electrical.myapplication.R
import com.electrical.myapplication.theory.ACTION_BAR_TITLE

class ShowCategoryBasicConceptsActivity : AppCompatActivity() {
    var savedInstanceStateFragment: Bundle? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_category_concepts)
        savedInstanceStateFragment = savedInstanceState

        val actionBarShow: androidx.appcompat.app.ActionBar? = supportActionBar
        actionBarShow?.apply {
            setHomeButtonEnabled(true)
            setDisplayHomeAsUpEnabled(true)
        }

        when (intent.getIntExtra(CATEGORY_NAME_CONCEPTS, 0)) {
            101 -> {
                createFragment(ShowVoltageFragment())
            }
            102 -> {
                createFragment(ShowCurrentFragment())
            }
            103 -> {
                createFragment(ShowResistanceFragment())
            }
            104 -> {
                createFragment(ShowPowerFragment())
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
                .add(R.id.container_show_category, newFragment)
                .commit()
        }
    }
}
