package com.electrical.myapplication

import android.app.Application
import com.electrical.myapplication.calculator.recycler_for_calculator.CalculatorViewModel
import com.electrical.myapplication.calculator.recycler_for_calculator.DataCalculateRepository
import com.electrical.myapplication.calculator.recycler_for_calculator.ModelCalculateRepository
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.context.startKoin
import org.koin.dsl.module

class ApplicationElectricianHandbook : Application() {
    override fun onCreate() {
        super.onCreate()

        val moduleApp = module {

            viewModel<CalculatorViewModel> {
                CalculatorViewModel(dataRepository = get())
            }
            single<DataCalculateRepository> {
               ModelCalculateRepository()
            }
        }
        startKoin {
            androidContext(applicationContext)
            modules(moduleApp)
        }
    }
}