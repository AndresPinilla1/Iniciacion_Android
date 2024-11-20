package com.example.iniciacion_android.Adaptador;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.iniciacion_android.Utilidades.Jugador;
import com.example.iniciacion_android.R;

import java.util.List;

public class JugadorAdapter extends RecyclerView.Adapter<JugadorAdapter.RecyclerHolder> {
    // Atributos
    private List<Jugador> listaJugadores;
    private Context context;
    private OnItemClickListener listener;

    // Interfaz para manejar los clics
    public interface OnItemClickListener {
        void onItemClick(int position);
        void onItemLongClick(int position);
    }

    // Constructor
    public JugadorAdapter(Context context, List<Jugador> itemList, OnItemClickListener listener) {
        this.context = context;
        this.listaJugadores = itemList;
        this.listener = listener;
    }
    // Métodos Recycler
    @NonNull
    @Override
    public JugadorAdapter.RecyclerHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_jugador_adapter, parent, false);
        return new RecyclerHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull JugadorAdapter.RecyclerHolder holder, int position) {
        // Obtenemos la posición del jugador
        Jugador jugador = listaJugadores.get(position);
        // Asignamos el nombre y la imagen
        holder.titulo.setText(jugador.getNombreJugador());
        holder.imgJugador.setImageResource(jugador.getImagenId());
        // Implementamos los clics para cada jugador
        holder.itemView.setOnClickListener(v -> listener.onItemClick(position));
        holder.itemView.setOnLongClickListener(v -> {
            listener.onItemLongClick(position);
            return true;
        });
    }

    @Override
    public int getItemCount() {
        return listaJugadores.size();
    }

    public static class RecyclerHolder extends RecyclerView.ViewHolder {
        // Las vistas para cada jugador
        ImageView imgJugador;
        TextView titulo;
        // Constructor para asociar cada vista
        public RecyclerHolder(@NonNull View itemView) {
            super(itemView);
            imgJugador = itemView.findViewById(R.id.img_item);
            titulo = itemView.findViewById(R.id.txt_item_tittle);
        }
    }
}
