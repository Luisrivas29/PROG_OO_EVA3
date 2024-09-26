
package dibujarectangulo;

/**
 *LUIS RAUL RIVAS SANCHEZ
 * 23550331
 * ESTRUCTURA DE DATOS
 * 
 */
//Crea un rectangulo a partir de los valores de la base y de la altura
public class DibujaRectangulo {

   
    public static void main(String[] args) {
       int base = 4;
       int altura = 2;
       rectangulo(base, altura);
    }

    private static void rectangulo(int base, int altura) {
        if (altura > 0){
            rectangulo2(base);
            rectangulo(base, altura - 1);
        }
    }

    private static void rectangulo2(int base) {
        if(base>0){
            System.out.println("*");
            rectangulo2(base - 1);
        
        } else{
            System.out.println();
        }
    }
    
}
