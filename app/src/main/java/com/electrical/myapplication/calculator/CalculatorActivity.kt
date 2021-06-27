package com.electrical.myapplication.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.electrical.myapplication.R
import com.electrical.myapplication.calculator.recycler_for_calculator.CalculatorAdapter
import com.electrical.myapplication.calculator.recycler_for_calculator.CalculatorViewModel
import com.electrical.myapplication.databinding.ActivityCaclulateBinding
import com.electrical.myapplication.theory.ACTION_BAR_TITLE
import org.koin.androidx.viewmodel.ext.android.viewModel
import org.koin.core.KoinComponent


class CalculatorActivity : AppCompatActivity(), KoinComponent {
    private val viewModels: CalculatorViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        val bindingCalculator = ActivityCaclulateBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(bindingCalculator.root)


        title = intent.getStringExtra(ACTION_BAR_TITLE)

        val actionBarShow: androidx.appcompat.app.ActionBar? = supportActionBar
        actionBarShow?.apply {
            setHomeButtonEnabled(true)
            setDisplayHomeAsUpEnabled(true)
        }

        val vieModelCalculate = viewModels
        vieModelCalculate.getDataCalculate()
        vieModelCalculate.dataCalculate.observe(this, {
            val adapterCalculator = CalculatorAdapter(this, it)
            val recyclerCalculator: RecyclerView = bindingCalculator.recyclerContainerCalculator
            recyclerCalculator.adapter = adapterCalculator
            recyclerCalculator.layoutManager = LinearLayoutManager(this)
        })


    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> {
                finish()
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onPause() {
        super.onPause()
        overridePendingTransition(
            R.anim.activity_down_up_close_enter,
            R.anim.activity_down_up_close_exit
        )
    }
}