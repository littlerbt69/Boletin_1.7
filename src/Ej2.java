import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un número positivo: ");
        int numero = teclado.nextInt();

        if (numero < 0) {
            System.out.println("Por favor, introduce un número positivo.");
            return;
        }

        int numeroInverso = obtenerNumeroInverso(numero);

        int inverso = obtenerCapicua(numero);

        System.out.println("Número inverso: " + numeroInverso);
    }

    public static int obtenerNumeroInverso(int numero) {
        int numeroInverso = 0;

        while (numero > 0) {
            int digito = numero % 10; // Obtiene el último dígito
            numeroInverso = numeroInverso * 10 + digito; // Agrega el dígito al número inverso
            numero = numero / 10; // Elimina el último dígito
        }

        return numeroInverso;
    }

    public static int obtenerCapicua(int numero) {
        int inverso = 0;

        int auxiliar = numero;
        while (auxiliar != 0) {
            int cifra = auxiliar % 10;
            inverso = inverso * 10 + cifra;
            auxiliar = auxiliar / 10;
        }
        if (numero == inverso) {
            System.out.println("El numero es capicua");
        } else {
            System.out.println("El numero no es capicua");
        }

        return inverso;
    }
}
