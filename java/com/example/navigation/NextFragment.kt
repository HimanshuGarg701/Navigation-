package com.example.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.navigation.databinding.FragmentNextBinding

/**
 * A simple [Fragment] subclass.
 */
class NextFragment : Fragment() {

    private lateinit var binding : FragmentNextBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_next, container, false)

        binding.nextDistant.setOnClickListener {
            val student = Student("Mike", 54678546)
            it.findNavController().navigate(NextFragmentDirections.actionNextFragmentToNextDistant2(student))
        }


        return binding.root
    }

}
