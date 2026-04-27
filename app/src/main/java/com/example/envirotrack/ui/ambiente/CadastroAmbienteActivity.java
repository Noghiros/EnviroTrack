package com.example.envirotrack.ui.ambiente;

import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.example.envirotrack.R;
import android.widget.Button;
import android.widget.Toast;
import com.example.envirotrack.database.AppDataBase;
import com.example.envirotrack.model.Ambiente;
import com.google.android.material.textfield.TextInputEditText;

public class CadastroAmbienteActivity extends AppCompatActivity {

    private TextInputEditText etNome, etTipo, etDescricao;
    private AppDataBase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_ambiente);

        db = AppDataBase.getInstancia(this);

        etNome = findViewById(R.id.etNome);
        etTipo = findViewById(R.id.etTipo);
        etDescricao = findViewById(R.id.etDescricao);

        Button btnSalvar = findViewById(R.id.btnSalvar);
        btnSalvar.setOnClickListener(v -> salvarAmbiente());
    }

    private void salvarAmbiente() {
        String nome = etNome.getText().toString().trim();
        String tipo = etTipo.getText().toString().trim();
        String descricao = etDescricao.getText().toString().trim();

        if (nome.isEmpty()) {
            etNome.setError("Informe o nome do ambiente");
            return;
        }

        Ambiente ambiente = new Ambiente();
        ambiente.nome = nome;
        ambiente.tipo = tipo;
        ambiente.descricao = descricao;

        db.ambienteDao().inserir(ambiente);

        Toast.makeText(this, "Ambiente salvo!", Toast.LENGTH_SHORT).show();
        finish();
    }
}