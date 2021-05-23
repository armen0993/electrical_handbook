package com.electrical.myapplication.schema

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.electrical.myapplication.R
import com.electrical.myapplication.schema.automatic_transfer_switch.AutomaticTransferSwitch
import com.electrical.myapplication.schema.standards.Standards
import com.electrical.myapplication.theory.ACTION_BAR_TITLE
import com.electrical.myapplication.theory.view
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

        holder.itemView.setOnClickListener() {
            showSchemaCategory(holder.layoutPosition)
        }
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
    private fun showSchemaCategory(position: Int) {
        when (position) {
            0 -> {
                val standardsIntent = Intent(context, Standards::class.java)
                standardsIntent.putExtra(ACTION_BAR_TITLE, dataSchema[position].title)
                context.startActivity(standardsIntent)
            }
            1 -> {
                val atsIntent = Intent(context, AutomaticTransferSwitch::class.java)
                atsIntent.putExtra(ACTION_BAR_TITLE, dataSchema[position].title)
                context.startActivity(atsIntent)
            }


        }
    }
}