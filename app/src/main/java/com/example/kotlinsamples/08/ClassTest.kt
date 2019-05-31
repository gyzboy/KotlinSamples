package com.example.kotlinsamples.`08`

import com.example.kotlinsamples.out

/**
 *  author:guoyizhe
 *  date:19-5-28
 *  email:guoyizhe@xiaomi.com
 */
fun main(){
    var o = Out()
    var i :Out.In//可以没有括号
    var ii  = Out().In("hello class")//必须有括号,相当于新建了对象然后再创建In对象
}
class Out(){
    inner class In(msg : String){
        init {
            out(msg)
        }
    }
}