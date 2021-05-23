package com.electrical.myapplication.theory

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.electrical.myapplication.R
import com.electrical.myapplication.databinding.ActivityTheoryBinding

class TheoryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val bindingTheory = ActivityTheoryBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(bindingTheory.root)

        title = resources.getString(R.string.theory)
        val actionBarShow: androidx.appcompat.app.ActionBar? = supportActionBar
        actionBarShow?.apply {
            setHomeButtonEnabled(true)
            setDisplayHomeAsUpEnabled(true)
        }

        val recyclerTheory: RecyclerView = bindingTheory.recyclerTheory
        val listTheory: List<TheoryData> = listOf(
            TheoryData(
                resources.getString(R.string.theory_title_1),
                resources.getString(R.string.theory_description_1),
                R.drawable.ic_theory_volt_currents
            ), TheoryData(
                resources.getString(R.string.theory_title_2),
                resources.getString(R.string.theory_description_2),
                R.drawable.ic_theory_laws
            ),
            TheoryData(
                resources.getString(R.string.theory_title_3),
                "", R.drawable.ic_theory_resistors
            ),
            TheoryData(
                resources.getString(R.string.theory_title_4),
                resources.getString(R.string.theory_description_3),
                R.drawable.ic_theory_light_bulb
            ),
            TheoryData(
                resources.getString(R.string.theory_title_5),
                resources.getString(R.string.theory_description_4),
                R.drawable.ic_theory_cabel
            ),
            TheoryData(
                resources.getString(R.string.theory_title_6), "",
                R.drawable.ic_theory_electrical
            ),
            TheoryData(
                resources.getString(R.string.theory_title_7),
                resources.getString(R.string.theory_description_5),
                R.drawable.ic_theory_ampermeter
            ),
            TheoryData(
                resources.getString(R.string.theory_title_8),
                resources.getString(R.string.theory_description_6),
                R.drawable.ic_theory_electrical_engine
            ),
            TheoryData(
                resources.getString(R.string.theory_title_9),
                resources.getString(R.string.theory_description_7), R.drawable.ic_theory_netral
            ),
            TheoryData(
                resources.getString(R.string.theory_title_10), "",
                R.drawable.ic_theory_short_circuit
            ),
            TheoryData(
                resources.getString(R.string.theory_title_11),
                resources.getString(R.string.theory_description_8),
                R.drawable.ic_theory_circuit_breaker
            ),
            TheoryData(
                resources.getString(R.string.theory_title_12), "",
                R.drawable.ic_theory_ip
            ),
            TheoryData(
                resources.getString(R.string.theory_title_13), "",
                R.drawable.ic_theory_instruments
            ),
            TheoryData(
                resources.getString(R.string.theory_title_14), "",
                R.drawable.ic_theory_sockets
            )
        )

        val adapterTheory = TheoryAdapter(this, listTheory)
        recyclerTheory.adapter = adapterTheory
        recyclerTheory.layoutManager = LinearLayoutManager(this)
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