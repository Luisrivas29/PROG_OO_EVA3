package eva3_4_try_catch;


public class EVA3_4_TRY_CATCH {

    
    public static void main(String[] args) {
        //arithmeticexception
       
        int x = 10, y = 0;
        int resu = 0;
        try{
        resu = x / y;
        System.out.println("Resultado = " + resu);
        }catch( ArithmeticException e){//solucion del error
           //que queremos hacer
           e.printStackTrace();
            System.out.println("Ups!!!");
        }
        
        
    
    
    
    }
    
}
