package com.example.myapplication

import java.lang.Exception

val data1 = 10  // need initializing
var data2 = 10

fun main() {
    println("Hello world")

    /*** var vs val ***/
    // data1 = 20 // error!
    data2 = 20

    /*** type ***/
    val a1: Byte = 0b00001011
    val a2: Int = 123
    val a3: Short = 123
    val a4: Long = 10L
    val a5: Double = 10.0
    val a6: Float = 10.0f

    // all data types in Kotlin are Object! => nullable & can use method

    val a: Char = 'a'
    val str1: String = "Hello \n World"
    val str2: String = "int: $a2, long: $a4"  // string template

    // any type
    val data6: Any = 10
    val data3: Any = User()

    val data5: Int by lazy {
        println("in lazy")
        10
    }

    println(data5 + 10)  // in lazy \n 20

    /*** unit & Nothing ***/
    fun some(): Unit { // no return
        println(10 + 20)
    }

    fun some2(): Nothing {
        throw Exception()
    }

    /*** nullable ***/
    var noNull: Int = 10
    // noNull = null  // error!
    var yesNull: Int? = 10
    yesNull = null

    /*** function ***/
    fun some3(x: Int, y: Int = 10): Int {
        // x = 20  // can't change parameter
        return x * y  // return value
    }

    /*** collection type ***/
    val arr: Array<Int> = Array(3, { 0 })
    arr[0] = 10
    arr[1] = 20
    arr.set(2, 30)

    val arr2: IntArray = IntArray(3, { 0 })
    val arr3 = arrayOf<Int>(10, 20, 30)

    val list = listOf<Int>(10, 20, 30)  // immutable
    val mutableList = mutableListOf<Int>(10, 20, 30)  // mutable

    val set = setOf<Int>(10, 20, 30)
    val mutableSet = mutableSetOf<Int>(10, 20, 30)

    val map = mapOf<String, String>(Pair("one", "hello"), "two" to "world")

    /*** if else ***/
    var z = 10
    if (z > 0) {
        println("z > 0")
    }
    else if (z <=0 && z == 0) {
        println("z == 0")
    }
    else {
        println("z <= 0")
    }

    z = if (z > 0) {  // expression
        100
    } else {
        200
    }

    when (z) {  // switch
        100 -> println("z is 100")
        200 -> println("z is 200")
        10, 20 -> println("z is 10 or 20")
        in 0..10 -> println("data is 1...10")
        else -> {
            println("error")
        }
    }

    when {
        z <=0 -> println("z is negative")
        else -> println("z is positive")
    }

    val b = when {
        z > 0 -> "data is positive"
        else -> "data is negative"
    }

    /*** for ***/
    for (i in 1..10) {
        println(i)
    }

    // for (i in 1 until 10)
    // for (i in 2..10 step 2)
    // for (i in 10 downTo 1)
}

class User {
    var data3: Int = 5  // need initializing
    lateinit var data4: String  // succeed (not for Int, Long, Short, Double, Float, Boolean, Byte)
}
