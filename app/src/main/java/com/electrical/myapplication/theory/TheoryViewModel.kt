package com.electrical.myapplication.theory


import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.electrical.myapplication.R

class TheoryViewModel : ViewModel() {

    private val _dataListTheory = MutableLiveData<List<TheoryData>>()
    val dataListTheory: LiveData<List<TheoryData>> = _dataListTheory

    fun createDataListTheory(context: Context) {

        val listDataTheory = listOf(
            TheoryData(
                context.resources.getString(R.string.theory_title_1),
                context.resources.getString(R.string.theory_description_1),
                R.drawable.ic_theory_volt_currents
            ), TheoryData(
                context.resources.getString(R.string.theory_title_2),
                context.resources.getString(R.string.theory_description_2),
                R.drawable.ic_theory_laws
            ),
            TheoryData(
                context.resources.getString(R.string.theory_title_3),
                "", R.drawable.ic_theory_resistors
            ),
            TheoryData(
                context.resources.getString(R.string.theory_title_4),
                context.resources.getString(R.string.theory_description_3),
                R.drawable.ic_theory_light_bulb
            ),
            TheoryData(
                context.resources.getString(R.string.theory_title_5),
                context.resources.getString(R.string.theory_description_4),
                R.drawable.ic_theory_cabel
            ),
            TheoryData(
                context.resources.getString(R.string.theory_title_6), "",
                R.drawable.ic_theory_electrical
            ),
            TheoryData(
                context.resources.getString(R.string.theory_title_7),
                context.resources.getString(R.string.theory_description_5),
                R.drawable.ic_theory_ampermeter
            ),
            TheoryData(
                context.resources.getString(R.string.theory_title_8),
                context.resources.getString(R.string.theory_description_6),
                R.drawable.ic_theory_electrical_engine
            ),
            TheoryData(
                context.resources.getString(R.string.theory_title_9),
                context.resources.getString(R.string.theory_description_7),
                R.drawable.ic_theory_netral
            ),
            TheoryData(
                context.resources.getString(R.string.theory_title_10), "",
                R.drawable.ic_theory_short_circuit
            ),
            TheoryData(
                context.resources.getString(R.string.theory_title_11),
                context.resources.getString(R.string.theory_description_8),
                R.drawable.ic_theory_circuit_breaker
            ),
            TheoryData(
                context.resources.getString(R.string.theory_title_12), "",
                R.drawable.ic_theory_ip
            ),
            TheoryData(
                context.resources.getString(R.string.theory_title_13), "",
                R.drawable.ic_theory_instruments
            ),
            TheoryData(
                context.resources.getString(R.string.theory_title_14), "",
                R.drawable.ic_theory_sockets
            )
        )

        _dataListTheory.postValue(listDataTheory)
    }
}