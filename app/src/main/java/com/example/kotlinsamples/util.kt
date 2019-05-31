package com.example.kotlinsamples

import java.util.*

/**
 *  author:guoyizhe
 *  date:19-5-17
 *  email:guoyizhe@xiaomi.com
 */

fun <T> out(objects: T){
    println(objects.toString())
}

fun <T> outArray(objects: Array<T>){
    for (i in 0 until objects.size){
        out(objects.get(i))
    }
}

fun outIntArray(objects: IntArray){
    for (i in 0 until objects.size){
        out(objects.get(i))
    }
}

fun outLine(){
    out("---------------------------------")
}