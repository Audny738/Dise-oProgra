
package Modelo;

public class Usuarios {
    private String nombreUsuario;
    private String contraseña;

    public Usuarios( String nombreUsuario, String contraseña){
        this.contraseña = contraseña;
        this.nombreUsuario = nombreUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario( String nombreUsuario ){
        this.nombreUsuario = nombreUsuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña( String contraseña ){
        this.contraseña = contraseña;
    }
}
