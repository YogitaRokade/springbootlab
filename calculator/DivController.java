package calculatorboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import calculatorboot.logic.Calc;

@RestController
public class DivController {
	//This method is responsible for dividing two numbers and displaying it in web.
		@GetMapping("/division/div")
		public String division (@RequestParam(value = "num1",required = true,defaultValue = "1")double num1,
				@RequestParam(value = "num2",required = true,defaultValue = "2" )double num2)
		{
			 return "<h1>The division is "+ Calc.divNo(num1, num2)+"</h1>";	}

}
