package com.example.kotlinsamples.`07`

/**
 *  author:guoyizhe
 *  date:19-5-27
 *  email:guoyizhe@xiaomi.com
 */
fun main(){

}
//final	不能被覆写	在kotlin中默认所有的方法和类都是final属性
//open	可以被覆写	需要被明确指出
//abstract	必须要覆写	不能被实例化，默认具有open属性。
//override	覆写超类的方法	如果没有被指定为final，则默认具有open属性

open class Outer{
    private val a = 1
    protected open val b = 2
    internal val c = 3//模块内访问
    val e = 4//默认是public访问属性

    protected  class Nested{
        public val e :Int = 10
    }
}
class SubClass : Outer(){
    //a不可访问
    //b,c,d可访问
    //Nested和e可访问
    override val b = 11
}
