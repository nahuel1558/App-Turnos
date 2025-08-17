package com.turnos.strategies.notificaciones;

import com.turnos.domain.models.core.Usuario;

public class NotificacionContexto {

    private INotificacionStrategy notificacionStrategy;


    public void setNotificacionStrategy(INotificacionStrategy notificacionStrategy) {
        this.notificacionStrategy = notificacionStrategy;
    }

    public void ejecutarNotificacion(Usuario usuario, String mensaje){

    }
}
