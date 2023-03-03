package calculatorboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import calculatorboot.logic.Calc;

//controller class
@RestController
public class CalculatorDemo {
	
	//mapping for adding variables
	@GetMapping("/calculator/add")
	public String calculate(@RequestParam(value = "n1",required = true,defaultValue = "1") int n1,
			@RequestParam(value = "n2",required = true,defaultValue = "2" )int n2
			)
	{
		//for printing addition 
	return "<h1>The sum is "+ Calc.addNo(n1, n2)+"</h1>";
	}
	//mapping for subtracting variables
	@GetMapping("/calculator/sub")
	public String calculate1(@RequestParam(value = "n1",required = true,defaultValue = "1") int n1,
			@RequestParam(value = "n2",required = true,defaultValue = "2" )int n2
			)
	{//for printing subtracting 
	return "<h1>The subtraction is "+ Calc.subNo(n1, n2)+"</h1>";
	}
	//mapping for multiplication of two variables
	@GetMapping("/calculator/multi")
	public String calculate2(@RequestParam(value = "n1",required = true,defaultValue = "1") int n1,
			@RequestParam(value = "n2",required = true,defaultValue = "2" )int n2
			)
	{//for printing multiplication 
	return "<h1>The multiplication is "+ Calc.multiNo(n1, n2)+"</h1>";
	
	}
	
	//mapping for dividing variables
	@GetMapping("/calculator/div")
	public String calculate3(@RequestParam(value = "n1",required = true,defaultValue = "1") int n1,
			@RequestParam(value = "n2",required = true,defaultValue = "2" )int n2
			)
	
	{//for printing division
	return "<h1>The division is "+ Calc.divNo(n1, n2)+"</h1>";
	}
}
