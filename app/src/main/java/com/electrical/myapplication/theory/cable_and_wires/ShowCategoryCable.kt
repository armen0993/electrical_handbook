package com.electrical.myapplication.theory.cable_and_wires

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.fragment.app.Fragment
import com.electrical.myapplication.R
import com.electrical.myapplication.theory.ACTION_BAR_TITLE
import com.electrical.myapplication.theory.lighting.CATEGORY_LIGHTING_INCANDESCENT_LAMP
import com.electrical.myapplication.theory.lighting.CATEGORY_NAME_LIGHTING
import com.electrical.myapplication.theory.lighting.ShowIncandescentLampFragment

class ShowCategoryCable : AppCompatActivity() {
    private var savedInstanceStateFragment: Bundle? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_category_cable)
        savedInstanceStateFragment = savedInstanceState


        val actionBarShow: androidx.appcompat.app.ActionBar? = supportActionBar
        actionBarShow?.apply {
            setHomeButtonEnabled(true)
            setDisplayHomeAsUpEnabled(true)
        }
        when (intent.getIntExtra(CATEGORY_NAME_CABLE, 0)) {
            CATEGORY_CABLE_CONDUCTOR_COLOR -> {
                createFragment(ShowCableConductorColorFragment())
            }
            CATEGORY_CABLE_DECRYPTION -> {
                createFragment(ShowCableDecryptionFragment())
            }
            CATEGORY_CABLE_TYPES_OF_CABLES -> {
                createFragment(ShowCableTypesFragment())
            }
            CATEGORY_CABLE_CONNECTING_WIRES -> {
                createFragment(ShowCableConnectingWiresFragment())
            }
            CATEGORY_CABLE_SELECTION_OF_SECTION -> {
                createFragment(ShowCableSelectionOfSectionFragment())
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
                .add(R.id.fragment_container_cable, newFragment)
                .commit()
        }
    }

    override fun onPause() {
        super.onPause()
        overridePendingTransition(R.anim.right_in, R.anim.left_out)
    }

}