package com.example.envirotrack;

import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.content.Intent;
import android.widget.Button;
import com.example.envirotrack.ui.ambiente.ListaAmbienteActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnAmbientes = findViewById(R.id.btnAmbientes);
        btnAmbientes.setOnClickListener(v -> {
            Intent intent = new Intent(this, ListaAmbienteActivity.class);
            startActivity(intent);
        });
    }
}