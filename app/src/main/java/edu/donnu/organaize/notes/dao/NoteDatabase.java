package edu.donnu.organaize.notes.dao;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Note.class},version = 2)
public abstract class NoteDatabase extends RoomDatabase {
    public abstract NoteDao noteDao();
}
