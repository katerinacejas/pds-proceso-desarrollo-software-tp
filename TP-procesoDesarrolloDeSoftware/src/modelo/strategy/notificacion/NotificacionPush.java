package modelo.strategy.notificacion;

import modelo.entidad.notificacion.Notificacion;

import java.util.List;

public class NotificacionPush implements IServicioNotificacion{

    @Override
    public void notificar(List<Notificacion> notificaciones) {
        if (notificaciones == null || notificaciones.isEmpty()) {
            System.out.println("No hay notificaciones para enviar por push");
            return;
        }

        System.out.println("Iniciando envío de " + notificaciones.size() + " notificaciones push...");

        for (Notificacion notificacion : notificaciones) {
            enviarNotificacionPush(notificacion);
            System.out.println("✓ Push enviado a: " + notificacion.getCelularDestinatario());
        }

        System.out.println("Proceso de envío de notificaciones push completado");
    }

    private void enviarNotificacionPush(Notificacion notificacion) {
        System.out.println("=== ENVIANDO PUSH NOTIFICATION ===");
        System.out.println("Dispositivo: " + notificacion.getCelularDestinatario());
        System.out.println("Título: Deportes App");
        System.out.println("Mensaje: " + notificacion.getMensaje());
        System.out.println("===================================");
    }
}