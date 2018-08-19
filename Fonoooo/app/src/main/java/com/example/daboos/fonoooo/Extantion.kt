package com.example.daboos.fonoooo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

fun ViewGroup.inflat(layoutId:Int):View{
 return LayoutInflater.from(this.context).inflate(layoutId,this,false)


}