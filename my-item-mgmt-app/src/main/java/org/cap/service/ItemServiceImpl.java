package org.cap.service;

import java.util.List;

import org.cap.dao.IItemDao;
import org.cap.dao.ItemDaoImpl;
import org.cap.entities.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemServiceImpl  implements IItemService{

	IItemDao dao;
	public IItemDao getDao() {
		return dao;
	}

	public void setDao(IItemDao dao) {
		this.dao = dao;
	}

	 @Autowired
	public ItemServiceImpl(IItemDao service) {
		this.dao=service;
		// TODO Auto-generated constructor stub
	}

	public ItemServiceImpl() {
	
		// TODO Auto-generated constructor stub
	}
	@Override
	public void addItem(Item item) {
		dao.addItem(item);
		
	}

	@Override
	public Item findItem(int id) {
		
		Item item=dao.findItem(id);
		return item;
	}

	public static IItemService newInstance() {
	
		return  new ItemServiceImpl(new ItemDaoImpl());
		
	}

	@Override
	public List<Item> find() {
		List<Item> l=dao.find();
		return l;
	}

}
