import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       int[] arreglo = { 12, -7, 25, 0, -15, 33, 19, -22, 5, 48, -3 };

        Scanner scanner = new Scanner(System.in);
        Insercion insercion = new Insercion();
        Shell shell = new Shell();

        int opcion = -1;

        do {
            System.out.println("\n==== PROGRAMA DE ORDENAMIENTO ====");
            System.out.println();
            System.out.println("1. Ejecutar ordenamientos");
            System.out.println("2. Salir");
            System.out.print("\nOpcion: ");

            opcion = leerEnteroValido(scanner, 1, 2);

            if (opcion == 1) {
                boolean insercionAsc = leerBooleano(scanner, "¿Inserción ascendente? (true/false): ");
                boolean shellAsc     = leerBooleano(scanner, "¿Shell ascendente? (true/false): ");

                insercion.ordenar(arreglo, insercionAsc);
                shell.ordenar(arreglo, shellAsc);
            }

        } while (opcion != 2);

        System.out.println("\nPrograma finalizado.");
        scanner.close();
    }
    private static int leerEnteroValido(Scanner scanner, int min, int max) {
        while (true) {
            String linea = scanner.nextLine().trim();

            if (linea.isEmpty()) {
                System.out.print("Entrada vacía. Ingrese un número entre " + min + " y " + max + ": ");
                continue;
            }

            try {
                int valor = Integer.parseInt(linea);
                if (valor < min || valor > max) {
                    System.out.print("Valor fuera de rango. Ingrese un número entre " + min + " y " + max + ": ");
                } else {
                    return valor;
                }
            } catch (NumberFormatException e) {
                System.out.print("Entrada inválida. Ingrese un número entre " + min + " y " + max + ": ");
            }
        }
    }
    private static boolean leerBooleano(Scanner scanner, String mensaje) {
        while (true) {
            System.out.print(mensaje);
            String linea = scanner.nextLine().trim().toLowerCase();

            if (linea.equals("true")) {
                return true;
            } else if (linea.equals("false")) {
                return false;
            } else {
                System.out.println("Entrada inválida. Escriba 'true' o 'false'.");
            }
        }
    }
}