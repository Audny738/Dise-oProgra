/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.List;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lenovo
 */
public class tbCalificaciones {
    public void inicializaTabla (JTable tabla){
        ArchivoEntrada entrada = new ArchivoEntrada();
        List<EstudianteDatos> estudiantesList = entrada.readFile();
        
        Vector<String> titulos = new Vector<String>();
        Vector<Vector<Object>> datos = new Vector<Vector<Object>>();
        titulos.add("Matrícula");
        titulos.add("Apellido P.");
        titulos.add("Apellido M.");
        titulos.add("Nombres");
        titulos.add("Calificación");
        
        for(int i=0;i < estudiantesList.size(); i++){
            Vector<Object> row = new Vector<Object>();    
            row.add(estudiantesList.get(i).getMatricula());
            row.add(estudiantesList.get(i).getPrimerApellido());
            row.add(estudiantesList.get(i).getSegundoApellido());
            row.add(estudiantesList.get(i).getNombres());
            row.add(estudiantesList.get(i).getCalificacion());
            datos.add(row);
        }
        
          DefaultTableModel modelo = new DefaultTableModel(datos, titulos);
          tabla.setModel(modelo);
    }
}
