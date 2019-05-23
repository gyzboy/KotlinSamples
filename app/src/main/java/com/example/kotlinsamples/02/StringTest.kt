package com.example.kotlinsamples.`02`

/**
 *  author:guoyizhe
 *  date:19-5-20
 *  email:guoyizhe@xiaomi.com
 */
fun main(){
    var s:String = "kotlintest"
    println(s.commonPrefixWith("kotlin"))//相同前缀
    println(s.commonSuffixWith("test"))//相同后缀
    println(s.capitalize())//首字母大写
    println(s.decapitalize())//首字母小写
    println(s.contains(Regex("\\d{3}")))//kotlin的contains方法支持正则

}