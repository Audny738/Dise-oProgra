
package Modelo;

public class Usuarios {
    private String nombreUsuario;
    private String contrasenia;

    public Usuarios( String nombreUsuario, String contrasenia){
        this.contrasenia = contrasenia;
        this.nombreUsuario = nombreUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario( String nombreUsuario ){
        this.nombreUsuario = nombreUsuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia( String contrasenia ){
        this.contrasenia = contrasenia;
    }
}
