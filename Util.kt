package com.example.myapplicationcmp.util

fun calculateTotalTip(totalBill: Double, tipPercentage: Double): Double {
    return if(totalBill>1 && totalBill.toString().isNotEmpty())
        (totalBill * tipPercentage) / 100 else 0.0

}
fun calculateTotalPerPerson(
    totalBill: Double,
    splitBy:Int,
    tipPercentage: Double
): Double{
    val bill = calculateTotalTip(totalBill=totalBill, tipPercentage = tipPercentage)+totalBill

    return (bill/splitBy)
}