package com.electrical.myapplication.theory

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.electrical.myapplication.R

class TheoryAdapter(private val context: Context, private val dataTheory: List<TheoryData>) :
    RecyclerView.Adapter<TheoryAdapter.TheoryViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TheoryViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.recycler_theory, parent, false)
        return TheoryViewHolder(view)
    }

    override fun onBindViewHolder(holder: TheoryViewHolder, position: Int) {
        val valueData = dataTheory[position]
        holder.title.text = valueData.title
        holder.description.text = valueData.description
        holder.imageIcon.setImageResource(valueData.imageIcon)
    }

    override fun getItemCount(): Int {
        return dataTheory.size
    }

    class TheoryViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val title: TextView
        val description: TextView
        val imageIcon: ImageView

        init {
            title = view.findViewById(R.id.title_theory)
            description = view.findViewById(R.id.description_theory)
            imageIcon = view.findViewById(R.id.img_icon_theory)
        }

    }
}