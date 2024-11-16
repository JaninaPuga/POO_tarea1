import java.util.ArrayList;
import java.util.List;

public class EjemploListaDinamica {
    public static void main(String[] args) {
        // Crear una lista de cadenas vacía
        List<String> nombres = new ArrayList<>();

        // Agregar elementos a la lista
        nombres.add("Juan");
        nombres.add("María");
        nombres.add("Pedro");

        // Imprimir la lista
        System.out.println("Lista de nombres: " + nombres);

        // Eliminar un elemento
        nombres.remove("María");

        // Imprimir la lista modificada
        System.out.println("Lista de nombres después de eliminar: " + nombres);
    }
}