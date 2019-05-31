package com.example.kotlinsamples.`08`

import com.example.kotlinsamples.out

/**
 *  author:guoyizhe
 *  date:19-5-28
 *  email:guoyizhe@xiaomi.com
 */
fun main(){
    var t = Raw()
    t.info()//可以访问扩展方法
    var tt = RawSub()
    tt.info()//子类也可以访问扩展方法
}

open class Raw{
    fun test(){
        out("this is test")
    }
}
class RawSub : Raw(){
    fun sub(){
        out("this is sub")
    }
}
fun Raw.info(){//扩展方法
    out("this is extension info")
}