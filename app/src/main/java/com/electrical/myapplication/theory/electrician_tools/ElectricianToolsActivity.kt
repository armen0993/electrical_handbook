package com.electrical.myapplication.theory.electrician_tools

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.electrical.myapplication.R
import com.electrical.myapplication.databinding.ActivityElectricanToolsBinding
import com.electrical.myapplication.theory.ACTION_BAR_TITLE
import com.electrical.myapplication.theory.TheoryAdapter

class ElectricianToolsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val bindingElectricianTools = ActivityElectricanToolsBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(bindingElectricianTools.root)

        title = intent.getStringExtra(ACTION_BAR_TITLE)
        val actionBarShow: androidx.appcompat.app.ActionBar? = supportActionBar
        actionBarShow?.apply {
            setHomeButtonEnabled(true)
            setDisplayHomeAsUpEnabled(true)
        }
        val recyclerElectricianTools: RecyclerView =
            bindingElectricianTools.recyclerElectricianTools
        val listElectricianTools = listOf<ElectricianToolsData>(
            ElectricianToolsData(
                getString(R.string.info_title_electrician_tools),
                getString(R.string.info_description_electrician_tools),
                R.drawable.ic_info_electrician_tools
            ),
            ElectricianToolsData(
                getString(R.string.info_title_electrician_tools_1),
                getString(R.string.info_description_tools_1),
                R.drawable.ic_info_electrician_tools_1
            ),
            ElectricianToolsData(
                getString(R.string.info_title_electrician_tools_2),
                getString(R.string.info_description_electrician_tools_2),
                R.drawable.ic_info_electrician_tools_2
            ),
            ElectricianToolsData(
                getString(R.string.info_title_electrician_tools_3),
                getString(R.string.info_description_electrician_tools_3),
                R.drawable.ic_info_electrician_tools_4
            ),
            ElectricianToolsData(
                getString(R.string.info_title_electrician_tools_4),
                getString(R.string.info_description_electrician_tools_4),
                R.drawable.ic_info_electrician_tools_5
            ),
            ElectricianToolsData(
                getString(R.string.info_title_electrician_tools_5),
                getString(R.string.info_description_electrician_tools_5),
                R.drawable.ic_info_electrician_tools_6
            ),
            ElectricianToolsData(
                getString(R.string.info_title_electrician_tools_6),
                getString(R.string.info_description_electrician_tools_6),
                R.drawable.ic_info_electrician_tools_7
            ),
            ElectricianToolsData(
                getString(R.string.info_title_electrician_tools_7),
                getString(R.string.info_description_electrician_tools_7),
                R.drawable.ic_info_electrician_tools_8
            ),
            ElectricianToolsData(
                getString(R.string.info_title_electrician_tools_8),
                getString(R.string.info_description_electrician_tools_8),
                R.drawable.ic_info_electrician_tools_9
            ),
            ElectricianToolsData(
                getString(R.string.info_title_electrician_tools_9),
                getString(R.string.info_description_electrician_tools_9),
                R.drawable.ic_info_electrician_tools_10
            ),
            ElectricianToolsData(
                getString(R.string.info_title_electrician_tools_10),
                getString(R.string.info_description_electrician_tools_10),
                R.drawable.ic_info_electrician_tools_11
            ),
            ElectricianToolsData(
                getString(R.string.info_title_electrician_tools_11),
                getString(R.string.info_description_electrician_tools_11),
                R.drawable.ic_info_electrician_tools_12
            ),
            ElectricianToolsData(
                getString(R.string.info_title_electrician_tools_12),
                getString(R.string.info_description_electrician_tools_12),
                R.drawable.ic_info_electrician_tools_13
            ),
            ElectricianToolsData(
                getString(R.string.info_title_electrician_tools_13),
                getString(R.string.info_description_electrician_tools_13),
                R.drawable.ic_info_electrician_tools_14
            ),
            ElectricianToolsData(
                getString(R.string.info_title_electrician_tools_14),
                getString(R.string.info_description_electrician_tools_14),
                R.drawable.ic_info_electrician_tools_15
            ),
            ElectricianToolsData(
                getString(R.string.info_title_electrician_tools_15),
                getString(R.string.info_description_electrician_tools_15),
                R.drawable.ic_info_electrician_tools_16
            ),
            ElectricianToolsData(
                getString(R.string.info_title_electrician_tools_16),
                getString(R.string.info_description_electrician_tools_16),
                R.drawable.ic_info_electrician_tools_17
            ),
            ElectricianToolsData(
                getString(R.string.info_title_electrician_tools_17),
                getString(R.string.info_description_electrician_tools_17),
                R.drawable.ic_info_electrician_tools_18
            ),
        )
        val adapterTools = ElectricianToolsAdapter(this, listElectricianTools)
        recyclerElectricianTools.adapter = adapterTools
        recyclerElectricianTools.layoutManager = LinearLayoutManager(this)
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