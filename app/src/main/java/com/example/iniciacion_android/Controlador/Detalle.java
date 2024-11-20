package com.example.iniciacion_android.Controlador;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.iniciacion_android.Utilidades.Jugador;
import com.example.iniciacion_android.R;

public class Detalle extends AppCompatActivity {
    // Atributos
    private ImageView img_item;
    private TextView txt_item_tittle;
    private TextView txt_item_desc;
    private TextView txt_desc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_detalle);
        // Variables
        img_item = findViewById(R.id.img_item);
        txt_item_tittle = findViewById(R.id.txt_item_tittle);
        txt_item_desc = findViewById(R.id.txt_item_desc);
        txt_desc = findViewById(R.id.txt_desc);
        txt_desc.setMovementMethod(new ScrollingMovementMethod());
        // Obtenemos los datos del jugador
        Jugador jugador = (Jugador) getIntent().getSerializableExtra("jugador");
        // Asignamos los datos
        txt_item_tittle.setText(jugador.getNombreJugador());
        img_item.setImageResource(jugador.getImagenId());
        txt_item_desc.setText(jugador.getDescripcion());
        txt_desc.setText(jugador.getDescripcionExtra());

    }
}