package com.electrical.myapplication.theory.earthing_systems

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.fragment.app.Fragment
import com.electrical.myapplication.R
import com.electrical.myapplication.theory.ACTION_BAR_TITLE


class ShowCategoryEarthingSystemsActivity : AppCompatActivity() {
    private var savedInstanceStateFragment: Bundle? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_category_eathing_systems)
        savedInstanceStateFragment = savedInstanceState


        val actionBarShow: androidx.appcompat.app.ActionBar? = supportActionBar
        actionBarShow?.apply {
            setHomeButtonEnabled(true)
            setDisplayHomeAsUpEnabled(true)
        }
        when (intent.getIntExtra(CATEGORY_NAME_EARTHING_SYSTEM, 0)) {
            CATEGORY_EARTHING_SYSTEM -> {
                createFragment(ShowEarthingSystemsFragment())
            }
            CATEGORY_POTENTIAL_CONTROL_SYSTEMS -> {
                createFragment(ShowPotentialControlSystemsFragment())
            }
        }
    }


    private fun createFragment(newFragment: Fragment) {
        title = intent.getStringExtra(ACTION_BAR_TITLE)
        if (savedInstanceStateFragment == null) {
            supportFragmentManager
                .beginTransaction()
                .add(R.id.fragment_container_earthing_systems, newFragment)
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