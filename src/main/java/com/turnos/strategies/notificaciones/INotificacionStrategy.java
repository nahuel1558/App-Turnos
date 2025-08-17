package com.turnos.strategies.notificaciones;

import com.turnos.domain.models.core.Usuario;

public interface INotificacionStrategy {

    void enviar(Usuario usuario, String mensaje);
}
