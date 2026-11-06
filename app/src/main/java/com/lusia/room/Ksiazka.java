package com.lusia.room;

import androidx.room3.Entity;
import androidx.room3.PrimaryKey;

@Entity(tableName = "ksiazki")
public class Ksiazka {
    @PrimaryKey(autoGenerate = true)
    public int id;
    public String nazwa;
    public String kategoria;
    public int kategoriaWiekowa;
    public int liczbaStron;

    public Ksiazka(int liczbaStron, int kategoriaWiekowa, String kategoria, String nazwa) {
        this.liczbaStron = liczbaStron;
        this.kategoriaWiekowa = kategoriaWiekowa;
        this.kategoria = kategoria;
        this.nazwa = nazwa;
    }
}
