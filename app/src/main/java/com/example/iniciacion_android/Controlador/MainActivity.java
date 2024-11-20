package com.example.iniciacion_android.Controlador;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.iniciacion_android.R;

public class MainActivity extends AppCompatActivity {
    // Atributos
    private Button btn_Registro;
    private Button btn_Lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        // Variables botones
        btn_Registro = findViewById(R.id.btnRegistro);
        btn_Lista = findViewById(R.id.btnLista);
        // Boton Resgistrar
        btn_Registro.setOnClickListener(v -> {
            // Creamos un Intent para cambiar de la actividad actual
            Intent intent = new Intent(MainActivity.this, Registro.class);
            startActivity(intent);
        });
        // Boton Lista
        btn_Lista.setOnClickListener(v ->{
            // Creamos un Intent para cambiar de la actividad actual
            Intent intent2 = new Intent(MainActivity.this, Lista.class);
            startActivity(intent2);
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}