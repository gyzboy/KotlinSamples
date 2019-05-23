package com.example.kotlinsamples.`02`

import com.example.kotlinsamples.out

/**
 *  author:guoyizhe
 *  date:19-5-17
 *  email:guoyizhe@xiaomi.com
 */
fun main(){
    //1.直接单引号,'A'
    //2.转义字符,'\n'
    //3.Unicode,'\uXXXX'
    var aChar:Char = 'A'
    var bChar:Char = '\t'
    out(aChar)
    out(bChar)
    val cChar = '\u9999'
    out(cChar)
    val dChar:Char = '我'
//    val aInt:Int = dChar//error kotlin中char不能直接当做int使用

    out(aChar + 1)//会先变为unicode值,然后再变为char值
    out(aChar - bChar)//只支持减法
//    out(aChar + bChar)
}