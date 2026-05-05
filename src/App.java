import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int[] datos ={ 2, 0, -15, 10, 20, -3, -5, 7};
        Scanner Lector = new Scanner(System.in);
        System.out.println("1.Insercion ascendente o descendente ");
        System.out.println("2.Shell asecendente o descendente");
        System.out.println("3.salir");
        int opcion = Lector.nextInt(); 
        if(opcion == 1){
            System.out.println("true. Ascendente");
            System.out.println("false. Descendente");
            boolean opcion2 = Lector.nextBoolean();
            if(opcion2 == true){
                System.out.println("Has elegido insercion ascendente");
                Insercion insercion = new Insercion();
                insercion.insercionAscendente(datos);
            }else if(opcion2 == false){
                System.out.println("Has elegido insercion descendente");
                Insercion insercion = new Insercion();
                insercion.insercionDescendente(datos);
            }else{
                System.out.println("Opcion no valida");
            }
        }
         if (opcion == 2){
            System.out.println("true. Ascendente");
            System.out.println("false. Descendente");
            boolean opcion3 = Lector.nextBoolean();
            if(opcion3 == true){
                System.out.println("Has elegido shell ascendente");
                Shell shell = new Shell();
                shell.shellAscendente(datos);
            }else if(opcion3 == false){
                System.out.println("Has elegido shell descendente");
            }else{
                System.out.println("Opcion no valida");
            }
        }
        if (opcion == 3){
            System.out.println("Has elegido salir");
        }else if(opcion != 1 && opcion != 2 && opcion != 3){
            System.out.println("Opcion no valida");
        }

    

    }
    }

