package calculatorboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import calculatorboot.logic.Calc;

//controller class
@RestController
public class CalculatorDemo {
	
	//mapping for adding two variables and display into web
	@GetMapping("/calculator/add")
	public String calculate(@RequestParam(value = "num1",required = true,defaultValue = "1") int n1,
			@RequestParam(value = "num2",required = true,defaultValue = "2" )int n2
			)
	{
		//for printing addition 
	return "<h1>The sum is "+ Calc.addNo(n1,n2 )+"</h1>";
	}
	
}
