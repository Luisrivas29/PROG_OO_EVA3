
package invertir;

/**
 *
 * @author raulr
 */
public class Invertir {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n = 1234;
        invertido(n);
    }

    private static void invertido(int n) {
        if (n<10){
            System.out.println(n);
        }else{
            System.out.println(n%10);
            invertido(n/10);
        }
    }
    
}
