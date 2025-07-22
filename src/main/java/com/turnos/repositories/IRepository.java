package com.turnos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface IRepository <E extends Object, ID extends Serializable> extends JpaRepository<E, ID> {
}
