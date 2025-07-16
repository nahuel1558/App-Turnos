package com.turnos.strategies.notificaciones;

import com.turnos.models.core.Usuario;

public interface INotificacionStrategy {

    void enviar(Usuario usuario, String mensaje);
}
