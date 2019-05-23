package com.example.kotlinsamples.`03`

import com.example.kotlinsamples.out

/**
 *  author:guoyizhe
 *  date:19-5-21
 *  email:guoyizhe@xiaomi.com
 */
class Data(val x:Int,val y:Int){
    operator fun unaryMinus():Data{
        return Data(-x,-y);
    }
    operator fun inc():Data{
        return Data(x + 1, y +1)
    }
}

operator fun Data.not():Data{
    return Data(-x,-y)
}

operator fun Data.dec():Data{
    return Data(x.dec(), y.dec());
}

fun main(){
    val d = Data(4,10)
    out((-d).x)//执行了unaryMinus,输出-4,-10
    out(!d)//执行了not,输出-4,-10
    out(d.dec())//执行了dec
    out(d.inc())
}