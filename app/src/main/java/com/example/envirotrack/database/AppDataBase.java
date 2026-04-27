package com.example.envirotrack.database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.envirotrack.model.Ambiente;
import com.example.envirotrack.model.Leitura;
import com.example.envirotrack.model.Sensor;

@Database(entities = {Ambiente.class, Sensor.class, Leitura.class}, version = 1)
public abstract class AppDataBase extends RoomDatabase {

    private static AppDataBase instancia;

    public abstract AmbienteDAO ambienteDao();
    public abstract SensorDAO sensorDao();
    public abstract LeituraDAO leituraDao();

    public static synchronized AppDataBase getInstancia(Context context) {
        if (instancia == null) {
            instancia = Room.databaseBuilder(
                            context.getApplicationContext(),
                            AppDataBase.class,
                            "envirotrack.db"
                    )
                    .allowMainThreadQueries()
                    .fallbackToDestructiveMigration()
                    .build();
        }
        return instancia;
    }
}