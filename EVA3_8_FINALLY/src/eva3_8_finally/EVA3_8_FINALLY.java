
package eva3_8_finally;

import java.util.InputMismatchException;
import java.util.Scanner;


public class EVA3_8_FINALLY {

    
    public static void main(String[] args) {
        try{
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce un numero entero: ");
        int nume = input.nextInt();
        System.out.println("El valor capturado fue: " + nume);
        }catch(InputMismatchException e){
        //lo que queremos hacer con la excepcion
            System.out.println("El valor introducido no es un numero entero");
        }finally{
            //usar para ejecutar codigo critico para el programa
            //terminar procesos, cerrar archivos o conexiones
            //liberar recurson etc.
            //NADA EVITA QUE SE PUEDA PRODUCIR UNA EXCEPCION EN ESTE
            //int x = 100, y = 0;
            //int divi = x/y;
            System.out.println("ESTA INSTRUCCION SIEMPRE SE VA A EJECUTAR");
        
        }
    }
    
}
