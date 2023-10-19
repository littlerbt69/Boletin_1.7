import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un numero romano:");
        String numero = teclado.nextLine();

        int numeroDecimal = 0;
        int valorAnterior = 0;

        // Recorre el número romano de derecha a izquierda
        for (int i = numero.length() - 1; i >= 0; i--) {
            char digitoRomano = numero.charAt(i);
            int valorActual = obtenerValorRomano(digitoRomano);

            // Comprueba si el valor actual es menor o igual al valor anterior
            if (valorActual >= valorAnterior) {
                numeroDecimal += valorActual;
            } else {
                numeroDecimal -= valorActual;
            }

            valorAnterior = valorActual;
        }
        System.out.println("El valor de " + numero + " en decimal es: " + numeroDecimal);

    }

    public static int obtenerValorRomano (char romano) {
        return switch (romano) {
            case 'M' -> 1000;
            case 'D' -> 500;
            case 'C' -> 100;
            case 'L' -> 50;
            case 'X' -> 10;
            case 'V' -> 5;
            case 'I' -> 1;
            default -> 0;
        };
    }
}
