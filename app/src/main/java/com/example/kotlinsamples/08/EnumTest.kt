package com.example.kotlinsamples.`08`

import com.example.kotlinsamples.out

/**
 *  author:guoyizhe
 *  date:19-5-28
 *  email:guoyizhe@xiaomi.com
 */
fun main(){
    var enumTest:EnumTest = EnumTest.valueOf("THREE")
    out(enumTest)
    out(EnumTest.ONE)
}

enum class EnumTest{
    ONE,TWO,THREE
}

interface Gender{
    fun info()
}
enum class GenderEnum(gender:String):Gender{

}