public class Main2 {
    interface MedioEnvio {
        void enviar(String mensaje);
    }

    static class CorreoElectronico implements MedioEnvio {
        @Override
        public void enviar(String mensaje) {
            System.out.println("Correo: " + mensaje);
        }
    }

    static class MensajeSMS implements MedioEnvio {
        @Override
        public void enviar(String mensaje) {
            System.out.println("SMS: " + mensaje);
        }
    }

    static abstract class Notificacion {
        protected final MedioEnvio medio;

        protected Notificacion(MedioEnvio medio) {
            this.medio = medio;
        }

        public abstract void enviar(String mensaje);
    }

    static class NotificacionMatricula extends Notificacion {
        NotificacionMatricula(MedioEnvio medio) {
            super(medio);
        }

        @Override
        public void enviar(String mensaje) {
            medio.enviar("Matricula: " + mensaje);
        }
    }

    static class NotificacionPago extends Notificacion {
        NotificacionPago(MedioEnvio medio) {
            super(medio);
        }

        @Override
        public void enviar(String mensaje) {
            medio.enviar("Pago pendiente: " + mensaje);
        }
    }

    public static void main(String[] args) {
        Notificacion avisoMatriculaCorreo =
                new NotificacionMatricula(new CorreoElectronico());
        Notificacion avisoMatriculaSMS =
                new NotificacionMatricula(new MensajeSMS());
        Notificacion avisoPagoCorreo =
                new NotificacionPago(new CorreoElectronico());
        Notificacion avisoPagoSMS =
                new NotificacionPago(new MensajeSMS());

        avisoMatriculaCorreo.enviar("Inscripciones abiertas");
        avisoMatriculaSMS.enviar("Inscripciones abiertas");
        avisoPagoCorreo.enviar("Fecha limite: 30 de octubre");
        avisoPagoSMS.enviar("Fecha limite: 30 de octubre");
    }
}
