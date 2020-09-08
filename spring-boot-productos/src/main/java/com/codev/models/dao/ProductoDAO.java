package com.codev.models.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codev.models.entity.Producto;

@Repository
public interface ProductoDAO extends CrudRepository<Producto, Long> {

}
