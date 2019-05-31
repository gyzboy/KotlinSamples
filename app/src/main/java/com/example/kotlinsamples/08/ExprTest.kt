package com.example.kotlinsamples.`08`

import com.example.kotlinsamples.out
import com.example.kotlinsamples.outLine

/**
 *  author:guoyizhe
 *  date:19-5-28
 *  email:guoyizhe@xiaomi.com
 */
fun main(){
    var ob1 = object : Outputable {//匿名内部类
        override fun output(msg: String) {
            out(msg)
        }
    }
    out(ob1.output("hello world"))

    outLine()
    var ob2 = object  {
        init {
            out("hello ob2")
        }
        //只能包含内部类,不能包含嵌套类
        inner class Foo
        var name = "hehe"
        fun test(){
            out("test 方法")
        }
    }
    out(ob2.name)
    out(ob2.test())

    outLine()
    var ob3 = object : Outputable ,Product(3.2){
        override fun output(msg: String) {
            out(msg)
        }

        override val name: String
            get() = "oh yeah"

        override fun printInfo() {
            out(name)
        }
    }
    out(ob3.output("hehe"))
    out(ob3.name)
    out(ob3.printInfo())
}
interface Outputable{
    fun output(msg:String)
}

abstract class Product(price:Double){
    abstract val name:String
    abstract fun printInfo()
}