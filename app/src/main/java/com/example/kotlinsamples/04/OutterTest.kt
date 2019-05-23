package com.example.kotlinsamples.`04`

import com.example.kotlinsamples.out

/**
 *  author:guoyizhe
 *  date:19-5-23
 *  email:guoyizhe@xiaomi.com
 */
fun main(){
    outer@ for (num in 1 until 8){
        for (j in 1 until num){
            if (j == 5){
                break@outer//跳出到指定循环而不是当前循环
            }
            out(j)
        }
    }

}
