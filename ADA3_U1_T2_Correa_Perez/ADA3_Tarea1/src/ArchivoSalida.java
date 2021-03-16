
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.List;

public class ArchivoSalida {

    /**
     * Aqui se crea el archivo calificaciones.cvs, se va leyendo cada alumno que se encuentre en la lista de estudiantes
     * @param estudiantesList
     */
    
    public void createFile(List<EstudianteDatos> estudiantesList){
        
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("calificaciones.csv", true), "utf-8"));
            for (int i=0; i<estudiantesList.size(); i++){
                bufferedWriter.write(estudiantesList.get(i).getMatricula() + "," +
                        estudiantesList.get(i).getAsignatura() + "," +
                        estudiantesList.get(i).getCalificacion() + "\n");
            }
            bufferedWriter.close();
        }catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
        
    }        
        
    
}
