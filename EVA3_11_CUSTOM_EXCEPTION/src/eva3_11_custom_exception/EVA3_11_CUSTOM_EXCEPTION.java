
package eva3_11_custom_exception;

import java.util.logging.Level;
import java.util.logging.Logger;


public class EVA3_11_CUSTOM_EXCEPTION {

    
    public static void main(String[] args) {
      
        try
        {
            mensaje();
        } catch (MiExcepcion ex)
        {
           ex.printStackTrace();
        }
    }
    
    public static void mensaje() throws MiExcepcion{
        System.out.println("mensaje");
        throw new MiExcepcion("Falla del Sistema");
    
    }
    
}

class MiExcepcion extends Exception{

    public MiExcepcion() {
    }

    public MiExcepcion(String message) {
        super(message);
    }
    
    
}