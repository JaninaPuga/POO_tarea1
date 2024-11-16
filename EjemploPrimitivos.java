public class Main
{

public static void main(String[] args) {
        // Tipos numéricos enteros
        byte numeroPequeño = 127; // Utiliza un byte para números pequeños
        short numeroMediano = 32767; // Utiliza un short para números un poco más grandes
        int numeroGrande = 2147483647; // Utiliza un int para números enteros comunes
        long numeroEnorme = 9223372036854775807L; // Utiliza un long para números muy grandes

        // Tipos numéricos de punto flotante
        float numeroConDecimal = 3.14f; // Utiliza un float para números con decimales (precisión simple)
        double numeroConMuchosDecimales = 3.141592653589793; // Utiliza un double para números con muchos decimales (precisión doble)

        // Tipo booleano
        boolean esVerdadero = true;
        boolean esFalso = false;

        // Tipo carácter
        char letra = 'A';

        // Imprimimos los valores
        System.out.println("Número pequeño (byte): " + numeroPequeño);
        System.out.println("Número mediano (short): " + numeroMediano);
        System.out.println("Número grande (int): " + numeroGrande);
        System.out.println("Número enorme (long): " + numeroEnorme);
        System.out.println("Número con decimal (float): " + numeroConDecimal);
        System.out.println("Número con muchos decimales (double): " + numeroConMuchosDecimales);
        System.out.println("Valor booleano (verdadero): " + esVerdadero);
        System.out.println("Valor booleano (falso): " + esFalso);
        System.out.println("Carácter: " + letra);
    }
}	

