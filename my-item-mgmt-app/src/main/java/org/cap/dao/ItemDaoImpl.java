package org.cap.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import org.cap.entities.Item;
import org.springframework.stereotype.Repository;

@Repository
public class ItemDaoImpl implements IItemDao{

	
	private HashMap<Integer,Item> store=new HashMap<>();

	public HashMap<Integer, Item> getStore() {
		return store;
	}

	public void setStore(HashMap<Integer, Item> store) {
		this.store = store;
	}

	@Override
	public void addItem(Item item) {
		store.put(item.getItemId(), item);
		
	}

	@Override
	public Item findItem(int id) {
	
		Item item=store.get(id);
		try {
		if(item==null) {
			System.out.println("item does not exists");
		
		}}
			catch(Exception e){
				System.out.println("item does not exists");
		}
			
		
		return item;
	}

	@Override
	public List<Item> find() {
		Collection<Item> c =store.values();
		List<Item> list=new ArrayList<>(c);
		return list;
	}
	
	
	
	
}
