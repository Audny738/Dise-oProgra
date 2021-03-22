package Modelo;

import com.qoppa.pdfWriter.PDFDocument;
import com.qoppa.pdfWriter.PDFPrinterJob;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.List;
import java.util.Vector;

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
    
    public void crearPDF(List<EstudianteDatos> estudiantesList){
        ArchivoPDF tablaPDF = new ArchivoPDF(crearDatos(estudiantesList), null, true);
        //PrinterJob printerJob = PDFPrinterJob.getPrinterJob();
        PrinterJob printerJob = PrinterJob.getPrinterJob();
        printerJob.setPrintable(tablaPDF);
        try{
            printerJob.print();
        }catch(PrinterException e){
            System.out.println("Error: " + e.getMessage());
        } 
    }
    
    private Vector crearDatos(List<EstudianteDatos> estudiantesList){
        Vector datos = new Vector();
        for(EstudianteDatos alumno : estudiantesList){
            Vector filaDatos = new Vector();
            for (int col = 0; col < 3; ++col){
                switch(col){
                    case 0:
                        filaDatos.addElement(alumno.getMatricula());
                        break;
                    case 1:
                        filaDatos.addElement(alumno.getNombreCompleto());
                        break;
                    case 2:
                        filaDatos.addElement(alumno.getCalificacion());
                        break;
                }
            }
            datos.addElement(filaDatos);
            
        }
        return datos;
    }
        
    
}
