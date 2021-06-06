package com.electrical.myapplication.theory.cable_and_wires

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
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

        val cableTypesViewModel = ViewModelProvider(this).get(CableTypesViewModel::class.java)
        cableTypesViewModel.creatingCableTypesData(requireContext())
        cableTypesViewModel.cableTypesLiveData.observe(viewLifecycleOwner, {
            val adapterCableType = CableTypesAdapter(requireContext(), it)
            recyclerCableTypes.adapter = adapterCableType
            recyclerCableTypes.layoutManager = LinearLayoutManager(requireContext())
        })
    }
}