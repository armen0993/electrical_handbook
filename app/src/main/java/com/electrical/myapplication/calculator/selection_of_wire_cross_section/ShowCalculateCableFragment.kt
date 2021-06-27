package com.electrical.myapplication.calculator.selection_of_wire_cross_section

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.Toast
import androidx.core.util.rangeTo
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.electrical.myapplication.R
import com.electrical.myapplication.databinding.FragmentShowCalculateCableBinding


class ShowCalculateCableFragment : Fragment() {
    lateinit var bindingCalculateCable: FragmentShowCalculateCableBinding
    private var isCheckedMaterial: Boolean = true                // copper = true, aluminum = false
    private var isCheckedType: Boolean = true                   // open = true, close = false
    private var voltageType: Int = 220                         // 220 or 380 volts
    private var currentType = true                            // current = true , power = false
    private var inputCurrent: Double = 0.0                   //  input number current
    private var inputPower: Double = 0.0                      //  input number power
    private var inputLose: Double = 0.0                      // input number lose
    private var inputLength: Double = 0.0                     // input number length
    private var inputTemperature: Double = 0.0                 // input number temperature
    private var inputCosine: Double = 0.0
    private var losType = true                                 // true = %  false = voltage
    // input number cos φ

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        bindingCalculateCable = FragmentShowCalculateCableBinding.inflate(layoutInflater)
        return bindingCalculateCable.root
    }

    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val vieModelCalculateCable =
            ViewModelProvider(this).get(CalculateCableViewModel::class.java)

        vieModelCalculateCable.liveDataResult.observe(viewLifecycleOwner, {
            bindingCalculateCable.textCalculateCableTypeResult.text =
                "S = $it мм²\n D = ${vieModelCalculateCable.getDiameter()} мм"
        })

        bindingCalculateCable.spinnerCalculateCableVoltageType.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>,
                view: View, position: Int, id: Long
            ) {
                when (bindingCalculateCable.spinnerCalculateCableVoltageType.selectedItem.toString()) {
                    "220В" -> {
                        voltageType = 220
                    }
                    "380В" -> {
                        voltageType = 380
                    }
                }
            }

            override fun onNothingSelected(parent: AdapterView<*>) {
                // write code to perform some action
            }

        }
        bindingCalculateCable.spinnerCalculateCableLossType.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                when (bindingCalculateCable.spinnerCalculateCableLossType.selectedItem.toString()) {
                    "%" -> losType = true

                    "V" -> losType = false
                }
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
        }


