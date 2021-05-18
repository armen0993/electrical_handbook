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

            }
            CATEGORY_LAWS_JOULE->{

            }
            CATEGORY_LAWS_COULOMB->{

            }
            CATEGORY_LAWS_RIGHT->{

            }
            CATEGORY_LAWS_LEFT->{

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