package net.salesianoslacuesta.videojuegos;

public class Videojuegos {
    private String nombre;
    private String genero;
    private String plataforma;
    private int puntuacion;

    public Videojuegos(String nombre, String genero, String plataforma, int puntuacion) {
        this.nombre = nombre;
        this.genero = genero;
        this.plataforma = plataforma;
        
        if (puntuacion >= 1 && puntuacion <= 5) {
            this.puntuacion = puntuacion;
        } else {
            this.puntuacion = 1;
        }

    }
}