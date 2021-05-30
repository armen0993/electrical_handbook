package com.electrical.myapplication.theory.electrician_tools

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.electrical.myapplication.R


class ElectricianToolsAdapter(
    val context: Context,
    private val electricianToolsDataList: List<ElectricianToolsData>
) : RecyclerView.Adapter<ElectricianToolsAdapter.ElectricianToolsViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ElectricianToolsViewHolder {
        val viewTools =
            LayoutInflater.from(context).inflate(R.layout.recycler_electrician_tools, parent, false)
        return ElectricianToolsViewHolder(viewTools)
    }

    override fun onBindViewHolder(holder: ElectricianToolsViewHolder, position: Int) {
        val valueData = electricianToolsDataList[position]
        holder.titleTools.text = valueData.titleElectricianTools
        holder.descriptionTools.text = valueData.descriptionsElectricianTools
        holder.iconElectricianTools1.setImageResource(valueData.iconElectricianTools1)

    }

    override fun getItemCount(): Int {
        return electricianToolsDataList.size
    }

    class ElectricianToolsViewHolder(viewTools: View) : RecyclerView.ViewHolder(viewTools) {
        val titleTools: TextView = viewTools.findViewById(R.id.title_electrician_tools)
        val descriptionTools: TextView = viewTools.findViewById(R.id.description_electrician_tools)
        val iconElectricianTools1: ImageView = viewTools.findViewById(R.id.icon_electrician_tools_1)


    }
}