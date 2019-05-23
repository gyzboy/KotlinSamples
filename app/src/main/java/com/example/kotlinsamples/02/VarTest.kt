package com.example.kotlinsamples.`02`

import com.example.kotlinsamples.out

/**
 *  author:guoyizhe
 *  date:19-5-17
 *  email:guoyizhe@xiaomi.com
 */
fun main(){
    var a:Int = 5//声明时指明类型和值
    val b:String
    b = "4"//这个算是初次赋值
    out(b)
    val c:Int
    //out(c)  必须初始化

    val pm1:Int = 200//被映射成java的int
    val pm2:Int = 200
    out(pm1 == pm2)//基本类型比较,返回true

    val ob1:Int? = 300//被映射成java的Integer
    val ob2:Int? = 300
    out(ob1 == ob2)//返回false

    //kotlin不支持八进制
    val binValue1 = 0b1010101
    val binValue2 = 0B10101110
    out(binValue1)
    out(binValue2)

    val hexValue1 = 0x13
    val hexValue2 = 0xaF
    out("hexValue1 = ${hexValue1}")//字符串模板
    out("hexValue2 = ${hexValue2}")

    val oneMillion = 1_000_000//kotlin支持加上_让数字可读性更高
    out("oneMillion = ${oneMillion}")

    out("正无穷大相比:${5.0/0 == 10.0 / 0}")//true
    out("负无穷大相比:${-5.0/0 == -10.0 / 0}")//true
    out("正负无穷大相比:${5.0/0 == -10.0 / 0}")//false

    val cc = 0.0
    val nan = cc / cc
    out("两个非数是否相等:${nan == nan}")//false


}