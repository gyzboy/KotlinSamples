package com.example.kotlinsamples.`02`

/**
 *  author:guoyizhe
 *  date:19-5-20
 *  email:guoyizhe@xiaomi.com
 */
class A{
    inner class Inner
}
class B{
    inner class Inner{
        var c:Int = 3;
    }
}
typealias AInner = A.Inner
typealias BInner = B.Inner
fun main(){
    var a:AInner = A().Inner()
    var b = B().Inner()
    b.c = 5
    println(b.c)
}