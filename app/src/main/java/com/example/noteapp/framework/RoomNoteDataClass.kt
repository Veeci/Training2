package com.example.noteapp.framework

import android.content.Context
import com.example.core.data.Note
import com.example.core.repositories.NoteDataSource
import com.example.noteapp.framework.db.DatabaseService
import com.example.noteapp.framework.db.NoteEntity

class RoomNoteDataClass(context: Context): NoteDataSource
{
    val noteDao = DatabaseService.getInstance(context).noteDao()

    override suspend fun add(note: Note) = noteDao.addNoteEntity(NoteEntity.fromNote(note))

    override suspend fun get(id: Long): Note? = noteDao.getNoteEntity(id)?.toNote()

    override suspend fun getAll(): List<Note> = noteDao.getAllNoteEntities().map { it.toNote() }

    override suspend fun remove(note: Note) = noteDao.removeNoteEntity(NoteEntity.fromNote(note))
}