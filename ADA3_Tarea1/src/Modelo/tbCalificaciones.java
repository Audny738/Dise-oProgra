/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lenovo
 */
public class tbCalificaciones {
     public List<EstudianteDatos> readFile(){
        List<EstudianteDatos> estudiantesList = new ArrayList<>();
       
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("calificaciones.csv"));
            String line;
            while((line = bufferedReader.readLine()) != null){                        
                String[] row = line.split(",");            
                EstudianteDatos estudiante = new EstudianteDatos(Integer.valueOf(row[0]), row[1], Integer.valueOf(row[2]));
                estudiantesList.add(estudiante);
            }

            bufferedReader.close();
            
        }catch (IOException e){
                System.out.println("Error: " + e.getMessage());
        }
        return estudiantesList;
    }

    public void inicializaTabla (JTable tabla){
        tbCalificaciones entrada = new tbCalificaciones();
        List<EstudianteDatos> estudiantesList = entrada.readFile();
        ArchivoEntrada entrada2 = new ArchivoEntrada();
        List<EstudianteDatos> estudiantesList2 = entrada2.readFile();
    
        Vector<String> titulos = new Vector<String>();
        Vector<Vector<Object>> datos = new Vector<Vector<Object>>();
        titulos.add("Matrícula");
        titulos.add("Apellido P");
        titulos.add("Apellido M");
        titulos.add("Nombre");
        titulos.add("Calificación");
        
        for(int i=0;i < estudiantesList.size() && i < estudiantesList2.size(); i++){
            Vector<Object> row = new Vector<Object>(); 
            row.add(estudiantesList.get(i).getMatricula());
            row.add(estudiantesList2.get(i).getPrimerApellido());
            row.add(estudiantesList2.get(i).getSegundoApellido());
            row.add(estudiantesList2.get(i).getNombres());
            row.add(estudiantesList.get(i).getCalificacion());
            datos.add(row);
        }
        
          DefaultTableModel modelo = new DefaultTableModel(datos, titulos);
          tabla.setModel(modelo);
    }
    public void setValue(JTable tabla, List<EstudianteDatos> estudiantesList){
 
        ArchivoEntrada entrada2 = new ArchivoEntrada();
        List<EstudianteDatos> estudiantesList2 = entrada2.readFile();
    
        Vector<String> titulos = new Vector<String>();
        Vector<Vector<Object>> datos = new Vector<Vector<Object>>();
        titulos.add("Matrícula");
        titulos.add("Apellido P");
        titulos.add("Apellido M");
        titulos.add("Nombre");
        titulos.add("Calificación");
        
        for(int i=0;i < estudiantesList.size(); i++){
            Vector<Object> row = new Vector<Object>(); 
            row.add(estudiantesList.get(i).getMatricula());
            row.add(estudiantesList2.get(i).getPrimerApellido());
            row.add(estudiantesList2.get(i).getSegundoApellido());
            row.add(estudiantesList2.get(i).getNombres());
            row.add(estudiantesList.get(i).getCalificacion());
            datos.add(row);
        }
        
          DefaultTableModel modelo = new DefaultTableModel(datos, titulos);
          tabla.setModel(modelo);
        
    }
}
