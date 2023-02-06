package com.example.classwork25

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs

class SecondFragment : Fragment() {

    private val args: SecondFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val action = SecondFragmentDirections
            .actionSecondFragmentToThirdFragment(args.intFromFirst,"hello")
        view.findViewById<Button>(R.id.toThird).setOnClickListener{
            findNavController().navigate(action)
        }
        view.findViewById<TextView>(R.id.intFromFirst).text = args.intFromFirst.toString()
    }
}