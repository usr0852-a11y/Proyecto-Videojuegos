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
        this.puntuacion = puntuacion;

    }

    // Getters

    public String getNombre() {
        return nombre;
    }

    public String getGenero() {
        return genero;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public void setPuntuacion(int puntuacion) {
         if (puntuacion >= 1 && puntuacion <= 5) {
            this.puntuacion = puntuacion;
        } else {
            this.puntuacion = 1;
        }
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Género" + genero + ", Plataforma" + plataforma + ", Puntuacion: " + puntuacion;
    }

}