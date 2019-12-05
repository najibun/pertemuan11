package com.najibun.nim175410171.pertemuan11.catatan

import androidx.lifecycle.LiveData
import androidx.recyclerview.widget.ListAdapter
import androidx.room.*
import com.najibun.nim175410171.pertemuan11.R

@Dao
interface NoteDao {

    @Insert
    fun insert(note: Note)

    @Update
    fun update(note: Note)

    @Delete
    fun delete(note: Note)

    @Query("DELETE FROM note_table")
    fun deleteAllNotes()

    @Query("SELECT * FROM note_table ORDER BY priority DESC")
    fun getAllNotes(): LiveData<List<Note>>

}

