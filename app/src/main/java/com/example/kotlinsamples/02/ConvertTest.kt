package com.example.kotlinsamples.`02`

import com.example.kotlinsamples.out

/**
 *  author:guoyizhe
 *  date:19-5-17
 *  email:guoyizhe@xiaomi.com
 */
fun main(){
    //kotlin不支持隐式转型
    var aShort:Short = 1
    var bByte:Byte = 2

//    var cByte:Byte = aShort//不支持
    var cByte:Byte = aShort.toByte()
    out(cByte)
    //kotlin支持表达式自动转换
    out("value1 = ${aShort + bByte}")
    out("value2 = ${aShort.toLong() + bByte.toInt()}")
    out(cByte.javaClass)//==getClass()
}