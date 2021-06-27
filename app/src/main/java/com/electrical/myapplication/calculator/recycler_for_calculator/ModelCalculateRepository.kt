package com.electrical.myapplication.calculator.recycler_for_calculator

import com.electrical.myapplication.R

class ModelCalculateRepository : DataCalculateRepository {


    override fun getData(): List<CalculatorModelData> {
        return listOf(
            CalculatorModelData("Вибор сечения провода", R.drawable.ic_cable_4),
            CalculatorModelData(
                "Вибор автоматического выключателя",
                R.drawable.ic_protection_devices
            )

        )
    }


}