// radio button isClicked
        bindingCalculateCable.radioButtonClose.setOnClickListener {
            isCheckedType = false
        }
        bindingCalculateCable.radioButtonOpen.setOnClickListener {
            isCheckedType = false
        }
        bindingCalculateCable.radioButtonAluminum.setOnClickListener {
            isCheckedMaterial = false
        }

        bindingCalculateCable.radioButtonCopper.setOnClickListener {
            isCheckedMaterial = true
        }


        // selected Spinner current or power
        bindingCalculateCable.spinnerCalculateCableCurrentType.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>,
                view: View, position: Int, id: Long
            ) {
                when (bindingCalculateCable.spinnerCalculateCableCurrentType.selectedItem.toString()) {
                    "Мошность" -> {
                        currentType = false
                        bindingCalculateCable.textCalculateCurrentType.visibility = View.INVISIBLE
                        bindingCalculateCable.editTextCalculateCurrent.visibility = View.INVISIBLE
                        bindingCalculateCable.textCalculateCableType3.visibility = View.INVISIBLE
                        bindingCalculateCable.textCalculatePowerType.visibility = View.VISIBLE
                        bindingCalculateCable.editTextCalculatePower.visibility = View.VISIBLE
                        bindingCalculateCable.textCalculateCableType4.visibility = View.VISIBLE
                        bindingCalculateCable.textCalculateCableType8.visibility = View.VISIBLE
                        bindingCalculateCable.editTextCalculateCablePowerCosine.visibility =
                            View.VISIBLE

                    }
                    "Ток" -> {
                        currentType = true
                        bindingCalculateCable.textCalculateCurrentType.visibility = View.VISIBLE
                        bindingCalculateCable.editTextCalculateCurrent.visibility = View.VISIBLE
                        bindingCalculateCable.textCalculateCableType3.visibility = View.VISIBLE
                        bindingCalculateCable.textCalculatePowerType.visibility = View.INVISIBLE
                        bindingCalculateCable.editTextCalculatePower.visibility = View.INVISIBLE
                        bindingCalculateCable.textCalculateCableType4.visibility = View.INVISIBLE
                        bindingCalculateCable.textCalculateCableType8.visibility = View.INVISIBLE
                        bindingCalculateCable.editTextCalculateCablePowerCosine.visibility =
                            View.INVISIBLE

                    }
                }
            }

            override fun onNothingSelected(parent: AdapterView<*>) {
                // write code to perform some action
            }
        }


        bindingCalculateCable.btnOk.setOnClickListener {
            if (currentType) {
                if (bindingCalculateCable.editTextCalculateCurrent.text.isNotEmpty() &&
                    bindingCalculateCable.editTextCalculateLoss.text.isNotEmpty() &&
                    bindingCalculateCable.editTextCalculateCableLength.text.isNotEmpty() &&
                    bindingCalculateCable.editTextCalculateCableTemperature.text.isNotEmpty()
                ) {
                    inputCurrent =
                        bindingCalculateCable.editTextCalculateCurrent.text.toString().toDouble()
                    inputLose =
                        bindingCalculateCable.editTextCalculateLoss.text.toString().toDouble()
                    inputLength =
                        bindingCalculateCable.editTextCalculateCableLength.text.toString()
                            .toDouble()
                    inputTemperature =
                        bindingCalculateCable.editTextCalculateCableTemperature.text.toString()
                            .toDouble()

                    vieModelCalculateCable.setParameterIsCurrent(
                        voltageType,
                        isCheckedMaterial,
                        isCheckedType,
                        currentType,
                        inputCurrent,
                        inputLose,
                        inputLength,
                        inputTemperature,
                        losType
                    )
                    vieModelCalculateCable.getResultLogic()


                } else {
                    Toast.makeText(context, "Пожалуйста ввидите все поля !!", Toast.LENGTH_SHORT)
                        .show()
                }

            } else {
                if (bindingCalculateCable.editTextCalculatePower.text.isNotEmpty() &&
                    bindingCalculateCable.editTextCalculateLoss.text.isNotEmpty() &&
                    bindingCalculateCable.editTextCalculateCableLength.text.isNotEmpty() &&
                    bindingCalculateCable.editTextCalculateCableTemperature.text.isNotEmpty() &&
                    bindingCalculateCable.editTextCalculateCablePowerCosine.text.isNotEmpty()
                ) {
                    inputPower =
                        bindingCalculateCable.editTextCalculatePower.text.toString().toDouble()
                    inputLose =
                        bindingCalculateCable.editTextCalculateLoss.text.toString().toDouble()
                    inputLength =
                        bindingCalculateCable.editTextCalculateCableLength.text.toString()
                            .toDouble()
                    inputTemperature =
                        bindingCalculateCable.editTextCalculateCableTemperature.text.toString()
                            .toDouble()
                    inputCosine =
                        bindingCalculateCable.editTextCalculateCablePowerCosine.text.toString()
                            .toDouble()
                    when (bindingCalculateCable.editTextCalculateCablePowerCosine.text.toString()
                        .toDouble()) {
                        in 0.1 rangeTo 1.0 -> {
                            vieModelCalculateCable.setParameterIsPower(
                                voltageType,
                                isCheckedMaterial,
                                isCheckedType,
                                currentType,
                                inputPower,
                                inputLose,
                                inputLength,
                                inputTemperature,
                                inputCosine,
                                losType
                            )

                            vieModelCalculateCable.getResultLogic()
                        }
                        else -> {
                            Toast.makeText(
                                context,
                                "${resources.getString(R.string.text_calculate_cable_cosine)} должно бить 0.1 до 1",
                                Toast.LENGTH_SHORT
                            ).show()
                        }
                    }
                } else {
                    Toast.makeText(
                        context,
                        "Пожалуйста ввидите все поля !!",
                        Toast.LENGTH_SHORT
                    )
                        .show()
                }


            }
        }
    }
}