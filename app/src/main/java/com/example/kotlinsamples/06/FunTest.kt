package com.example.kotlinsamples.`06`

import com.example.kotlinsamples.out

/**
 *  author:guoyizhe
 *  date:19-5-27
 *  email:guoyizhe@xiaomi.com
 */
fun main(){
    test()
    test(12,"hello","world")

    var myfun : (Int,Int)->Int
    myfun = ::pow//函数赋值
    out(myfun(3,4))

    var funcc= getMathFunc("cube")
    out(funcc(19))

}

fun test(a : Int = 5,vararg params:String){
    out("a = ${a}")
    if (params.size > 0)
        out(params[0])
}



fun pow(base : Int,exponent : Int) : Int{
    var result = 1
    for (i in base .. exponent){
        result *= i
    }
    return result
}

fun getMathFunc(type:String) : (Int) ->Int{
    fun square(n : Int):Int{
        return n * n
    }
    fun cube(n : Int) : Int{
        return n * n * n
    }
    when(type){
        "square" -> return ::square
        "cube" -> return ::cube
        else -> return ::square
    }
}