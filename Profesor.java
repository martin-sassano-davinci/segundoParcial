import java.util.ArrayList;

public class Profesor extends Usuario{

    // ATRIBUTOS
    private ArrayList<String> comisiones = new ArrayList<String>();

    // CONSTRUCTOR
    public Profesor(int dni, String nombre, String apellido) {
        super(dni, nombre, apellido);
    }

    // GETTERS Y SETTERS

    public ArrayList<String> getComisiones() {
        return comisiones;
    }

    public void setComisiones(ArrayList<String> comnisiones) {
        this.comisiones = comnisiones;
    }

    // METODOS
    public void imprimirComisiones(){
        for (int i = 0; i < this.comisiones.size(); i++) {
            System.out.println("Comisiones: "+ this.comisiones.get(i));
        }
    }
}
