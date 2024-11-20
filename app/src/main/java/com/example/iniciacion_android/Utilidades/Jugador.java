package com.example.iniciacion_android.Utilidades;

import java.io.Serializable;
// Implementación de la interfaz Serializable para que se pueda pasar entre actividades
public class Jugador implements Serializable {
    // Atributos
    private String nombreJugador;
    private String descripcion;
    private String descripcionExtra;
    private int imagenId;
    // Constructor
    public Jugador(String nombreJugador, String descripcion, String descripcionExtra,int imagenId) {
        this.imagenId = imagenId;
        this.descripcion = descripcion;
        this.nombreJugador = nombreJugador;
        this.descripcionExtra = descripcionExtra;
    }
    // Getters y setters
    public String getNombreJugador() {return nombreJugador;}
    public void setNombreJugador(String nombreJugador) {this.nombreJugador = nombreJugador;}

    public String getDescripcion() {return descripcion;}
    public void setDescripcion(String descripcion) {this.descripcion = descripcion;}

    public int getImagenId() {return imagenId;}
    public void setImagenId(int imagenId) {this.imagenId = imagenId;}

    public String getDescripcionExtra() {return descripcionExtra;}
    public void setDescripcionExtra(String descripcionExtra) {this.descripcionExtra = descripcionExtra;}
}
