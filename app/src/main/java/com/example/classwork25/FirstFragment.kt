package com.example.classwork25

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class FirstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val action = FirstFragmentDirections
            .actionFirstFragmentToSecondFragment(345)
        view.findViewById<Button>(R.id.toSeckond).setOnClickListener{
            findNavController().navigate(action)
        }

        val textView = view.findViewById<TextView>(R.id.idName)

        val myRunnable = Runnable {
            Thread.sleep(2000)
            textView.post {
                textView.text = "kakoito text"
            }
        }

        Thread(myRunnable).start()
    }
}