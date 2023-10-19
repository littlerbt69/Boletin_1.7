import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un número positivo: ");
        int numero = teclado.nextInt();

        if (numero < 0) {
            System.out.println("Por favor, introduce un número positivo.");
            return;
        }

        int numeroInverso = 0;

        while (numero > 0) {
            int digito = numero % 10; // Obtiene el último dígito
            numeroInverso = numeroInverso * 10 + digito; // Agrega el dígito al número inverso
            numero = numero / 10; // Elimina el último dígito
        }

        System.out.println("Número inverso: " + numeroInverso);
    }
}
