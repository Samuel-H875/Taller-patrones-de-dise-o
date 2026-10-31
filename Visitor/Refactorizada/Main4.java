public class Main4 {
    interface Elemento {
        void aceptar(Visitor visitor);
    }

    interface Visitor {
        void visitarEstudiante(Estudiante estudiante);
        void visitarCurso(Curso curso);
    }

    static class Estudiante implements Elemento {
        private final String nombre;
        private final double promedio;

        Estudiante(String nombre, double promedio) {
            this.nombre = nombre;
            this.promedio = promedio;
        }

        String getNombre() {
            return nombre;
        }

        double getPromedio() {
            return promedio;
        }

        @Override
        public void aceptar(Visitor visitor) {
            visitor.visitarEstudiante(this);
        }
    }

    static class Curso implements Elemento {
        private final String nombre;
        private final int creditos;

        Curso(String nombre, int creditos) {
            this.nombre = nombre;
            this.creditos = creditos;
        }

        String getNombre() {
            return nombre;
        }

        int getCreditos() {
            return creditos;
        }

        @Override
        public void aceptar(Visitor visitor) {
            visitor.visitarCurso(this);
        }
    }

    static class InformeVisitor implements Visitor {
        @Override
        public void visitarEstudiante(Estudiante estudiante) {
            System.out.println("Estudiante: " + estudiante.getNombre()
                    + ", promedio: " + estudiante.getPromedio());
        }

        @Override
        public void visitarCurso(Curso curso) {
            System.out.println("Curso: " + curso.getNombre()
                    + ", creditos: " + curso.getCreditos());
        }
    }

    static class EstadisticasVisitor implements Visitor {
        @Override
        public void visitarEstudiante(Estudiante estudiante) {
            String resultado = estudiante.getPromedio() >= 3.0
                    ? "aprobado" : "no aprobado";
            System.out.println(estudiante.getNombre() + " esta " + resultado
                    + " con promedio " + estudiante.getPromedio());
        }

        @Override
        public void visitarCurso(Curso curso) {
            System.out.println("El curso " + curso.getNombre()
                    + " tiene " + curso.getCreditos() + " creditos.");
        }
    }

    public static void main(String[] args) {
        Elemento estudiante = new Estudiante("Carlos", 4.2);
        Elemento curso = new Curso("Programacion III", 3);

        Visitor informe = new InformeVisitor();
        Visitor estadisticas = new EstadisticasVisitor();

        System.out.println("=== INFORME ===");
        estudiante.aceptar(informe);
        curso.aceptar(informe);

        System.out.println("\\n=== ESTADISTICAS ===");
        estudiante.aceptar(estadisticas);
        curso.aceptar(estadisticas);
    }
}
