
package eva3_2_unchecked_exceptions;


public class EVA3_2_UNCHECKED_EXCEPTIONS {

    
    public static void main(String[] args) {
        NullPointerException: cuando queremos usar un objeto que no existe
        Persona persona = null;
        System.out.println(persona.toString());
        
        IndexOutOfBounds: Error de arreglos, leer una poscicion que no existe
        int arreglo[] = new int[10]; //n = 10
         0 es la primera posicion, n-1 es la ultima
        arreglo[15] = 100;
        
        ArithmeticException: division entre 0
        int x = 10, y = 0;
        int resu = x / y;
        System.out.println(resu);
        
    }
    
}

class Persona{
}