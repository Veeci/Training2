package com.example.core.usecases

import com.example.core.data.Note
import com.example.core.repositories.NoteRepository

class RemoveNote(private val noteRepository: NoteRepository)
{
    suspend operator fun invoke(note: Note) = noteRepository.removeNote(note)
}