package com.turnos.application.mappers;

import com.turnos.application.commands.usuarios.RegistroUsuarioCommand;
import com.turnos.application.queries.usuarios.ListaUsuarioResponse;
import com.turnos.application.queries.usuarios.PerfilUsuarioResponse;
import com.turnos.domain.models.core.Usuario;
import org.springframework.web.bind.annotation.Mapping;
import org.xmlunit.util.Mapper;

@Mapper(componentModel = "spring")
public class UsuarioMapper {
    PerfilUsuarioResponse toProfileResponse(Usuario usuario);
    ListaUsuarioResponse toListResponse(Usuario usuario);

    @Mapping(target = "passwordHash", ignore = true)
    @Mapping(target = "roles", ignore = true)
    @Mapping(target = "id", ignore = true)
    Usuario fromRegisterCommand(RegistroUsuarioCommand command);
}
