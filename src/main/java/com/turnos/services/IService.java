package com.turnos.services;

import java.io.Serializable;
import java.util.List;

public interface IService <E extends Object, ID extends Serializable> {

    E guardar (E entity) throws Exception;
    E traerPorId (ID id) throws Exception;
    List<E> traerTodos() throws Exception;
    Boolean borrar (ID id) throws Exception;
}
