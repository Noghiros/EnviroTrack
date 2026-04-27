package com.example.envirotrack.database;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.envirotrack.model.Ambiente;

import java.util.List;

@Dao
public interface AmbienteDAO {

    @Insert
    void inserir(Ambiente ambiente);

    @Update
    void atualizar(Ambiente ambiente);

    @Delete
    void deletar(Ambiente ambiente);

    @Query("SELECT * FROM ambiente")
    List<Ambiente> listarTodos();
}