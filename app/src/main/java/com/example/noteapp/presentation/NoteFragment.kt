package com.example.noteapp.presentation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.noteapp.R
import com.google.android.material.floatingactionbutton.FloatingActionButton

class NoteFragment : Fragment() {
    private lateinit var checkNoteButton: FloatingActionButton

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_note, container, false)

        checkNoteButton = view.findViewById(R.id.checkButton)

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        checkNoteButton.setOnClickListener {
            Navigation.findNavController(it).popBackStack()
        }
    }
}