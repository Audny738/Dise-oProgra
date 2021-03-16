import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
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

            BufferedWriter bufferedWriter = new BufferedWriter((new FileWriter("usuarios.csv")));
            for (int i=0; i<usuariosList.size(); i++){

                char passwordE[] = (usuariosList.get(i).getContraseña()).toCharArray();
                for (int j = 0;j < passwordE.length; j++){
                    passwordE[j] = (char)(passwordE[j] + (char)(3));
                }
                String contraseñaE = String.valueOf(passwordE);

                bufferedWriter.write(usuariosList.get(i).getNombreUsuario() + "," + contraseñaE + "\n");
            }
            bufferedWriter.close();
            bufferedReader.close();

        }catch (IOException e){
                System.out.println("Error: " + e.getMessage());
        }
        return usuariosList;
    } 
}
