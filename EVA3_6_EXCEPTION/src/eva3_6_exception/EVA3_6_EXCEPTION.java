package eva3_6_exception;

import java.util.InputMismatchException;
import java.util.Scanner;


public class EVA3_6_EXCEPTION {

    
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
        }catch(Exception e){
            if(e instanceof InputMismatchException)
                System.out.println("inputmismatchexception");
            else
                System.out.println("arithmeticexception");
            //e.printStackTrace();
        }
                
    }
}
    

