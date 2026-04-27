package com.example.envirotrack.model;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "Ambiente")
public class Ambiente {

    @PrimaryKey(autoGenerate = true)
    public int id;

    public String nome;
    public String tipo;
    public String descricao;
}