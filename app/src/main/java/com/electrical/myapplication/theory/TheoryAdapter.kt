package com.electrical.myapplication.theory

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

import androidx.recyclerview.widget.RecyclerView
import com.electrical.myapplication.R
import com.electrical.myapplication.theory.basic_concepts.BasicConcepts
import com.electrical.myapplication.theory.laws_and_regulations.LawsAndRegulations

@SuppressLint("StaticFieldLeak")
lateinit var view: View
const val ACTION_BAR_TITLE = "action_title"

class TheoryAdapter(private val context: Context, private val dataTheory: List<TheoryData>) :
    RecyclerView.Adapter<TheoryAdapter.TheoryViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TheoryViewHolder {
        view = LayoutInflater.from(context).inflate(R.layout.recycler_theory, parent, false)
        return TheoryViewHolder(view)
    }

    override fun onBindViewHolder(holder: TheoryViewHolder, position: Int) {
        val valueData = dataTheory[position]
        holder.title.text = valueData.title
        holder.description.text = valueData.description
        holder.imageIcon.setImageResource(valueData.imageIcon)

         view.setOnClickListener() {
            showTheoryCategory(holder.position)

        }

    }

    override fun getItemCount(): Int {
        return dataTheory.size
    }

    class TheoryViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val title: TextView = view.findViewById(R.id.title_theory)
        val description: TextView = view.findViewById(R.id.description_theory)
        val imageIcon: ImageView = view.findViewById(R.id.img_icon_theory)

    }

    private fun showTheoryCategory(position: Int) {
        when (position) {
            0 -> {
                val basicConceptsIntent = Intent(context, BasicConcepts::class.java)
                basicConceptsIntent.putExtra(ACTION_BAR_TITLE, dataTheory[position].title)
                context.startActivity(basicConceptsIntent)
            }
            1->{
                val lawsAndRegulationsIntent = Intent(context,LawsAndRegulations::class.java)
                lawsAndRegulationsIntent.putExtra(ACTION_BAR_TITLE,dataTheory[position].title)
                context.startActivity(lawsAndRegulationsIntent)
            }

        }

    }
}