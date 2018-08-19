package com.example.daboos.fonoooo


import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.daboos.fonoooo.api.Networking
import kotlinx.android.synthetic.main.fragment_main.*


class MainFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        recyclerView.layoutManager=LinearLayoutManager(activity)
        Networking.getMobile()
                .subscribe { list ->


                        val adapter=MobileAdapter(activity!!,list)
                    recyclerView.adapter=adapter
                    }
                }


    }



