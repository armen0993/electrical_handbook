package com.electrical.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.cardview.widget.CardView
import kotlin.system.exitProcess


class ExitFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_exit, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val btnYes = view.findViewById<Button>(R.id.buttonYes)
        val btnNo = view.findViewById<Button>(R.id.buttonNo)
        btnYes.setOnClickListener {
            this.activity?.finish()
            exitProcess(0)
        }
        btnNo.setOnClickListener {
            this.activity?.onBackPressed()

        }
    }
}