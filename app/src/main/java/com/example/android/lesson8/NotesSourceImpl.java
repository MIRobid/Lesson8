package com.example.android.lesson8;
import android.content.res.Resources;
import android.content.res.TypedArray;

import java.util.ArrayList;
import java.util.List;

public class NotesSourceImpl implements NotesSource {
    private List<NotesInfo> dataSource;
    private Resources resources;    // ресурсы приложения

    public NotesSourceImpl(Resources resources) {
        dataSource = new ArrayList<>(7);
        this.resources = resources;
    }

    public NotesSourceImpl init(){
        // строки заголовков из ресурсов
        String[] titles = resources.getStringArray(R.array.titles);
        // строки описаний из ресурсов
        String[] descriptions = resources.getStringArray(R.array.descriptions);
        // заполнение источника данных
        for (int i = 0; i < descriptions.length; i++) {
            dataSource.add(new NotesInfo(titles[i], descriptions[i], false));
        }
        return this;
    }

    public NotesInfo getCardData(int position) {
        return dataSource.get(position);
    }

    public int size(){
        return dataSource.size();
    }

}
