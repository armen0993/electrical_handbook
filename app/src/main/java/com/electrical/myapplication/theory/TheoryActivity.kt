package com.electrical.myapplication.theory


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.view.MenuItem

import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.electrical.myapplication.R
import com.electrical.myapplication.databinding.ActivityTheoryBinding

class TheoryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val bindingTheory = ActivityTheoryBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(bindingTheory.root)

        title = intent.getStringExtra(ACTION_BAR_TITLE)
        val actionBarShow: androidx.appcompat.app.ActionBar? = supportActionBar
        actionBarShow?.apply {
            setHomeButtonEnabled(true)
            setDisplayHomeAsUpEnabled(true)
        }

        val theoryViewModel = ViewModelProvider(this).get(TheoryViewModel::class.java)
        theoryViewModel.createDataListTheory(this)
        theoryViewModel.dataListTheory.observe(this, {
            val adapterTheory = TheoryAdapter(this, it)
            val recyclerTheory: RecyclerView = bindingTheory.recyclerTheory
            recyclerTheory.adapter = adapterTheory
            recyclerTheory.layoutManager = LinearLayoutManager(this)
        })
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
        overridePendingTransition(
            R.anim.activity_down_up_close_enter,
            R.anim.activity_down_up_close_exit
        )

    }
}