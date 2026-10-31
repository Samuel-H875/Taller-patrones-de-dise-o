public class Main3 {
    static class Estudiante {
        private final String nombre;
        private final double promedio;

        Estudiante(String nombre, double promedio) {
            this.nombre = nombre;
            this.promedio = promedio;
        }

        public void ejecutarOperacion(String operacion) {
            if (operacion.equals("informe")) {
                System.out.println("Estudiante: " + nombre
                        + ", promedio: " + promedio);
            } else if (operacion.equals("estadistica")) {
                System.out.println("Promedio de " + nombre + ": " + promedio);
            } else {
                System.out.println("Operacion no soportada: " + operacion);
            }
        }
    }

    static class Curso {
        private final String nombre;
        private final int creditos;

        Curso(String nombre, int creditos) {
            this.nombre = nombre;
            this.creditos = creditos;
        }

        public void ejecutarOperacion(String operacion) {
            if (operacion.equals("informe")) {
                System.out.println("Curso: " + nombre + ", creditos: " + creditos);
            } else if (operacion.equals("estadistica")) {
                System.out.println("El curso " + nombre + " tiene "
                        + creditos + " creditos.");
            } else {
                System.out.println("Operacion no soportada: " + operacion);
            }
        }
    }

    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Carlos", 4.2);
        Curso curso = new Curso("Programacion III", 3);

        estudiante.ejecutarOperacion("informe");
        curso.ejecutarOperacion("informe");

        estudiante.ejecutarOperacion("estadistica");
        curso.ejecutarOperacion("estadistica");
    }
}
