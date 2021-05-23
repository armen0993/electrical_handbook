package com.electrical.myapplication.schema

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.electrical.myapplication.R

class SchemaAdapter(private val context: Context, private val dataSchema:List<SchemaData>):
    RecyclerView.Adapter<SchemaAdapter.SchemaViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SchemaViewHolder {
        val  view = LayoutInflater.from(context).inflate(R.layout.recycler_schema,parent,false)
        return SchemaViewHolder(view)
    }

    override fun onBindViewHolder(holder: SchemaViewHolder, position: Int) {
        val valueData = dataSchema[position]
        holder.titleSchema.text= valueData.title
        holder.imageIconSchema.setImageResource(valueData.imageIcon)

    }

    override fun getItemCount(): Int {
        return dataSchema.size
    }
    class SchemaViewHolder(view: View): RecyclerView.ViewHolder(view){
        val titleSchema: TextView
        val imageIconSchema: ImageView
        init {
            titleSchema = view.findViewById(R.id.title_schema)
            imageIconSchema = view.findViewById(R.id.img_icon_schema)
        }

    }
}