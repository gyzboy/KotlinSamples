package com.example.kotlinsamples.`01`

import com.example.kotlinsamples.out

/**
 *  author:guoyizhe
 *  date:${DATA}
 *  email:guoyizhe@xiaomi.com
 */

//kotlin支持函数式编程
fun main(args:Array<String>){
    println("this is first kotlin");
    var str = "this is string" //可以不加 ; 分隔符
    out(str)
    str +=
            123  //可以跨行
    out(str)
    val len = str
        .length //属性也可以跨行
    out(len)
}