public class EjemploEstatico {
    // Variable estática
    static int contador = 0;

    // Método estático
    static void incrementarContador() {
        contador++;
    }

    public static void main(String[] args) {
        // Accediendo a la variable y al método estático sin crear un objeto
        EjemploEstatico.incrementarContador();
        EjemploEstatico.incrementarContador();
        EjemploEstatico.incrementarContador();
        System.out.println("El contador es: " + EjemploEstatico.contador);
    }
}
