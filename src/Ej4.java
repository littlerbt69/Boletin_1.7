import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pide la hora actual
        System.out.print("Introduce la hora actual (hora minutos segundos): ");
        int horaActual = scanner.nextInt();
        int minutosActual = scanner.nextInt();
        int segundosActual = scanner.nextInt();

        // Pide la hora a sumar
        System.out.print("Introduce la hora a sumar (hora minutos segundos): ");
        int horaASumar = scanner.nextInt();
        int minutosASumar = scanner.nextInt();
        int segundosASumar = scanner.nextInt();

        // Realiza la suma
        int nuevaHora = horaActual + horaASumar;
        int nuevosMinutos = minutosActual + minutosASumar;
        int nuevosSegundos = segundosActual + segundosASumar;

        // Ajusta los minutos y segundos si son mayores a 59
        if (nuevosSegundos >= 60) {
            nuevosSegundos -= 60;
            nuevosMinutos++;
        }
        if (nuevosMinutos >= 60) {
            nuevosMinutos -= 60;
            nuevaHora++;
        }

        // Ajusta la hora si es mayor a 23 (cambio de día)
        if (nuevaHora >= 24) {
            nuevaHora -= 24;
        }

        // Imprime la nueva hora
        System.out.println("La nueva hora es: " + nuevaHora + " " + nuevosMinutos + " " + nuevosSegundos);

        scanner.close();
    }
}
