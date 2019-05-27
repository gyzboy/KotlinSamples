package com.example.kotlinsamples.`07`

import com.example.kotlinsamples.out

/**
 *  author:guoyizhe
 *  date:19-5-27
 *  email:guoyizhe@xiaomi.com
 */
fun main(){
    var c : Any = 1
//    var b = c as String
//    out(b)//转换失败抛出Exception
    var d = c as? String
    out(d)//转换失败返回NULL

}