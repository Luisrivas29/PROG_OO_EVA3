package eva3_13_escribir_archivos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;


public class EVA3_13_ESCRIBIR_ARCHIVOS {
    final static String miRuta = "C:\\archivos\\";

    
    public static void main(String[] args) {
        try
        {
            escribirFiles(miRuta + "files.txt", "Hola Mundo!!\n" + "Prueba con la clase Files.");
            escribirFileWriter(miRuta + "FileWriter.txt", "Prueba con la clase file writer");
            escribirBufferedWriter(miRuta + "BufferedWriter.txt", "aaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        } catch (IOException ex)
        {
           ex.printStackTrace();
        }
        
    }
    
    //clase files
    public static void escribirFiles(String ruta, String datos) throws IOException{
        Path path = Paths.get(ruta) ;// abrir el archivo
        Files.write(path, datos.getBytes());
    }
    
    public static void escribirFileWriter(String ruta, String datos) throws IOException{
        File file = new File(ruta);
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write(datos);
        fileWriter.close();
    }
    
    public static void escribirBufferedWriter(String ruta, String datos) throws IOException{
        File file = new File(ruta);
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fileWriter);
        bw.write(datos);
        bw.close();
        
    }
    
}
