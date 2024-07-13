package com.example.core.usecases

import com.example.core.repositories.NoteRepository

class GetNote(private val noteRepository: NoteRepository)
{
    suspend operator fun invoke(id: Long) = noteRepository.getNote(id)
}