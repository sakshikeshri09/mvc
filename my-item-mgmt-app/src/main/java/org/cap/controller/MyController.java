package org.cap.controller;

import org.cap.entities.Item;
import org.cap.service.IItemService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {

	 @Autowired
	 private IItemService service;
	@GetMapping("/add")
	public ModelAndView adding() {
		
		ModelAndView mvn=new ModelAndView("additem");
		return mvn;
	}
	
	@GetMapping("setValues")
	public ModelAndView setValue(@RequestParam("id") int id,@RequestParam("iname")String iname)
	{
		Item item=new Item(id,iname);
		service.addItem(item);
		ModelAndView mv=new ModelAndView("fetchall","item",item);
		return mv;
	}

	
}
