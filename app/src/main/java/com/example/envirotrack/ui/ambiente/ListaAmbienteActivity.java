package com.example.envirotrack.ui.ambiente;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.example.envirotrack.R;
import android.content.Intent;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class ListaAmbienteActivity extends AppCompatActivity {

    private RecyclerView recyclerAmbientes;
    private FloatingActionButton fabAdicionar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_ambiente);

        recyclerAmbientes = findViewById(R.id.recyclerAmbientes);
        recyclerAmbientes.setLayoutManager(new LinearLayoutManager(this));

        fabAdicionar = findViewById(R.id.fabAdicionarAmbiente);
        fabAdicionar.setOnClickListener(v -> {
            Intent intent = new Intent(this, CadastroAmbienteActivity.class);
            startActivity(intent);
        });
    }
}