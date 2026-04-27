package com.example.envirotrack.model;

import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(
        tableName = "sensor",
        foreignKeys = @ForeignKey(
                entity = Ambiente.class,
                parentColumns = "id",
                childColumns = "ambienteId",
                onDelete = ForeignKey.CASCADE
        )
)
public class Sensor {

    @PrimaryKey(autoGenerate = true)
    public int id;

    public int ambienteId;
    public String tipo;
    public String unidade;
    public double valorMin;
    public double valorMax;
}