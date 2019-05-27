package com.example.kotlinsamples.`05`

import com.example.kotlinsamples.out

/**
 *  author:guoyizhe
 *  date:19-5-27
 *  email:guoyizhe@xiaomi.com
 */
fun main(){
    var set = setOf<String>("Hello","World","You")//不可变集合
    out(set)
    var mutableSet = mutableSetOf<String>("World","Hello","You")//有序
    out(mutableSet)
    mutableSet.add("Ok")
    out(mutableSet)
    var hashSet = hashSetOf<String>("World","Hello","You")//不保证顺序
    out(hashSet)
    var linkedHashSet = linkedSetOf<String>("World","Hello","You")//有序
    out(linkedHashSet)
    var treeSet = sortedSetOf("World","Hello","You")//由小到大排序
    out(treeSet)

}