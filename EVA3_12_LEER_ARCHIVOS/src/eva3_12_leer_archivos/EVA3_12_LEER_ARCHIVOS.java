package eva3_12_leer_archivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class EVA3_12_LEER_ARCHIVOS {
    final static String miRuta = "C:\\archivos\\archivo_texto.txt";

   
    public static void main(String[] args) {
        try
        {
            leerArchivoFiles(miRuta);
            leerArchivosBuffered(miRuta);
            leerArchivosFileReader(miRuta);
            leerArchivosScanner(miRuta);
        } catch (IOException ex){
          ex.printStackTrace();
        }
    }
    
    /*
    Lectura de archivos usando la clase files
    Se lee todo el archivo y se carga en memoria.
    Por tanto, es util solo para archivos pequeños.
    */
    public static void leerArchivoFiles(String ruta) throws IOException{
        System.out.println("Lectura de archivo de texto con clase Files*************************************");
        Path path = Paths.get(ruta);//crea de ruta de tipo Path
        
        byte[] datos = Files.readAllBytes(path);// Genera una 
                           //new String ---> convierte el arreglo
                           //de Byte a cadena de texto
        System.out.println(new String (datos));
    }
    
    
    /*
    Es adecuado para leer archivos grandes
    Nos permite procesar archivos de texto linea por linea
    Es adecuado para la multitarea (hilos de ejecucuion)
    */
    public static void leerArchivosBuffered(String ruta) throws FileNotFoundException, IOException{
        System.out.println("Lectura de archivo de texto con la clase BufferedReader*************************");
        // Abrir el archivo
        // Leer el archivo como informacion binaria
        // Convertir la informacion binaria a texto
        
        File file = new File(ruta);
        FileInputStream in = new FileInputStream(file);
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);
        String cade;
              //asignamos la linea a la variable cade
              //si cade es diferente a null, estamos
              //leyendo texto, si leemos null, llegamos
              //al final del archivo
        while((cade = br.readLine()) != null){
            System.out.println(cade);
        
        }
        br.close();
    }
    
    public static void leerArchivosFileReader(String ruta) throws IOException{
        System.out.println("Lectura de archivo de texto con la clase FileReader*****************************");
        File file = new File(ruta);
        FileReader reader = new FileReader(file);
         BufferedReader br = new BufferedReader(reader);
        String cade;
            while((cade = br.readLine()) != null){
            System.out.println(cade);
        
        }
        br.close();
    }
    
    public static void leerArchivosScanner(String ruta) throws IOException{
        System.out.println("Lectura de archivo de texto con la clase Scanner********************************");
        Path path = Paths.get(ruta);
        Scanner leer = new Scanner(path);
        while(leer.hasNextLine()){
            String cade = leer.nextLine();
            System.out.println(cade);
        }
        leer.close();
        
    }
    
    
    
    
}
