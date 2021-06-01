package com.electrical.myapplication.theory.cable_and_wires

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.electrical.myapplication.R

class CableTypesAdapter(
    val context: Context,
    private val dataListsCableTypes: List<CableTypesData>
) :
    RecyclerView.Adapter<CableTypesAdapter.CableTypesViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CableTypesViewHolder {
        val view =
            LayoutInflater.from(context).inflate(R.layout.recycler_cable_types, parent, false)
        return CableTypesViewHolder(view)
    }

    override fun onBindViewHolder(holder: CableTypesViewHolder, position: Int) {
        val valueData = dataListsCableTypes[position]
        holder.title.text = valueData.title
        holder.description.text = valueData.description
        holder.image.setImageResource(valueData.image)
    }

    override fun getItemCount(): Int {
        return dataListsCableTypes.size
    }

    class CableTypesViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val title: TextView = view.findViewById(R.id.title_cable_types)
        val description: TextView = view.findViewById(R.id.description_cable_types)
        val image: ImageView = view.findViewById(R.id.img_icon_cable_types)

    }
}