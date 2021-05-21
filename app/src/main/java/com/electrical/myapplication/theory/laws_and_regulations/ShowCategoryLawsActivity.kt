package com.electrical.myapplication.theory.laws_and_regulations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.fragment.app.Fragment
import com.electrical.myapplication.R
import com.electrical.myapplication.theory.ACTION_BAR_TITLE


class ShowCategoryLawsActivity : AppCompatActivity() {
    var savedInstanceStateFragment: Bundle? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_category_laws)
        savedInstanceStateFragment = savedInstanceState

        val actionBarShow: androidx.appcompat.app.ActionBar? = supportActionBar
        actionBarShow?.apply {
            setHomeButtonEnabled(true)
            setDisplayHomeAsUpEnabled(true)
        }

        when (intent.getIntExtra(CATEGORY_NAME_LAWS, 0)) {
            CATEGORY_LAWS_OHM -> {
                createFragment(ShowOhmFragment())
            }
            CATEGORY_LAWS_KIRCHHOFF -> {
                createFragment(ShowKirchhoffFragment())
            }
            CATEGORY_LAWS_JOULE -> {
                createFragment(ShowJouleFragment())
            }
            CATEGORY_LAWS_COULOMB -> {
                createFragment(ShowCoulombFragment())
            }
            CATEGORY_LAWS_RIGHT -> {
                createFragment(ShowLawsRightFragment())
            }
            CATEGORY_LAWS_LEFT -> {
                title = intent.getStringExtra(ACTION_BAR_TITLE)
                createFragment(ShowLawsLeftFragment())
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
                .add(R.id.laws_show_container, newFragment)
                .commit()
        }
    }
}