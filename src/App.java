import javax.swing.JOptionPane;
import net.salesianoslacuesta.gestor.Gestor;
import net.salesianoslacuesta.videojuegos.Videojuegos;
import net.salesianoslacuesta.entradaDatos.EntradaDatos;

public class App {
    public static void main(String[] args) throws Exception {
        Gestor gestor = new Gestor();
        int opcion = 0;

        do {
            opcion = mostrarMenu();
            switch (opcion) {
                case 1:
                   String nombre = EntradaDatos.pedirTexto("Nombre del videojuego: ");
                   String genero = EntradaDatos.pedirTexto("Género: ");
                   String plataforma = EntradaDatos.pedirTexto("Plataforma: ");
                   int puntuacion = EntradaDatos.pedirPuntuacion("Puntuación del 1 al 5: ");

                   Videojuegos juego = new Videojuegos(nombre, genero, plataforma, puntuacion);
                   gestor.añadirVideojuego(juego);

                   JOptionPane.showMessageDialog(null, "Juego añadido correctamente.");
                    break;
                
                case 2:
                    gestor.listarVideojuego();
                    break;

                case 3:
                    String nombreBuscar = EntradaDatos.pedirTexto("Nombre del juego a buscar: ");
                    Videojuegos encontrado = gestor.buscarPorNombre(nombreBuscar);

                    if (encontrado == null) {
                        JOptionPane.showMessageDialog(null, "No se encontró el juego.");
                    } else {
                        JOptionPane.showMessageDialog(null, encontrado.toString());
                    }
                    break;

                case 4:
                    String nombreEliminar = EntradaDatos.pedirTexto("Nombre del juego a eliminar: ");

                    if (gestor.eliminarVideojuego(nombreEliminar)) {
                        JOptionPane.showMessageDialog(null, "Juego eliminado.");
                    } else {
                        JOptionPane.showMessageDialog(null, "No se encontró el juego.");
                    }
                    break;

                case 5:
                    JOptionPane.showMessageDialog(null, "Saliendo del programa...");
                    break;
                default:

                    JOptionPane.showMessageDialog(null, "Opción no válida.");
            }
        } while (opcion != 5);

    }
     public static int mostrarMenu() {
            String menu = "1. Añadir videojuego" + " 2. Listar videojuego" + " 3. Buscar videojuego " + " 4. Eliminar videojuego" + " 5. Salir";
            return EntradaDatos.pedirNumero(menu);
        }
}
