package eva3_5_try_catch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EVA3_5_TRY_CATCH {

  
    public static void main(String[] args) {
        
        try{
        Scanner input = new Scanner(System.in);
        
        System.out.println("Introduce el numerador: ");
        int nume = input.nextInt();
        System.out.println("Introduce el divisor: ");
        int divi = input.nextInt();
        int resu = 0;
        resu = nume/ divi;
        System.out.println("Resultado = " + resu);
        }catch(InputMismatchException e){
            e.printStackTrace();
        }catch(ArithmeticException e){
                e.printStackTrace();
                
            }
    }
    
}
