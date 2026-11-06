package com.lusia.room;

import androidx.room3.Database;
import androidx.room3.RoomDatabase;

@Database(entities = {Ksiazka.class}, version = 1)
public abstract class KsiazkaDataBase extends RoomDatabase {
    public abstract KsiazkaDAO zwrocKsiazkiDAO();
}
