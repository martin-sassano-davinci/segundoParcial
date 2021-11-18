public class Main {
    public static void main(String[] args) {


        Profesor profesor = new Profesor(100, "John", "Doe");

        Estudiante estudiante = new Estudiante(40900832, "Martin", "Sassano", "Analista");

        estudiante.getMateriasAprobadas().add("Poo");
        estudiante.getMateriasAprobadas().add("Ux");
        estudiante.getMateriasAprobadas().add("Web");

        estudiante.getMateriasInscriptas().add("Sistemas empresariales");
        estudiante.getMateriasInscriptas().add("Base de datos");

        estudiante.imprimirMateriasAprobadas();
        estudiante.imprimirMateriasInscriptas();

    }
}
