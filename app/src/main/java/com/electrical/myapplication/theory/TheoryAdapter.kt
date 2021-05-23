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
import com.electrical.myapplication.theory.ip_shield.IpShield
import com.electrical.myapplication.theory.laws_and_regulations.LawsAndRegulations
import com.electrical.myapplication.theory.power_plants_and_substations.Substations

import com.electrical.myapplication.theory.serial_and_parallel_connection.SerialAndParallelConnectionActivity

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
            showTheoryCategory(holder.bindingAdapterPosition)
            Log.d("position","pos layout = ${holder.bindingAdapterPosition}")
           // Log.d("position"," positions = $position")
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
                Log.d("position","pos = $position")
                val basicConceptsIntent = Intent(context, BasicConcepts::class.java)
                basicConceptsIntent.putExtra(ACTION_BAR_TITLE, dataTheory[position].title)
                context.startActivity(basicConceptsIntent)
            }
            1 -> {
                Log.d("position","pos = $position")
                val lawsAndRegulationsIntent = Intent(context, LawsAndRegulations::class.java)
                lawsAndRegulationsIntent.putExtra(ACTION_BAR_TITLE, dataTheory[position].title)
                context.startActivity(lawsAndRegulationsIntent)
            }
            2 -> {
                Log.d("position","pos = $position")
                val serialAndParallelConnectionIntent =
                    Intent(context, SerialAndParallelConnectionActivity::class.java)
                serialAndParallelConnectionIntent.putExtra(ACTION_BAR_TITLE,dataTheory[position].title)
                context.startActivity(serialAndParallelConnectionIntent)
            }
            4 -> {

            }
            5-> {
                Log.d("position","pos = $position")
                 val substationsIntent = Intent(context, Substations::class.java)
                substationsIntent.putExtra(ACTION_BAR_TITLE,dataTheory[position].title)
                context.startActivity(substationsIntent)
            }
            11 -> {
                Log.d("position","pos = $position")
                val ipShieldIntent = Intent(context, IpShield::class.java)
                ipShieldIntent.putExtra(ACTION_BAR_TITLE, dataTheory[position].title)
                context.startActivity(ipShieldIntent)
            }
        }
    }
}