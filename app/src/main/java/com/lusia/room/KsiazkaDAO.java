package com.lusia.room;

import androidx.room3.Dao;
import androidx.room3.Delete;
import androidx.room3.Insert;
import androidx.room3.Query;
import androidx.room3.Update;

import java.util.List;

@Dao
public interface KsiazkaDAO {
    @Insert
    public void wstawKsiazkeDoBazy(Ksiazka ksiazka);
    @Insert
    public void wstawKsiazkeDoBazy(Ksiazka ... ksiazki);
    @Delete
    public void usunZBazy(Ksiazka ksiazka);
    @Update
    public void aktualizujKsiazke(Ksiazka ksiazka);
    @Query("SELECT * FROM ksiazki")
    public List<Ksiazka> zwrocWszystkieKsiazki();
    @Query("SELECT nazwa FROM ksiazki WHERE liczbaStron = :ile")
    public List<Ksiazka> zwrocNazwyKsiazekOTejLiczbieStron();
}
