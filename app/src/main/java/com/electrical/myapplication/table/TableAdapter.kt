package com.electrical.myapplication.table

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.electrical.myapplication.R


class TableAdapter(val context:Context, private val dataTable:List<TableData>): RecyclerView.Adapter<TableAdapter.TableViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TableViewHolder {
       val view = LayoutInflater.from(context).inflate(R.layout.recycler_table,parent,false)
        return TableViewHolder(view)
    }

    override fun onBindViewHolder(holder: TableViewHolder, position: Int) {
        val valueData = dataTable[position]
      holder.titleTable.text = valueData.title
        holder.imageTable.setImageResource(valueData.imageTable)

//        holder.itemView.setOnClickListener {
//            showTableCategory(holder.layoutPosition)
//
//        }
    }

    override fun getItemCount(): Int {
        return dataTable.size
    }

    class TableViewHolder(view:View):RecyclerView.ViewHolder(view){
        val imageTable: ImageView = view.findViewById(R.id.img_icon_table)
        val titleTable: TextView = view.findViewById(R.id.title_table)

    }


//    private fun showTableCategory(position: Int) {
//        when (position) {
//            0 -> {
//                val intent = Intent(context, Standards::class.java)
//                intent.putExtra(ACTION_BAR_TITLE, dataSchema[position].title)
//                context.startActivity(intent)
//            }
//
//
//
//        }
//    }

}