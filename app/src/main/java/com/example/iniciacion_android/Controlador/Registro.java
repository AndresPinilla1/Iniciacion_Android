package com.example.iniciacion_android.Controlador;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.iniciacion_android.R;

public class Registro extends AppCompatActivity {
    // Atributos
    private EditText et_Nombre;
    private EditText et_Email;
    private EditText et_Edad;
    private Button btn_Registrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_registro);
        // Variables
        et_Nombre = findViewById(R.id.etNombre);
        et_Email = findViewById(R.id.etEmail);
        et_Edad = findViewById(R.id.etEdad);
        btn_Registrar = findViewById(R.id.btnRegistrar);
        // Funcion onclicklistener
        btn_Registrar.setOnClickListener(v -> {
            // Obtenemos los datos introducidos
            String nombre = et_Nombre.getText().toString();
            String email = et_Email.getText().toString();
            String edad = et_Edad.getText().toString();
            // Comprobamos si los campos están vacíos
            if (nombre.isEmpty() || email.isEmpty() || edad.isEmpty()) {
                Toast.makeText(this, "Rellena todos los campos", Toast.LENGTH_LONG).show();
                return;
            }
            // Comprobamos si es mayor de edad
            int n_edad = Integer.parseInt(edad);
            if (n_edad < 18) {
                Toast.makeText(this, "Debes ser mayor de 18 años", Toast.LENGTH_LONG).show();
            } else {
                Toast.makeText(this, "Registrado", Toast.LENGTH_SHORT).show();
                finish();
            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }


}
