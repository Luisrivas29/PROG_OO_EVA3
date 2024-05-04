package eva3_10_throw_unchecked;


public class EVA3_10_THROW_UNCHECKED {

    
    public static void main(String[] args) {
        
    try{
        Persona perso1 = new Persona("Luis","Perez", -12);
    }catch(RuntimeException e ){
        e.printStackTrace();
        }
    }
}

class Persona{
    private String nombre;
    private String apellido;
    private int edad;

    public Persona() {
    }

    public Persona(String nombre, String apellido, int edad){
        this.nombre = nombre;
        this.apellido = apellido;
         if((edad < 0) || (edad > 150))
        throw new RuntimeException("Valor capturado en edad no es valido");
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad){
        if((edad < 0) || (edad > 150))
        throw new RuntimeException("Valor capturado en edad no es valido");
        this.edad = edad;
    }
}