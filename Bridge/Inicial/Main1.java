public class Main1 {
    static class Notificacion {
        public void enviar(String tipo, String medio, String mensaje) {
            if (tipo.equals("matricula") && medio.equals("correo")) {
                System.out.println("Correo: Matricula: " + mensaje);
            } else if (tipo.equals("matricula") && medio.equals("sms")) {
                System.out.println("SMS: Matricula: " + mensaje);
            } else if (tipo.equals("pago") && medio.equals("correo")) {
                System.out.println("Correo: Pago pendiente: " + mensaje);
            } else if (tipo.equals("pago") && medio.equals("sms")) {
                System.out.println("SMS: Pago pendiente: " + mensaje);
            } else {
                System.out.println("Combinacion no soportada: " + tipo + " / " + medio);
            }
        }
    }

    public static void main(String[] args) {
        Notificacion notificacion = new Notificacion();

        notificacion.enviar("matricula", "correo", "Inscripciones abiertas");
        notificacion.enviar("pago", "sms", "Fecha limite: 30 de octubre");
    }
}
