package com.example.kotlinsamples.`05`

import com.example.kotlinsamples.out
import com.example.kotlinsamples.outArray
import com.example.kotlinsamples.outIntArray

/**
 *  author:guoyizhe
 *  date:19-5-23
 *  email:guoyizhe@xiaomi.com
 */
fun main(){
    var arr1 = arrayOf("1","2")//相当于静态数组初始化
    outArray(arr1)
    var arr11 = intArrayOf(2,3,4)
    outIntArray(arr11)
    var arr2 = arrayOfNulls<String>(4)//动态数组初始化,默认值为NULL
    outArray(arr2)
    var arr3 = emptyArray<String>()//创建长度为0的数组
    outArray(arr3)

    var arr4 = IntArray(5,{it * it})//输出0,1,4,9,16
    outIntArray(arr4)

    for (s in arr1){
        out(s)
    }
    for (s in arr1.indices){//返回arr1的索引
        out(arr1[s])
    }
    out(arr1[arr1.lastIndex])
    for ((index,value) in arr1.withIndex()){
        out("索引为${index},value为${value}")
    }

    out(arr11.all { it > 10 })//所有元素是否满足条件
    out(arr11.any { it == 2 })//是否有元素满足

    var result = arr1.associate { it + "hello" to it + "world" }//组成key-value的map形式
    out(result)

    out(arr11.fold(0,{total, next -> total + next }))//next初始值为0,然后total叠加

    var map = mutableMapOf(1 to 100,2 to 200)
    arr11.associateByTo(map,{it * it})
    out(map)

    out(arr11.contentEquals(arr11))
}