package com.turnos.application.commands.usuarios;

import com.turnos.domain.models.core.PreferenciaNotificacionEnum;
import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;
import org.hibernate.annotations.processing.Pattern;

@Value
@Builder
@Jacksonized
public class RegistroUsuarioCommand {

    @NotBlank @Size(min = 3, max = 100)
    String nombreApellido;

    @NotBlank @Email
    String email;

    @NotBlank @Size(min = 8)
    String password;

    @Pattern(regexp = "^\\+?[0-9\\s-]+$")
    String celular;

    PreferenciaNotificacionEnum preferenciaNotificacionEnum;

}
