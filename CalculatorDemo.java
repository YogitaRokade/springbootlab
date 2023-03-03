package calculatorboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import calculatorboot.logic.Calc;

@RestController
public class CalculatorDemo {
	
	@GetMapping("/calculator/add")
	public String calculate(@RequestParam(value = "n1",required = true,defaultValue = "1") int n1,
			@RequestParam(value = "n2",required = true,defaultValue = "2" )int n2
			)
	{
	return "<h1>The sum is "+ Calc.addNo(n1, n2)+"</h1>";
	}
	
	@GetMapping("/calculator/sub")
	public String calculate1(@RequestParam(value = "n1",required = true,defaultValue = "1") int n1,
			@RequestParam(value = "n2",required = true,defaultValue = "2" )int n2
			)
	{
	return "<h1>The substraction is "+ Calc.subNo(n1, n2)+"</h1>";
	}
	
	@GetMapping("/calculator/multi")
	public String calculate2(@RequestParam(value = "n1",required = true,defaultValue = "1") int n1,
			@RequestParam(value = "n2",required = true,defaultValue = "2" )int n2
			)
	{
	return "<h1>The multiplication is "+ Calc.multiNo(n1, n2)+"</h1>";
	
	}
	
	@GetMapping("/calculator/div")
	public String calculate3(@RequestParam(value = "n1",required = true,defaultValue = "1") int n1,
			@RequestParam(value = "n2",required = true,defaultValue = "2" )int n2
			)
	{
	return "<h1>The division is "+ Calc.divNo(n1, n2)+"</h1>";
	}
}
