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
                
            /*if(user.compareTo(users.getNombreUsuario())==0)
            {
                System.out.println("Contraseña: ");
                String password = scanner.nextLine();
                while (verifica == 1){

                    char[] contraseña = (users.getContraseña()).toCharArray();
                    for (int j = 0;j < contraseña.length; j++){
                        contraseña[j] = (char)(contraseña[j] - (char)(3));
                    }
                    
                    String desencriptado = String.valueOf(contraseña);
                    if (desencriptado.equals(password)){
                        System.out.println("Bienvenido: "+  users.getNombreUsuario()+"\n");
                        verifica = 0;
                    }
                    else{
                        System.out.println("Contraseña incorrecta. Ingrese de nuevo: ");
                        password = scanner.nextLine();
                        
                    }
                }
            } */           
        }
        
       
        if (verifica == 0){
            /**
            * ciclo donde se le asigna una calificacion a cada alumno de la lista 
            * Solo se aceptan calificaciones enteras y son leidas desde la linea de comandos
            */
            for(EstudianteDatos alumno : estudiantesList){            
                while(true){
                    System.out.println("Introduzca la calificacion (1-100) de " + alumno.getNombres() + ":");
                    calif = scanner.nextFloat();
                    if(calif%1 != 0 || calif<1 || calif>100){ //Validacion de numeros enteros
                        System.out.println("Calificacion invalida. Introduzca un numero correcto (1-100).");
                    }else {
                        aux = (int)calif;
                        alumno.setCalificacion(aux);
                        break;
                    }
                }
                
            }
            /**
             * Verfica si cada alumno tiene una calificación asignada
             */
            for(EstudianteDatos alumno : estudiantesList){
                if(alumno.getCalificacion() == 0){
                    System.out.println("Error al crear archivo de calificaciones. Faltan calificaciones por ingresar.");                
                    break;
                }
            }
                    
            /**
             * Menu donde el usuario elige si generar el archivo de calificaciones 
             * La opcion es leida desde la linea de comandos 
             */
            Scanner ent = new Scanner(System.in);
            System.out.println("Desea que se cree el archivo de calificaciones? (1.Si/ 2.No)");
            int opcion = ent.nextInt();
            
            /**
             * Si opcion == 1 se genera el archivo calificaciones.csv con las columnas
             * Matricula | Asignatura "Diseño de software" | calificacion
             */
            if (opcion == 1) {
                File file = new File("calificaciones.csv");
                file.delete();
                ArchivoSalida salida = new ArchivoSalida();
                salida.createFile(estudiantesList);
                System.out.println("Archivo generado con exito.");
            }else {
                System.out.println("No se genero el archivo");
            }
                
        
        } else{
            System.out.println("Usuario inexistente.");
        }
}
    
}



