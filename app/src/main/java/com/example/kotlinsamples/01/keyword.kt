package com.example.kotlinsamples.`01`

import android.provider.ContactsContract

/**
 *  author:guoyizhe
 *  date:19-5-17
 *  email:guoyizhe@xiaomi.com
 */
fun main(){

    hardKey()
    softKey()
    modificationKey()

}

fun hardKey(){
    //硬关键字:任何时刻,地点都不可用,包括JAVA所有
    //as:import时的别名或者类型转换
    //as? :安全的类型转换
    //in : 在for循环中使用,在when中使用
    //is : == instanceof或者在when中使用
    //val :只读属性或者变量 = final
    //var :可变属性或者变量
    //let : 改变参数名or自动判空
    //with : 将对象作为函数的参数
    //run : with和let的结合体
    //apply : 与run一致,apply返回的是一个对象
    letTest()
    withTest()
    runTest()
}

fun runTest() {
    val user = User("Kotlin", 1, "1111111")

    val result = user.run {
        println("my name is $name, I am $age years old, my phone number is $phoneNum")
        1000
    }
}

fun withTest() {
    val user = User("Kotlin", 1, "1111111")

    val result = with(user) {
        println("my name is $name, I am $age years old, my phone number is $phoneNum")
        1000
    }

}

open class User{

    constructor(name:String,age:Int,num:String){

    }

    lateinit var name:String
    var age:Int = 0
    lateinit var phoneNum:String
}

fun letTest() {
//    object.let{
//        it.todo()//在函数体内使用it替代object对象去访问其公有的属性和方法
//        ...
//    }
//
//    //另一种用途 判断object为null的操作
//    object?.let{//表示object不为null的条件下，才会去执行let函数体
//        it.todo()
//    }
}

fun softKey(){
    //软关键字:在不起作用的上下文中可用
    //by :将接口或者祖先类的实现代理给其他对象
    //constructor :声明构造器
    //init : 声明初始化块
    //where :为泛型参数增加限制
}

fun modificationKey(){
    //修饰符关键字:在代码中可用作标识符
    //data : 声明数据类
    //external : = java native
    //infix : 以双目运算符格式执行
    //inner : 声明内部类

}