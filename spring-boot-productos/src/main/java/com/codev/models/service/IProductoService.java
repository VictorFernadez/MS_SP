package com.codev.models.service;

import java.util.List;

import com.codev.models.entity.Producto;

public interface IProductoService {
	public List<Producto> findAll();

	public Producto findById(Long id);
}
