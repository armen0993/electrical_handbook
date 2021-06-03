package com.electrical.myapplication.theory.cable_and_wires

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.electrical.myapplication.R

class ShowCableTypesFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_show_cable_types, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val recyclerCableTypes: RecyclerView =
            view.findViewById(R.id.container_recycler_cable_types)

        val listDataCableTypes = listOf(
            CableTypesData(
                getString(R.string.info_title_cable_types),
                getString(R.string.info_description_cable_types),
                R.drawable.info_icon_cable_types
            ),
            CableTypesData(
                getString(R.string.info_title_cable_types_1),
                getString(R.string.info_description_cable_types_1),
                R.drawable.info_icon_cable_types_1
            ),
            CableTypesData(
                getString(R.string.info_title_cable_types_4),
                getString(R.string.info_description_cable_types_4),
                R.drawable.info_icon_cable_types_4
            ),
            CableTypesData(
                getString(R.string.info_title_cable_types_2),
                getString(R.string.info_description_cable_types_2),
                R.drawable.info_icon_cable_types_2
            ),
            CableTypesData(
                getString(R.string.info_title_cable_types_3),
                getString(R.string.info_description_cable_types_3),
                R.drawable.info_icon_cable_types_3
            ),
            CableTypesData(
                getString(R.string.info_title_cable_types_5),
                getString(R.string.info_description_cable_types_5),
                R.drawable.info_icon_cable_types_5
            ),
            CableTypesData(
                getString(R.string.info_title_cable_types_6),
                getString(R.string.info_description_cable_types_6),
                R.drawable.info_icon_cable_types_6
            ),
            CableTypesData(
                getString(R.string.info_title_cable_types_7),
                getString(R.string.info_description_cable_types_7),
                R.drawable.info_icon_cable_types_7
            ),
            CableTypesData(
                getString(R.string.info_title_cable_types_8),
                getString(R.string.info_description_cable_types_8),
                R.drawable.info_icon_cable_types_8
            ),
            CableTypesData(
                getString(R.string.info_title_cable_types_9),
                getString(R.string.info_description_cable_types_9),
                R.drawable.info_icon_cable_types_9
            ),
            CableTypesData(
                getString(R.string.info_title_cable_types_10),
                getString(R.string.info_description_cable_types_10),
                R.drawable.info_icon_cable_types_10
            ),
            CableTypesData(
                getString(R.string.info_title_cable_types_11),
                getString(R.string.info_description_cable_types_11),
                R.drawable.info_icon_cable_types_11
            ),
            CableTypesData(
                getString(R.string.info_title_cable_types_12),
                getString(R.string.info_description_cable_types_12),
                R.drawable.info_icon_cable_types_12
            ),
            CableTypesData(
                getString(R.string.info_title_cable_types_13),
                getString(R.string.info_description_cable_types_13),
                R.drawable.info_icon_cable_types_13
            ),
            CableTypesData(
                getString(R.string.info_title_cable_types_14),
                getString(R.string.info_description_cable_types_14),
                R.drawable.info_icon_cable_types_14
            ),
            CableTypesData(
                getString(R.string.info_title_cable_types_15),
                getString(R.string.info_description_cable_types_15),
                R.drawable.info_icon_cable_types_15
            ),
        )

        val adapterCableType = CableTypesAdapter(requireContext(), listDataCableTypes)
        recyclerCableTypes.adapter = adapterCableType
        recyclerCableTypes.layoutManager = LinearLayoutManager(requireContext())

    }
}