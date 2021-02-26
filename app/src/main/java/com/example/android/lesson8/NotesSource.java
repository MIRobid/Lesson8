package com.example.android.lesson8;

public interface NotesSource {
    NotesInfo getCardData(int position);
    int size();
}
