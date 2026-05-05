public class Insercion {
     public int[] ordenar(int[] original, boolean ascendente) {
        int[] arr = original.clone();
        int n = arr.length;

        int comparaciones = 0;
        int cambios = 0;
        int iteraciones = 0;

        System.out.println("\n==== METODO INSERCIÓN ====");
        System.out.println("\nArreglo original:");
        imprimirArreglo(arr);

        for (int i = 0; i < n - 1; i++) {
            iteraciones++;
            int a = i;
            int b = i + 1;

            System.out.print("\nI" + iteraciones + "   ");
            imprimirArregloLinea(arr);

            while (a >= 0) {
                comparaciones++;
                boolean debeIntercambiar = ascendente
                        ? arr[a] > arr[b]
                        : arr[a] < arr[b];

                System.out.printf("       a=%-3d b=%-3d [a]=%-6d [b]=%-6d cambio=%s%n",
                        a, b, arr[a], arr[b], debeIntercambiar ? "si" : "no");

                if (debeIntercambiar) {
                    cambios++;
                    int tmp = arr[a];
                    arr[a] = arr[b];
                    arr[b] = tmp;
                    imprimirEstadoParcial(arr, a, b);

                    a--;
                    b--;
                } else {
                    break;
                }
            }
        }

        System.out.println("\n");
        System.out.print("end  ");
        imprimirArregloLinea(arr);
        System.out.println();

        System.out.println("\nCOMPARACIONES = " + comparaciones);
        System.out.println("ITERACIONES   = " + iteraciones);
        System.out.println("CAMBIOS       = " + cambios);

        return new int[]{comparaciones, cambios, iteraciones};
    }

    private void imprimirArreglo(int[] arr) {
        for (int v : arr) {
            System.out.printf("%-6d", v);
        }
        System.out.println();
    }

    private void imprimirArregloLinea(int[] arr) {
        for (int v : arr) {
            System.out.printf("%-6d", v);
        }
    }

    private void imprimirEstadoParcial(int[] arr, int posA, int posB) {
        System.out.print("     ");
        for (int i = 0; i < arr.length; i++) {
            if (i == posA || i == posB) {
                System.out.printf("%-6d", arr[i]);
            } else {
                System.out.printf("%-6s", "");
            }
        }
        System.out.println();
    }
}