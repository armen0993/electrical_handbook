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
import com.electrical.myapplication.theory.electrician_tools.ElectricianToolsActivity
import com.electrical.myapplication.theory.electromechanical_converters.ElectromechanicalConvertersActivity
import com.electrical.myapplication.theory.ip_shield.IpShield
import com.electrical.myapplication.theory.laws_and_regulations.LawsAndRegulations
import com.electrical.myapplication.theory.power_plants_and_substations.Substations

import com.electrical.myapplication.theory.serial_and_parallel_connection.SerialAndParallelConnectionActivity
import com.electrical.myapplication.theory.sockets_and_plugs.SocketsAndPlugsActivity

@SuppressLint("StaticFieldLeak")

const val ACTION_BAR_TITLE = "action_title"

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

        holder.itemView.setOnClickListener {
            showTheoryCategory(holder.layoutPosition)

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
            1 -> {
                val lawsAndRegulationsIntent = Intent(context, LawsAndRegulations::class.java)
                lawsAndRegulationsIntent.putExtra(ACTION_BAR_TITLE, dataTheory[position].title)
                context.startActivity(lawsAndRegulationsIntent)
            }
            2 -> {
                val serialAndParallelConnectionIntent =
                    Intent(context, SerialAndParallelConnectionActivity::class.java)
                serialAndParallelConnectionIntent.putExtra(
                    ACTION_BAR_TITLE,
                    dataTheory[position].title
                )
                context.startActivity(serialAndParallelConnectionIntent)
            }
            5 -> {
                val substationsIntent = Intent(context, Substations::class.java)
                substationsIntent.putExtra(ACTION_BAR_TITLE, dataTheory[position].title)
                context.startActivity(substationsIntent)
            }
            7 -> {
                val electromechanicalConverterIntent = Intent(context,ElectromechanicalConvertersActivity::class.java)
                electromechanicalConverterIntent.putExtra(ACTION_BAR_TITLE,dataTheory[position].title)
                context.startActivity(electromechanicalConverterIntent)
            }
            11 -> {
                val ipShieldIntent = Intent(context, IpShield::class.java)
                ipShieldIntent.putExtra(ACTION_BAR_TITLE, dataTheory[position].title)
                context.startActivity(ipShieldIntent)
            }
            12 -> {
                val electricianToolsIntent = Intent(context, ElectricianToolsActivity::class.java)
                electricianToolsIntent.putExtra(ACTION_BAR_TITLE, dataTheory[position].title)
                context.startActivity(electricianToolsIntent)
            }
            13 -> {
                val socketsAndPlugsIntent = Intent(context, SocketsAndPlugsActivity::class.java)
                socketsAndPlugsIntent.putExtra(ACTION_BAR_TITLE, dataTheory[position].title)
                context.startActivity(socketsAndPlugsIntent)
            }
        }
    }
}