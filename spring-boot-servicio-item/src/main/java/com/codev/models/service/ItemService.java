package com.codev.models.service;

import java.util.List;

import com.codev.models.Item;

public interface ItemService {
	public List<Item> findAll();

	public Item findById(Long id, Integer cantidad);

}
