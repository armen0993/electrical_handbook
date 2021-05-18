package com.electrical.myapplication.theory.basic_concepts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.electrical.myapplication.databinding.ActivityBasicConceptsBinding
import com.electrical.myapplication.theory.ACTION_BAR_TITLE

const val CATEGORY_NAME_CONCEPTS = "Basic Concepts"
const val VOLTAGE_CATEGORY = 101
const val CURRENT_CATEGORY = 102
const val RESISTANCE_CATEGORY = 103
const val POWER_CATEGORY = 104

class BasicConcepts : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val bindingBasicConcepts = ActivityBasicConceptsBinding.inflate(layoutInflater)
        setContentView(bindingBasicConcepts.root)

        val intentShowCategoryConcepts = Intent(this, ShowCategoryActivity::class.java)

        title = intent.getStringExtra(ACTION_BAR_TITLE)
        val actionBarShow: androidx.appcompat.app.ActionBar? = supportActionBar
        actionBarShow?.apply {
            setHomeButtonEnabled(true)
            setDisplayHomeAsUpEnabled(true)
        }

        bindingBasicConcepts.position0.setOnClickListener() {
            intentShowCategoryConcepts.putExtra(
                ACTION_BAR_TITLE,
                bindingBasicConcepts.titleBasicConcepts0.text
            )
            intentShowCategoryConcepts.putExtra(CATEGORY_NAME_CONCEPTS, VOLTAGE_CATEGORY)
            startActivity(intentShowCategoryConcepts)
        }
        bindingBasicConcepts.position1.setOnClickListener() {
            intentShowCategoryConcepts.putExtra(
                ACTION_BAR_TITLE,
                bindingBasicConcepts.titleBasicConcepts1.text
            )
            intentShowCategoryConcepts.putExtra(CATEGORY_NAME_CONCEPTS, CURRENT_CATEGORY)
            startActivity(intentShowCategoryConcepts)
        }
        bindingBasicConcepts.position2.setOnClickListener() {
            intentShowCategoryConcepts.putExtra(
                ACTION_BAR_TITLE,
                bindingBasicConcepts.titleBasicConcepts2.text
            )
            intentShowCategoryConcepts.putExtra(CATEGORY_NAME_CONCEPTS, RESISTANCE_CATEGORY)
            startActivity(intentShowCategoryConcepts)
        }
        bindingBasicConcepts.position3.setOnClickListener() {
            intentShowCategoryConcepts.putExtra(
                ACTION_BAR_TITLE,
                bindingBasicConcepts.titleBasicConcepts3.text
            )
            intentShowCategoryConcepts.putExtra(CATEGORY_NAME_CONCEPTS, POWER_CATEGORY)
            startActivity(intentShowCategoryConcepts)

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