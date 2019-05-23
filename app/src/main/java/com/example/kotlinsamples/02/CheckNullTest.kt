package com.example.kotlinsamples.`02`

/**
 *  author:guoyizhe
 *  date:19-5-20
 *  email:guoyizhe@xiaomi.com
 */
fun main(){
    var b:String? = "test"//可空类型的变量不可直接调用其属性
//    var lenn = b.length //error
    var len = if (b != null) b.length else -1
    println("b 的长度为${len}")
    b = null
    if (b != null && b.length > 0){
        println(b.length)
    }else{
        println("null string")
    }

    var c:Boolean? = null
//    if (c)//error kotlin的if条件判断中boolean必须为Boolean
    println(b?.length ?: -1)//elvis表达式,如果b为null返回?:左边的值,否则返回右边
    println(b!!.length) //强制调用,可能引起NPE

}