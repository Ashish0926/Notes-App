package com.example.notes.listeners;

import com.example.notes.entities.Note;

public interface NotesListeners {
    void onNoteClicked(Note note, int position);
}
