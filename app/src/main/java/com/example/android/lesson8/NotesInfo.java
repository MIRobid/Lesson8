package com.example.android.lesson8;

public class NotesInfo {
    private String title;       // заголовок
    private String description; // описание
    private int picture;        // изображение
    private boolean like;       // флажок

    public NotesInfo(String title, String description, boolean like){
        this.title = title;
        this.description=description;
        this.like=like;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public boolean isLike() {
        return like;
    }

}
