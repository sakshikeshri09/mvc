package org.cap.dao;

import java.util.List;

import org.cap.entities.Item;

public interface IItemDao {

	List<Item> find();
	void addItem(Item item);
	
	Item findItem(int id);
}
