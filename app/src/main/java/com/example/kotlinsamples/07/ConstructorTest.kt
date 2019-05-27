package com.example.kotlinsamples.`07`

/**
 *  author:guoyizhe
 *  date:19-5-27
 *  email:guoyizhe@xiaomi.com
 */
fun main(){
    var c = CustomConstructor()

}

class CustomConstructor{
    var name:String
    var age:Int

    init {//先执行
        name = "123"
        age = 10
    }

    constructor(){
        name = ""
        age = 0
    }
}