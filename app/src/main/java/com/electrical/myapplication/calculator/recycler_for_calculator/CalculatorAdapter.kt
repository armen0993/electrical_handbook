package com.electrical.myapplication.calculator.recycler_for_calculator

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.electrical.myapplication.R
import com.electrical.myapplication.calculator.ShowCalculatorCategoryActivity
import com.electrical.myapplication.theory.ACTION_BAR_TITLE

const val CATEGORY_CALCULATE_NAME = "Category Calculate"
const val CATEGORY_CALCULATE_CABLE = 1000

class CalculatorAdapter(
    val context: Context,
    private val dataCalculator: List<CalculatorModelData>
) :
    RecyclerView.Adapter<CalculatorAdapter.CalculatorViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CalculatorViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.recycler_calculator, parent, false)
        return CalculatorViewHolder(view)
    }

    override fun onBindViewHolder(holder: CalculatorViewHolder, position: Int) {
        val currentData = dataCalculator[position]
        holder.title.text = currentData.title
        holder.img.setImageResource(currentData.img)
        holder.itemView.setOnClickListener {
            showCategoryCalculate(holder.layoutPosition)

        }
    }

    override fun getItemCount(): Int {
        return dataCalculator.size
    }

    class CalculatorViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val title: TextView = view.findViewById(R.id.title_calculator)
        val img: ImageView = view.findViewById(R.id.img_calculator)
    }

    private fun showCategoryCalculate(position: Int) {
        val showCategoryCalculateIntent =
            Intent(context, ShowCalculatorCategoryActivity::class.java)
        when (position) {
            0 -> {
                showCategoryCalculateIntent.putExtra(
                    ACTION_BAR_TITLE,
                    dataCalculator[position].title
                )
                showCategoryCalculateIntent.putExtra(
                    CATEGORY_CALCULATE_NAME,
                    CATEGORY_CALCULATE_CABLE
                )
                context.startActivity(showCategoryCalculateIntent)
            }
            1 -> {

            }
        }
    }
}