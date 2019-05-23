package com.example.kotlinsamples.`01`

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