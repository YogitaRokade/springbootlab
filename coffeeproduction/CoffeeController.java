package com.coffee.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.coffee.entity.Coffee;
@RestController
public class CoffeeController {
	private List<Coffee>coffees=new ArrayList<>();

	
	//Adding coffee into the list of coffee
  public CoffeeController()
  {
	  coffees.addAll(List.of(new Coffee("Cappuccino",200),new Coffee("Arebica",300),
			  new Coffee("Latte",400),new Coffee("Irish",500) ));
  }
	
  //to  display all coffees in list
  @RequestMapping(value="/coffee",method=RequestMethod.GET)
  Iterable<Coffee>getAll()
  {
	  return coffees;
  }
}
