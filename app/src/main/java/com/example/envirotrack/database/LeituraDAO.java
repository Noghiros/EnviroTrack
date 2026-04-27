package com.example.envirotrack.database;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.envirotrack.model.Leitura;

import java.util.List;

@Dao
public interface LeituraDAO {

    @Insert
    void inserir(Leitura leitura);

    @Query("SELECT * FROM leitura WHERE sensorId = :sensorId ORDER BY dataHora DESC")
    List<Leitura> listarPorSensor(int sensorId);
}