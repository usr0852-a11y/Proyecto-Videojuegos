package net.salesianoslacuesta.gestor;

import java.util.ArrayList;

import net.salesianoslacuesta.videojuegos.Videojuegos;

public class Gestor {
    private ArrayList<Videojuego> listaVideojuegos;
    private int totalAñadidos;

    public Gestor() {
        listaVideojuegos = new ArrayList<>();
        totalAñadidos = 0;
    }

    // Getters

    public ArrayList<Videojuego> getListaVideojuegos() {
        return listaVideojuegos;
    }
    public int getTotalAñadidos() {
        return totalAñadidos;
    }

    // Setters
    public void setListaVideojuegos(ArrayList<Videojuego> listaVideojuegos) {
        this.listaVideojuegos = listaVideojuegos;
    }

    public void setTotalAñadidos(int totalAñadidos) {
        this.totalAñadidos = totalAñadidos;
    }
}


