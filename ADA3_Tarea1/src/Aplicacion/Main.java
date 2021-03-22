package Aplicacion;

import Modelo.*;
import Vista.JFlogin;
import java.io.*;
import java.util.List;
import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {               
        JFlogin login = new JFlogin();
        login.setVisible(true);
        /**
         * Aqui se lee la lista de alumnos con los datos:
         * Matricula | Primer Apellido | Segundo Apellido | Nombres
         */
        ArchivoEntrada entrada = new ArchivoEntrada();
        List<EstudianteDatos> estudiantesList = entrada.readFile();
        UsuariosEntrada usuariosE = new UsuariosEntrada();
        List<Usuarios> usuariosList = usuariosE.readFile();
        
      
        Scanner scanner = new Scanner(System.in);
        float calif;
        int aux;
        int verifica = 1;
        System.out.println("Nombre de usuario: ");
        String user = scanner.nextLine();
        
      
        for(Usuarios users : usuariosList ){
           
            
            char[] passwordE = (users.getContraseña()).toCharArray();
            for (int j = 0;j < passwordE.length; j++){
                passwordE[j] = (char)(passwordE[j] + (char)(3));
            }
            String contraseñaE = String.valueOf(passwordE);
            users.setContraseña(contraseñaE);
            //usuariosList.get(i).setContraseña(contraseñaE);
            
            File file = new File("users.csv");
            file.delete();
            usuariosE.createFile(usuariosList);
                
        }
    }
    
}



