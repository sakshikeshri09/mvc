package org.cap.service;



import java.util.List;

import org.cap.entities.Item;

public interface IItemService {

	void addItem(Item item);
	
	Item findItem(int id);
	
	List<Item> find();
	
}
