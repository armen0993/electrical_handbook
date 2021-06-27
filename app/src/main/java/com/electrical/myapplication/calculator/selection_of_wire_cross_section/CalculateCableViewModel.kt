package com.electrical.myapplication.calculator.selection_of_wire_cross_section


import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlin.math.PI
import kotlin.math.floor
import kotlin.math.sqrt

const val CONSTANT_COPPER = 0.0175
const val CONSTANT_ALUMINIUM = 0.0281
const val CONSTANT_TEMPERATURE = 0.004

class CalculateCableViewModel : ViewModel() {
    private val _liveDataResult = MutableLiveData<Double>()
    val liveDataResult: LiveData<Double> = _liveDataResult
    private var materialCable: Boolean = true
    private var typeCable: Boolean = true
    private var result: Double = 0.0
    private var voltageType: Int = 220                         // 220 or 380 volts
    private var currentType = true                            // current = true , power = false
    private var inputCurrent: Double = 0.0                   //  input number current
    private var inputPower: Double = 0.0                      //  input number power
    private var inputLose: Double = 0.0                      // input number lose
    private var inputLength: Double = 0.0                     // input number length
    private var inputTemperature: Double = 0.0                 // input number temperature
    private var inputCosine: Double = 0.0
    private var resistance: Double = 0.0
    private var losType = true


    fun setParameterIsCurrent(
        inputVoltage: Int, typeMaterial: Boolean, cableType: Boolean, isCurrentType: Boolean,
        inputCurrentCount: Double, inputLossCount: Double, inputLengthCount: Double,
        inputTemperatureCount: Double, losType: Boolean
    ) {
        voltageType = inputVoltage
        materialCable = typeMaterial
        typeCable = cableType
        currentType = isCurrentType
        inputCurrent = inputCurrentCount
        inputLose = inputLossCount
        inputLength = inputLengthCount
        inputTemperature = inputTemperatureCount
        this.losType = losType

    }

    fun setParameterIsPower(
        inputVoltage: Int, typeMaterial: Boolean, cableType: Boolean, isCurrentType: Boolean,
        inputPowerCount: Double, inputLossCount: Double, inputLengthCount: Double,
        inputTemperatureCount: Double, inputCosineCount: Double, losType: Boolean
    ) {
        voltageType = inputVoltage
        materialCable = typeMaterial
        typeCable = cableType
        currentType = isCurrentType
        inputPower = inputPowerCount
        inputLose = inputLossCount
        inputLength = inputLengthCount
        inputTemperature = inputTemperatureCount
        inputCosine = inputCosineCount
        this.losType = losType
    }


