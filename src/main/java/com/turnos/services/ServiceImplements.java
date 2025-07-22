package com.turnos.services;

import com.turnos.repositories.IRepository;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;

public abstract class ServiceImplements <E extends Object, ID extends Serializable> implements IService<E, ID> {

    protected final IRepository<E, ID> iRepository;

    protected ServiceImplements(IRepository<E, ID> iRepository) {
        this.iRepository = iRepository;
    }

    @Override
    @Transactional
    public E guardar(E entity) throws Exception{
        try{
            entity = iRepository.save(entity);
            return entity;
        } catch (Exception exception){
            throw new RuntimeException("Error al guardar: " + exception.getMessage());
        }
    }
}
