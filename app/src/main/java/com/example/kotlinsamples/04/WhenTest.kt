package com.example.kotlinsamples.`04`

import com.example.kotlinsamples.out

/**
 *  author:guoyizhe
 *  date:19-5-23
 *  email:guoyizhe@xiaomi.com
 */
fun main(){
    //when取代了java的switch
    var score = 'A'
    when(score){
        'A'-> {
            out("Good")
            out("Good2")
        }
        'B' -> out("Good")
        else -> out("no Good")
    }
}

fun typeDetect(inputType:Any){
    when(inputType){
        is Int -> inputType.toString()
        is Double -> inputType.toInt()
        else -> 0.0
    }
}