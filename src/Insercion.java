public class Insercion {
     public static void insercionAscendente(int[] arr) {
        int n = arr.length;
        int cambios = 0;
        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
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
    public static void insercionDescendente(int[] arr) {
        int n = arr.length;
        int cambios = 0;
        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
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


