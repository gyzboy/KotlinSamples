package com.example.kotlinsamples.`07`

import com.example.kotlinsamples.out
import java.util.*

/**
 *  author:guoyizhe
 *  date:19-5-27
 *  email:guoyizhe@xiaomi.com
 */
fun main(){
    var user = User()
//    out(user.name)//会报错
//    out(user.date)
    user.name = "hehe"
    out(user.name)
}
class User{
    lateinit var name:String
    lateinit var date:Date
}