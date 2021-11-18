public abstract class Usuario {

    // ATRIBUTOS
    private int dni;
    private String nombre;
    private String apellido;

    // CONSTRUCTOR


    public Usuario(int dni, String nombre, String apellido) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    // GETTERS Y SETTERS
    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    // TO STRING

    @Override
    public String toString() {
        return "El dni del"+ getClass()+ " es "+ dni;
    }
}
