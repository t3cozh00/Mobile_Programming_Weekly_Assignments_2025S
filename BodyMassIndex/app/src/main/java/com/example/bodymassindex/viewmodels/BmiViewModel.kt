package com.example.bodymassindex.viewmodels

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class BmiViewModel:ViewModel() {
    var heightInput by mutableStateOf("")
    var weightInput by mutableStateOf("")

    private val height: Double?
        get() {
            return heightInput.toDoubleOrNull()
        }

    private val weight: Double?
        get() {
            return weightInput.toDoubleOrNull()
        }

    val bmiResult: String
        get() {
            return if (height !=null && weight !=null && height != 0.0){
                val bmiResult = weight!! / (height!! * height!!)
                String.format("%.2f", bmiResult)
            }else {
                "0.00"
            }
        }
}