package com.codev.controllers;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.codev.models.entity.Producto;
import com.codev.models.service.IProductoService;

@RestController
public class ProductoController {
	@Value("${server.port}")
	private Integer port;

	@Autowired
	private IProductoService service;

	@GetMapping("/listar")
	public List<Producto> listar() {
		return service.findAll().stream().map(producto -> {
			producto.setPort(port);
			return producto;
		}).collect(Collectors.toList());
	}

	@GetMapping("/ver/{id}")
	public Producto detalle(@PathVariable Long id) {
		Producto producto = service.findById(id);
		producto.setPort(port);
		return producto;
	}

}
