package com.electrical.myapplication.theory

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.electrical.myapplication.R
import com.electrical.myapplication.databinding.ActivityTheoryBinding

class TheoryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val bindingTheory = ActivityTheoryBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(bindingTheory.root)

        val recyclerTheory: RecyclerView = bindingTheory.recyclerTheory
        val listTheory: List<TheoryData> = listOf(
            TheoryData(
                "Базовые понятия",
                ".Напряжение\n.Ток\n.Сопративление\n.Мощность", R.drawable.ic_volt_currents
            )
        )


        val adapterTheory = TheoryAdapter(this, listTheory)
        recyclerTheory.adapter = adapterTheory
        recyclerTheory.layoutManager = LinearLayoutManager(this)
    }
}