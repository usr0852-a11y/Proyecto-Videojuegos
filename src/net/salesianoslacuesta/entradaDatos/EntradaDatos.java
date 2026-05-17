package net.salesianoslacuesta.entradaDatos;

import javax.swing.JOptionPane;

public class EntradaDatos {
    public static String pedirTexto(String mensaje) {
        String texto = JOptionPane.showInputDialog(null, mensaje);

        while (texto == null || texto.equals("")) {
            JOptionPane.showMessageDialog(null, "El texto no puede estar vacío.");
            texto = JOptionPane.showInputDialog(null, mensaje);
        }
        return texto;
    }

    public static int pedirNumero(String mensaje) {
        int numero = -1;
        boolean valido = false;

        while (!valido) {
            try {
                String texto = JOptionPane.showInputDialog(null, mensaje);
                if (texto == null || texto.equals("")) {
                    JOptionPane.showMessageDialog(null, "Debes introducir un número entero.");
                    continue;
                }

                numero = Integer.parseInt(texto);
                valido = true;

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Valor no válido, introduce un número entero.");
            }
        }
        return numero;
    }

    public static int pedirPuntuacion(String mensaje) {
        int puntuacion = -1;

        while(puntuacion < 1 || puntuacion > 5) {
            puntuacion = pedirNumero(mensaje);

            if (puntuacion < 1 || puntuacion > 5) {
                JOptionPane.showMessageDialog(null, "La puntuación debe estar entre 1 y 5.");
            }
        }
        return puntuacion;
    }
}