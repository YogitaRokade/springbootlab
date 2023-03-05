package calculatorboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import calculatorboot.logic.Calc;
@RestController
public class MultiController {
	//This method is responsible for subtract two numbers and displaying it in web.
	
			@GetMapping("/multiply/multi")
			public String substraction(@RequestParam(value = "num1",required = true,defaultValue = "1")int n1,
					@RequestParam(value = "num2",required = true,defaultValue = "2" )int n2
					)
			{
			return "<h1>The multiplication is "+ Calc.multiNo(n1, n2)+"</h1>";
			}
}
