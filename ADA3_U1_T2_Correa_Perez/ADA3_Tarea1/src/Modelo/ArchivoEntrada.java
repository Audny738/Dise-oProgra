package Modelo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class ArchivoEntrada {
    
    /**
     * Se lee cada elemento del archivo alumnos.csv
     */
    public List<EstudianteDatos> readFile(){
        List<EstudianteDatos> estudiantesList = new ArrayList<>();
       
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("estudiantes.csv"));
            String line;
            while((line = bufferedReader.readLine()) != null){                        
                String[] row = line.split(",");            
                EstudianteDatos estudiante = new EstudianteDatos(Integer.valueOf(row[0]), row[1], row[2], row[3]);
                estudiantesList.add(estudiante);
            }

            bufferedReader.close();
            
        }catch (IOException e){
                System.out.println("Error: " + e.getMessage());
        }
        return estudiantesList;
    }

    

    
}
