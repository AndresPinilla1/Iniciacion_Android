package com.example.iniciacion_android.Controlador;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.ActionMode;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.iniciacion_android.Adaptador.JugadorAdapter;
import com.example.iniciacion_android.Utilidades.Jugador;
import com.example.iniciacion_android.Utilidades.Utilidades;
import com.example.iniciacion_android.R;

import java.util.List;
// Implementamos la interfaz OnItemClickListener
public class Lista extends AppCompatActivity implements JugadorAdapter.OnItemClickListener {
    // Atributos
    private List<Jugador> listaJugadores;
    private JugadorAdapter adapter;
    private androidx.appcompat.view.ActionMode mActionMode;
    private int posicionSeleccionada = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_lista);
        // Obtenemos los datos de la lista
        listaJugadores = Utilidades.getData();
        RecyclerView recyclerView = findViewById(R.id.recView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        // Creamos el adaptador y lo asignamos al RecyclerView
        adapter = new JugadorAdapter(this, listaJugadores, this);
        recyclerView.setAdapter(adapter);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    // Método para un solo click
    @Override
    public void onItemClick(int position) {
        // Iniciamos la actividad Detalle para el jugador seleccionado
        Intent intent = new Intent(Lista.this, Detalle.class);
        intent.putExtra("jugador", listaJugadores.get(position));
        startActivity(intent);
    }
    // Método para cuando mantenemos el click
    @Override
    public void onItemLongClick(int position) {
        // Si ya hay un ActionMode activo, no hacemos nada
        if (mActionMode != null) return;
        // Posicion del jugador seleccionado
        posicionSeleccionada = position;
        // Iniciamos el ActionMode
        mActionMode = startSupportActionMode(mActionCallback);
    }
    // Callback para el ActionMode
    private ActionMode.Callback mActionCallback = new ActionMode.Callback() {
        @Override
        public boolean onCreateActionMode(ActionMode mode, android.view.Menu menu) {
            // Action menu
            mode.getMenuInflater().inflate(R.menu.action_menu, menu);
            mode.setTitle("Opciones");
            return true;
        }

        @Override
        public boolean onPrepareActionMode(ActionMode mode, android.view.Menu menu) {
            return false;
        }

        @Override
        public boolean onActionItemClicked(ActionMode mode, MenuItem menuItem) {
            // Llama la función
            confirmDelete();
            // Terminamos el ActionMode
            mode.finish();
            return true;
        }

        @Override
        public void onDestroyActionMode(ActionMode actionMode) {
            mActionMode = null;
        }
    };

    private void confirmDelete() {
        // Creamos un diálogo de confirmación para eliminar el jugador
        new AlertDialog.Builder(this)
                .setTitle("Confirmar eliminación")
                .setMessage("¿Seguro que quieres eliminar este jugador?")
                // Si se elimina el jugador
                .setPositiveButton("Sí", (dialog, which) -> {
                    if (posicionSeleccionada != -1) {
                        // Llamamos a la función para eliminar el jugador
                        Utilidades.eliminarJugador(posicionSeleccionada);
                        // Indicamos que el jugador ha sido eliminado
                        adapter.notifyItemRemoved(posicionSeleccionada);
                        adapter.notifyItemRangeChanged(posicionSeleccionada, listaJugadores.size());
                        Toast.makeText(this, "Jugador eliminado", Toast.LENGTH_SHORT).show();
                    }
                })
                // Si no se elimina el jugador
                .setNegativeButton("No", (dialog, which) -> Toast.makeText(this, "Acción cancelada", Toast.LENGTH_SHORT).show())
                .show();
    }
}