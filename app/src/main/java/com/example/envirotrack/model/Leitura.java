package com.example.envirotrack.model;

import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(
        tableName = "Leitura",
        foreignKeys = @ForeignKey(
                entity = Sensor.class,
                parentColumns = "id",
                childColumns = "sensorId",
                onDelete = ForeignKey.CASCADE
        )
)
public class Leitura {

    @PrimaryKey(autoGenerate = true)
    public int id;

    public int sensorId;
    public double valor;
    public long dataHora;
}