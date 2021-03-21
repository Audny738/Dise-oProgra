/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;


/**
 *
 * @author Audny Correa
 */
import com.qoppa.pdfWriter.PDFDocument;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
public class ArchivoPDF {
    PDFDocument pdfDoc = new PDFDocument();
    
    public void readPDF(){
        List<EstudianteDatos> estudiantesDatosList = new ArrayList<>();
        
        try{
            BufferedReader bufferedReader = new BufferedReader(new FileReader ("calificaciones.csv"));
            String line;
            
            
        }catch(IOException e){
            System.out.println("Error: " + e.getMessage());
            
        }
    }
    
    
}
