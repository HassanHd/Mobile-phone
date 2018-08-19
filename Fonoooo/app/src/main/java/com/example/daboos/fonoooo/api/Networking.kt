package com.example.daboos.fonoooo.api

import com.example.daboos.fonoooo.Mobile
import com.example.daboos.fonoooo.util.Constant
import com.rx2androidnetworking.Rx2AndroidNetworking
import io.reactivex.Observable
import io.reactivex.Scheduler
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

object Networking {
    fun getMobile():Observable<List<Mobile>>{

        return Rx2AndroidNetworking.get(Constant.Api.BASE_URL)
                .addQueryParameter(Constant.Api.TOKEN_KEY,Constant.Api.TOKEN_VALUE)
                .build()
                .getObjectListObservable(Mobile::class.java)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
    }
}