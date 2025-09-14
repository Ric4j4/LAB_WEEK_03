package com.example.lab_week_03

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class DetailFragment : Fragment() {

    companion object {
        const val COFFEE_ID = "COFFEE_ID"
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val coffeeId = arguments?.getInt(COFFEE_ID) ?: 0
        setCoffeeData(view, coffeeId)

        view.findViewById<Button>(R.id.back_button).setOnClickListener {
            findNavController().navigateUp()
        }
    }

    private fun setCoffeeData(view: View, id: Int) {
        val title = view.findViewById<TextView>(R.id.coffee_title)
        val desc = view.findViewById<TextView>(R.id.coffee_desc)

        when (id) {
            R.id.affogato -> {
                title.setText(R.string.affogato_title)
                desc.setText(R.string.affogato_desc)
            }
            R.id.americano -> {
                title.setText(R.string.americano_title)
                desc.setText(R.string.americano_desc)
            }
            R.id.latte -> {
                title.setText(R.string.latte_title)
                desc.setText(R.string.latte_desc)
            }
            R.id.cappuccino -> {
                title.setText(R.string.cappuccino_title)
                desc.setText(R.string.cappuccino_desc)
            }
            R.id.espresso -> {
                title.setText(R.string.espresso_title)
                desc.setText(R.string.espresso_desc)
            }
        }
    }
}
