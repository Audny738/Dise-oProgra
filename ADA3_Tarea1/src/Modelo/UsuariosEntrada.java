package Modelo;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class UsuariosEntrada {
    public List<Usuarios> readFile(){
        List<Usuarios> usuariosList = new ArrayList<>();
       
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("usuarios.csv"));
            String line;
            while((line = bufferedReader.readLine()) != null){                        
                String[] row = line.split(",");            
                Usuarios usuario = new Usuarios(row[0], row[1]);
                usuariosList.add(usuario);
                
            }

        
            bufferedReader.close();

        }catch (IOException e){
                System.out.println("Error: " + e.getMessage());
        }
        return usuariosList;
    } 

    public void createFile(List<Usuarios> usuariosList){
        try{
            BufferedWriter bufferedWriter = new BufferedWriter((new FileWriter("users.csv")));
            for (int i=0; i<usuariosList.size(); i++){

                bufferedWriter.write(usuariosList.get(i).getNombreUsuario() + "," + usuariosList.get(i).getContraseña() + "\n");
            }
            bufferedWriter.close();

        }catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
