package com.example.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_next_distant.*

/**
 * A simple [Fragment] subclass.
 */
class NextDistant : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        //var student = NextDistantArgs.fromBundle(arguments)

        //nextDistant.text = student.toString()
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_next_distant, container, false)
    }

}
