package com.example.kotlinsamples.`04`

import com.example.kotlinsamples.out

/**
 *  author:guoyizhe
 *  date:19-5-23
 *  email:guoyizhe@xiaomi.com
 */
fun main(){
    var max = 7
    for (num in 1..max){//包括边界1和7
        out(num)
    }
    for (num in 1 until max){//包括左边界不包括右边界
        out(num)
    }

}