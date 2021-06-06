package com.electrical.myapplication.theory.cable_and_wires

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.electrical.myapplication.R

class CableTypesViewModel : ViewModel() {

    private val _cableTypesLiveData = MutableLiveData<List<CableTypesData>>()
    val cableTypesLiveData: LiveData<List<CableTypesData>> = _cableTypesLiveData


    fun creatingCableTypesData(context: Context) {
        val listDataCableTypes = listOf(
            CableTypesData(
                context.getString(R.string.info_title_cable_types),
                context.getString(R.string.info_description_cable_types),
                R.drawable.info_icon_cable_types
            ),
            CableTypesData(
                context.getString(R.string.info_title_cable_types_1),
                context.getString(R.string.info_description_cable_types_1),
                R.drawable.info_icon_cable_types_1
            ),
            CableTypesData(
                context.getString(R.string.info_title_cable_types_4),
                context.getString(R.string.info_description_cable_types_4),
                R.drawable.info_icon_cable_types_4
            ),
            CableTypesData(
                context.getString(R.string.info_title_cable_types_2),
                context.getString(R.string.info_description_cable_types_2),
                R.drawable.info_icon_cable_types_2
            ),
            CableTypesData(
                context.getString(R.string.info_title_cable_types_3),
                context.getString(R.string.info_description_cable_types_3),
                R.drawable.info_icon_cable_types_3
            ),
            CableTypesData(
                context.getString(R.string.info_title_cable_types_5),
                context.getString(R.string.info_description_cable_types_5),
                R.drawable.info_icon_cable_types_5
            ),
            CableTypesData(
                context.getString(R.string.info_title_cable_types_6),
                context.getString(R.string.info_description_cable_types_6),
                R.drawable.info_icon_cable_types_6
            ),
            CableTypesData(
                context.getString(R.string.info_title_cable_types_7),
                context.getString(R.string.info_description_cable_types_7),
                R.drawable.info_icon_cable_types_7
            ),
            CableTypesData(
                context.getString(R.string.info_title_cable_types_8),
                context.getString(R.string.info_description_cable_types_8),
                R.drawable.info_icon_cable_types_8
            ),
            CableTypesData(
                context.getString(R.string.info_title_cable_types_9),
                context.getString(R.string.info_description_cable_types_9),
                R.drawable.info_icon_cable_types_9
            ),
            CableTypesData(
                context.getString(R.string.info_title_cable_types_10),
                context.getString(R.string.info_description_cable_types_10),
                R.drawable.info_icon_cable_types_10
            ),
            CableTypesData(
                context.getString(R.string.info_title_cable_types_11),
                context.getString(R.string.info_description_cable_types_11),
                R.drawable.info_icon_cable_types_11
            ),
            CableTypesData(
                context.getString(R.string.info_title_cable_types_12),
                context.getString(R.string.info_description_cable_types_12),
                R.drawable.info_icon_cable_types_12
            ),
            CableTypesData(
                context.getString(R.string.info_title_cable_types_13),
                context.getString(R.string.info_description_cable_types_13),
                R.drawable.info_icon_cable_types_13
            ),
            CableTypesData(
                context.getString(R.string.info_title_cable_types_14),
                context.getString(R.string.info_description_cable_types_14),
                R.drawable.info_icon_cable_types_14
            ),
            CableTypesData(
                context.getString(R.string.info_title_cable_types_15),
                context.getString(R.string.info_description_cable_types_15),
                R.drawable.info_icon_cable_types_15
            ),
        )
        _cableTypesLiveData.postValue(listDataCableTypes)
    }
}