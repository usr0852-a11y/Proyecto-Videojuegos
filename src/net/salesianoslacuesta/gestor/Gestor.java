package net.salesianoslacuesta.gestor;

import java.util.ArrayList;

import net.salesianoslacuesta.videojuegos.Videojuegos;

public class Gestor {
    private ArrayList<Videojuegos> listaVideojuegos;
    private int totalAñadidos;

    public Gestor() {
        listaVideojuegos = new ArrayList<>();
        totalAñadidos = 0;
    }

    // Getters

    public ArrayList<Videojuegos> getListaVideojuegos() {
        return listaVideojuegos;
    }
    public int getTotalAñadidos() {
        return totalAñadidos;
    }

    // Setters
    public void setListaVideojuegos(ArrayList<Videojuegos> listaVideojuegos) {
        this.listaVideojuegos = listaVideojuegos;
    }

    public void setTotalAñadidos(int totalAñadidos) {
        this.totalAñadidos = totalAñadidos;
    }

    public void añadirVideojuego( Videojuego juego) {
        listaVideojuegos.add(juego);
        totalAñadidos++;
    }

    public void listarVideojuego() {
        if (listaVideojuegos.isEmpty()) {
            System.out.println("No hay videojuegos en la lista");
        } else {
            for (int i = 0; i < listaVideojuegos.size(); i++) {
                System.out.println(listaVideojuegos.get(i));
            }
        }
    }

    public Videojuego buscarPorNombre(String nombre) {
       for (int i = 0; i < listaVideojuegos.size(); i++) {
        if (listaVideojuegos.get(i).getNombre().equals(nombre)) {
          return listaVideojuegos.get(i);  
        }
            
       }
       return null;
    }

    public boolean eliminarVideojuego(String nombre) {
        for (int i = 0; i < listaVideojuegos.size(); i++) {
            if (listaVideojuegos.get(i).getNombre().equals(nombre)) {
                listaVideojuegos.remove(i);
                totalAñadidos--;
                return true;
            }
        }
        return false;
    }

    public boolean editarVideojuego(String nombre, String nuevoNombre, String nuevoGenero, String nuevaPlataforma, int nuevaPuntuacion) {
        for (int i = 0; i < listaVideojuegos.size() ; i++) {
            Videojuegos juego = listaVideojuegos.get(i);

            if(juego.getNombre().equals(nombre)) {
                juego.setNombre(nuevoNombre);
                juego.setGenero(nuevoGenero);
                juego.setPlataforma(nuevaPlataforma);
                juego.setPuntuacion(nuevaPuntuacion);
                return true;
            }
        }
        return false;
    }
}