    fun getResultLogic() {
        when (voltageType) {
            220 -> {
                // losType = %
                if (materialCable && typeCable && currentType && losType) {
                    resistance = (voltageType * inputLose / 100) / inputCurrent
                    resistance =
                        (resistance + resistance * CONSTANT_TEMPERATURE * (inputTemperature - 20))
                    result = (2 * CONSTANT_COPPER * inputLength) / resistance
                    result(result)
                } else if (!materialCable && typeCable && currentType && losType) {
                    resistance = (voltageType * inputLose / 100) / inputCurrent
                    resistance =
                        (resistance + resistance * CONSTANT_TEMPERATURE * (inputTemperature - 20))
                    result = (2 * CONSTANT_ALUMINIUM * inputLength) / resistance
                    result(result)
                } else if (materialCable && typeCable && !currentType && losType) {
                    inputCosine = 1.0
                    inputCurrent = (inputPower * 1000) / (voltageType * inputCosine)
                    resistance = (voltageType * inputLose / 100) / inputCurrent
                    resistance =
                        (resistance + resistance * CONSTANT_TEMPERATURE * (inputTemperature - 20))
                    result = (CONSTANT_COPPER * inputLength) / resistance
                    result = floor(result * 100) / 100.0
                    result(result)

                } else if (!materialCable && typeCable && !currentType && losType) {
                    inputCosine = 1.0
                    inputCurrent = (inputPower * 1000) / (voltageType * inputCosine)
                    resistance = (voltageType * inputLose / 100) / inputCurrent
                    resistance =
                        (resistance + resistance * CONSTANT_TEMPERATURE * (inputTemperature - 20))
                    result = (CONSTANT_ALUMINIUM * inputLength) / resistance
                    result(result)
                }
                // losType = voltage
                if (materialCable && typeCable && currentType && !losType) {
                    resistance = inputLose / inputCurrent
                    resistance =
                        (resistance + resistance * CONSTANT_TEMPERATURE * (inputTemperature - 20))
                    result = (CONSTANT_COPPER * inputLength) / resistance

                    result(result)
                } else if (!materialCable && typeCable && currentType && !losType) {
                    resistance = inputLose / inputCurrent
                    resistance =
                        (resistance + resistance * CONSTANT_TEMPERATURE * (inputTemperature - 20))
                    result = (CONSTANT_ALUMINIUM * inputLength) / resistance
                    result(result)
                } else if (materialCable && typeCable && !currentType && !losType) {
                    inputCosine = 1.0
                    inputCurrent = inputPower * 1000 / voltageType * inputCosine
                    resistance = inputLose / inputCurrent
                    resistance =
                        (resistance + resistance * CONSTANT_TEMPERATURE * (inputTemperature - 20))
                    result = (CONSTANT_COPPER * inputLength) / resistance
                    result(result)
                } else if (!materialCable && typeCable && !currentType && !losType) {
                    inputCosine = 1.0
                    inputCurrent = inputPower * 1000 / voltageType * inputCosine
                    resistance = inputLose / inputCurrent
                    resistance =
                        (resistance + resistance * CONSTANT_TEMPERATURE * (inputTemperature - 20))
                    result = (CONSTANT_ALUMINIUM * inputLength) / resistance
                    result(result)
                }
            }
            380 -> {
                // losType = %
                if (materialCable && typeCable && currentType && losType) {
                    resistance = (voltageType * inputLose / 100) / inputCurrent
                    resistance =
                        (resistance + resistance * CONSTANT_TEMPERATURE * (inputTemperature - 20))
                    result = (CONSTANT_COPPER * inputLength) / resistance
                    result(result)

                } else if (!materialCable && typeCable && currentType && losType) {
                    resistance = (voltageType * inputLose / 100) / inputCurrent
                    resistance =
                        (resistance + resistance * CONSTANT_TEMPERATURE * (inputTemperature - 20))
                    result = (CONSTANT_ALUMINIUM * inputLength) / resistance
                    result(result)
                } else if (materialCable && typeCable && !currentType && losType) {
                    inputCurrent = inputPower * 1000 / (sqrt(3.0) * voltageType * inputCosine)
                    resistance = (voltageType * inputLose / 100) / inputCurrent
                    resistance =
                        (resistance + resistance * CONSTANT_TEMPERATURE * (inputTemperature - 20))
                    result = (CONSTANT_COPPER * inputLength) / resistance
                    result(result)

                } else if (!materialCable && typeCable && !currentType && losType) {
                    inputCurrent = inputPower * 1000 / (sqrt(3.0) * voltageType * inputCosine)
                    resistance = ((voltageType * inputLose) / 100) / inputCurrent
                    resistance =
                        (resistance + resistance * CONSTANT_TEMPERATURE * (inputTemperature - 20))
                    result = (CONSTANT_ALUMINIUM * inputLength) / resistance
                    result(result)
                }
                // losType = voltage
                if (materialCable && typeCable && currentType && !losType) {
                    resistance = inputLose / inputCurrent
                    resistance =
                        (resistance + resistance * CONSTANT_TEMPERATURE * (inputTemperature - 20))
                    result = (CONSTANT_COPPER * inputLength) / resistance
                    result(result)

                } else if (!materialCable && typeCable && currentType && !losType) {
                    resistance = inputLose / inputCurrent
                    resistance =
                        (resistance + resistance * CONSTANT_TEMPERATURE * (inputTemperature - 20))
                    result = (CONSTANT_ALUMINIUM * inputLength) / resistance
                    result(result)
                } else if (materialCable && typeCable && !currentType && !losType) {
                    inputCurrent = inputPower * 1000 / (sqrt(3.0) * voltageType * inputCosine)
                    resistance = inputLose / inputCurrent
                    resistance =
                        (resistance + resistance * CONSTANT_TEMPERATURE * (inputTemperature - 20))
                    result = (CONSTANT_COPPER * inputLength) / resistance
                    result(result)

                } else if (!materialCable && typeCable && !currentType && !losType) {
                    inputCurrent = inputPower * 1000 / (sqrt(3.0) * voltageType * inputCosine)
                    resistance = inputLose / inputCurrent
                    resistance =
                        (resistance + resistance * CONSTANT_TEMPERATURE * (inputTemperature - 20))
                    result = (CONSTANT_ALUMINIUM * inputLength) / resistance
                    result(result)
                }
            }
        }
    }

    fun getDiameter(): Double {
        var diameter = sqrt(4 * result / PI)
        diameter = floor(diameter * 100) / 100.0
        return diameter
    }

    private fun result(result: Double) {

        if (result <= 0.55) {
            this.result = 0.5
            _liveDataResult.postValue(this.result)

        } else if (result > 0.55 && result <= 1.5) {
            this.result = 1.5
            _liveDataResult.postValue(this.result)

        } else if (result > 1.5 && result <= 2.5) {
            this.result = 2.5
            _liveDataResult.postValue(this.result)

        } else if (result > 2.5 && result <= 4.0) {
            this.result = 4.0
            _liveDataResult.postValue(this.result)
        } else if (result > 4.0 && result <= 6.0) {
            this.result = 6.0
            _liveDataResult.postValue(this.result)
        } else if (result > 6.0 && result <= 10.0) {
            this.result = 10.0
            _liveDataResult.postValue(this.result)
        } else if (result > 10.0 && result <= 16.0) {
            this.result = 16.0
            _liveDataResult.postValue(this.result)
        } else if (result > 16.0 && result <= 25.0) {
            this.result = 25.0
            _liveDataResult.postValue(this.result)
        } else {
            _liveDataResult.postValue(this.result)

        }
    }
}

