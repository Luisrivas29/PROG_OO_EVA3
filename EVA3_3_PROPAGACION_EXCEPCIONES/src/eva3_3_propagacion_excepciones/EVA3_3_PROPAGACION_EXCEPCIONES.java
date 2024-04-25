
package eva3_3_propagacion_excepciones;


public class EVA3_3_PROPAGACION_EXCEPCIONES {

    
    public static void main(String[] args) {
        A();
        // TODO code application logic here
    }
    
    public static void A(){
        B();
    }
    public static void B(){
        C();
    }
    public static void C(){
        int x = 10, y = 0;
        int resu = x / y;
        System.out.println(resu);
    }
   
    
}
