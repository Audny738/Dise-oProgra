package Modelo;

public class EstudianteDatos {
    /**
     * Atributos
     */
    private int matricula;
    private String primerApellido;
    private String segundoApellido;
    private String nombres;
    private String asignatura;
    private int calificacion;
    
    /**
     * CONSTRUCTOR
     * @param matricula
     * @param primerApellido
     * @param segundoApellido
     * @param nombres
     */
    public EstudianteDatos(int matricula, String primerApellido, String segundoApellido, String nombres){
        this.matricula = matricula;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.nombres = nombres;
        this.asignatura = "Diseño de Software";
        this.calificacion = 0;
       
    }

    /** SE GENERAN TODOS LOS METODOS GETTERS Y SETTERS NECESARIOS*/
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

     public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }
    
    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }


}
