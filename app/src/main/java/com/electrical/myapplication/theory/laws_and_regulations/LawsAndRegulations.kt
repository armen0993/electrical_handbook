package com.electrical.myapplication.theory.laws_and_regulations

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.electrical.myapplication.R
import com.electrical.myapplication.databinding.ActivityLawsAndRegulationsBinding
import com.electrical.myapplication.theory.ACTION_BAR_TITLE
const val CATEGORY_NAME_LAWS = "Laws category name"
const val CATEGORY_LAWS_OHM = 200
const val CATEGORY_LAWS_KIRCHHOFF = 201
const val CATEGORY_LAWS_JOULE = 202
const val CATEGORY_LAWS_COULOMB = 203
const val CATEGORY_LAWS_RIGHT = 204
const val CATEGORY_LAWS_LEFT = 205

class LawsAndRegulations : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        val bindingLaws = ActivityLawsAndRegulationsBinding.inflate(layoutInflater)
        setContentView(bindingLaws.root)

        val lawsShowIntent = Intent(this,ShowCategoryLawsActivity::class.java)

       title = intent.getStringExtra(ACTION_BAR_TITLE)
        val actionBarShow: androidx.appcompat.app.ActionBar? = supportActionBar
        actionBarShow?.apply {
            setHomeButtonEnabled(true)
            setDisplayHomeAsUpEnabled(true)
        }
       bindingLaws.lawsPosition0.setOnClickListener(){
         lawsShowIntent.putExtra(ACTION_BAR_TITLE,bindingLaws.lawsTitleBasicConcepts0.text)
           lawsShowIntent.putExtra(CATEGORY_NAME_LAWS, CATEGORY_LAWS_OHM)
           startActivity(lawsShowIntent)
       }
       bindingLaws.lawsPosition1.setOnClickListener(){
           lawsShowIntent.putExtra(ACTION_BAR_TITLE,bindingLaws.lawsTitleBasicConcepts1.text)
           lawsShowIntent.putExtra(CATEGORY_NAME_LAWS, CATEGORY_LAWS_KIRCHHOFF)
           startActivity(lawsShowIntent)
       }
       bindingLaws.lawsPosition2.setOnClickListener(){
           lawsShowIntent.putExtra(ACTION_BAR_TITLE,bindingLaws.lawsTitleBasicConcepts2.text)
           lawsShowIntent.putExtra(CATEGORY_NAME_LAWS, CATEGORY_LAWS_JOULE)
           startActivity(lawsShowIntent)
       }
       bindingLaws.lawsPosition3.setOnClickListener(){
               lawsShowIntent.putExtra(ACTION_BAR_TITLE,bindingLaws.lawsTitleBasicConcepts3.text)
               lawsShowIntent.putExtra(CATEGORY_NAME_LAWS, CATEGORY_LAWS_COULOMB)
               startActivity(lawsShowIntent)
       }
       bindingLaws.lawsPosition4.setOnClickListener(){
           lawsShowIntent.putExtra(ACTION_BAR_TITLE,bindingLaws.lawsTitleBasicConcepts4.text)
           lawsShowIntent.putExtra(CATEGORY_NAME_LAWS, CATEGORY_LAWS_RIGHT)
           startActivity(lawsShowIntent)
       }
       bindingLaws.lawsPosition5.setOnClickListener(){
           lawsShowIntent.putExtra(ACTION_BAR_TITLE,bindingLaws.lawsTitleBasicConcepts5.text)
           lawsShowIntent.putExtra(CATEGORY_NAME_LAWS, CATEGORY_LAWS_LEFT)
           startActivity(lawsShowIntent)
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