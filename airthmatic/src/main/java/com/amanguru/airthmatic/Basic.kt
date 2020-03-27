package com.amanguru.airthmatic

class Basic {

    fun oprations(a:Int,b:Int,c:Int):Int
    {
       when(c)
       {
           1->return a+b
           2->return a-b
           3->return a*b
           else->return 0
       }
    }
}