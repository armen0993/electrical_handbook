package com.electrical.myapplication.calculator.recycler_for_calculator

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel


class CalculatorViewModel(private val dataRepository: DataCalculateRepository) : ViewModel() {
    private val _dataCalculate = MutableLiveData<List<CalculatorModelData>>()
    val dataCalculate: LiveData<List<CalculatorModelData>> = _dataCalculate

    fun getDataCalculate() {

        val listData = getDataRepo()

        _dataCalculate.postValue(listData)
    }

    private fun getDataRepo(): List<CalculatorModelData> {

        return dataRepository.getData()

    }
}