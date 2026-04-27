package com.example.envirotrack.database;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.envirotrack.model.Sensor;

import java.util.List;
@Dao
public interface SensorDAO {
    @Insert
    void inserir(Sensor sensor);

    @Update
    void atualizar(Sensor sensor);

    @Delete
    void deletar(Sensor sensor);

    @Query("SELECT * FROM sensor WHERE ambienteId = :ambienteId")
    List<Sensor> listarPorAmbiente(int ambienteId);
}
