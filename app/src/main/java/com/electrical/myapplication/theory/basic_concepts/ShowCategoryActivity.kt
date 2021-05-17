package com.electrical.myapplication.theory.basic_concepts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.electrical.myapplication.R
import com.electrical.myapplication.theory.ACTION_BAR_TITLE

class ShowCategoryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_category_concepts)

        title = intent.getStringExtra(ACTION_BAR_TITLE)
        val actionBarShow: androidx.appcompat.app.ActionBar? = supportActionBar
        actionBarShow?.apply {
            setHomeButtonEnabled(true)
            setDisplayHomeAsUpEnabled(true)
        }

        when (intent.getIntExtra(CATEGORY_NAME, 0)) {
            101 -> {
                title = intent.getStringExtra(ACTION_BAR_TITLE)
                actionBarShow?.apply {
                    setHomeButtonEnabled(true)
                    setDisplayHomeAsUpEnabled(true)
                }
                supportFragmentManager
                    .beginTransaction()
                    .add(R.id.container_show_category, ShowVoltageFragment())
                    .commit()
            }
            102 -> {
                title = intent.getStringExtra(ACTION_BAR_TITLE)
                actionBarShow?.apply {
                    setHomeButtonEnabled(true)
                    setDisplayHomeAsUpEnabled(true)
                }
                supportFragmentManager
                    .beginTransaction()
                    .add(R.id.container_show_category, ShowCurrentFragment())
                    .commit()
            }
            103 -> {
                title = intent.getStringExtra(ACTION_BAR_TITLE)
                actionBarShow?.apply {
                    setHomeButtonEnabled(true)
                    setDisplayHomeAsUpEnabled(true)
                }
                supportFragmentManager
                    .beginTransaction()
                    .add(R.id.container_show_category, ShowResistanceFragment())
                    .commit()
            }
            104 -> {
                title = intent.getStringExtra(ACTION_BAR_TITLE)
                actionBarShow?.apply {
                    setHomeButtonEnabled(true)
                    setDisplayHomeAsUpEnabled(true)
                }
                supportFragmentManager
                    .beginTransaction()
                    .add(R.id.container_show_category, ShowPowerFragment())
                    .commit()
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
}
