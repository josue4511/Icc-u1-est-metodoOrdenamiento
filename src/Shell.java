public class Shell {
     public static void shellAscendente(int[] arr) {
        int n = arr.length;
        int medio = n / 2;
        int cambios = 0;
        for(medio=n/2;medio>0;medio/=2){
             for (int i=0;i<medio;i++){
                 for (int j=medio;j<n-1;j++){
                     if(arr[i]>arr[j]){
                         int temp = arr[i];
                         arr[i] = arr[j];
                         arr[j] = temp;
                         cambios++;
                         System.out.println("Intercambio: " + arr[i] + " y " + arr[j]);
                         System.out.println("Total de intercambios: " + cambios);
                         System.out.println("Array después del intercambio: " + java.util.Arrays.toString(arr));
                    }
                }
            }

        }
    }
     public static void shellDescendente(int[] arr) {
        int n = arr.length;
        int medio = 0;
        int cambios = 0;
        for(medio=n/2;medio>0;medio/=2){
            for (int i=0;i<medio;i++){
                for (int j=medio;j<n-1;j++){
                     if(arr[i]<arr[j]){
                         int temp = arr[i];
                         arr[i] = arr[j];
                         arr[j] = temp;
                         cambios++;
                         System.out.println("Intercambio: " + arr[i] + " y " + arr[j]);
                         System.out.println("Total de intercambios: " + cambios);
                         System.out.println("Array después del intercambio: " + java.util.Arrays.toString(arr));
                    }
                }
            }

        }
    }

}
