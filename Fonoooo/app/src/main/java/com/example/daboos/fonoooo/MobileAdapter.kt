package com.example.daboos.fonoooo

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.item_mobile.view.*

class MobileAdapter(private val context: Context,private val mobiles:List<Mobile>): RecyclerView.Adapter<MobileAdapter.MobileHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MobileHolder {
 val view=parent.inflat(R.layout.item_mobile)
return MobileHolder(view)
    }

    override fun getItemCount()=mobiles.size

    override fun onBindViewHolder(holder: MobileHolder, position: Int) {
holder.bind(mobiles[position])


    }

    class MobileHolder(val view: View):RecyclerView.ViewHolder(view) {
fun bind(mobile: Mobile){
    view.name.text=mobile.DeviceName
    view.sizeTv.text=mobile.size
    view.brandTv.text=mobile.Brand


}
    }
}