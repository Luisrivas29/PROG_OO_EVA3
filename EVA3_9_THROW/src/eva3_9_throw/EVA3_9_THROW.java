
package eva3_9_throw;

import java.util.logging.Level;
import java.util.logging.Logger;


public class EVA3_9_THROW {

    
    public static void main(String[] args) {
        try
        {
            metodoProblematico();
        } catch (Exception ex)
        {
           ex.printStackTrace();
        }
    }
    
    public static void metodoProblematico() throws Exception{
        System.out.println("Holi!");
        throw new Exception("FALLA DEL SISTEMA!!!");
        //System.out.println("Hellow Kitty"); NUNCA SE VA A EJECUTAR
    }
    
}
