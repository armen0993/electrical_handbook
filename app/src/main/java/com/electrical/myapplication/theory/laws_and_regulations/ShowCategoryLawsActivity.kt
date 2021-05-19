package com.electrical.myapplication.theory.laws_and_regulations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.electrical.myapplication.R
import com.electrical.myapplication.theory.ACTION_BAR_TITLE


class ShowCategoryLawsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_category_laws)


        val actionBarShow: androidx.appcompat.app.ActionBar? = supportActionBar
        actionBarShow?.apply {
            setHomeButtonEnabled(true)
            setDisplayHomeAsUpEnabled(true)
        }

        when(intent.getIntExtra(CATEGORY_NAME_LAWS,0)){

            CATEGORY_LAWS_OHM->{
                title = intent.getStringExtra(ACTION_BAR_TITLE)
                supportFragmentManager
                    .beginTransaction()
                    .add(R.id.laws_show_container,ShowOhmFragment())
                    .commit()

            }
            CATEGORY_LAWS_KIRCHHOFF->{
                title = intent.getStringExtra(ACTION_BAR_TITLE)
                supportFragmentManager
                    .beginTransaction()
                    .add(R.id.laws_show_container,ShowKirchhoffFragment())
                    .commit()
            }
            CATEGORY_LAWS_JOULE->{
                title = intent.getStringExtra(ACTION_BAR_TITLE)
                supportFragmentManager
                    .beginTransaction()
                    .add(R.id.laws_show_container,ShowJouleFragment())
                    .commit()
            }
            CATEGORY_LAWS_COULOMB->{
                title = intent.getStringExtra(ACTION_BAR_TITLE)
                supportFragmentManager
                    .beginTransaction()
                    .add(R.id.laws_show_container,ShowCoulombFragment())
                    .commit()
            }
            CATEGORY_LAWS_RIGHT->{
                title = intent.getStringExtra(ACTION_BAR_TITLE)
                supportFragmentManager
                    .beginTransaction()
                    .add(R.id.laws_show_container,ShowLawsRightFragment())
                    .commit()
            }
            CATEGORY_LAWS_LEFT->{
                title = intent.getStringExtra(ACTION_BAR_TITLE)
                supportFragmentManager
                    .beginTransaction()
                    .add(R.id.laws_show_container,ShowLawsLeftFragment())
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