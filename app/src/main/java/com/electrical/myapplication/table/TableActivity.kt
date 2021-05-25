package com.electrical.myapplication.table

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import com.electrical.myapplication.R
import com.electrical.myapplication.databinding.ActivityTableBinding
import com.electrical.myapplication.theory.ACTION_BAR_TITLE

class TableActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val tableBinding = ActivityTableBinding.inflate(layoutInflater)
        setContentView(tableBinding.root)

        title = intent.getStringExtra(ACTION_BAR_TITLE)
        val actionBarShow: androidx.appcompat.app.ActionBar? = supportActionBar
        actionBarShow?.apply {
            setHomeButtonEnabled(true)
            setDisplayHomeAsUpEnabled(true)
        }


        val recyclerTable = tableBinding.recyclerTable
        val tableList= listOf(
            TableData("name",R.drawable.ic_basic_concepts_i)
        )
        val adapterTable = TableAdapter(this,tableList)
        recyclerTable.adapter = adapterTable
        recyclerTable.layoutManager = LinearLayoutManager(this)
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