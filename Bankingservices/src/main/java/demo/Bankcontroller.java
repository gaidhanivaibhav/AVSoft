package demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Bankcontroller {
	
	@GetMapping("deposite/{acNo}/{name}/{amount}")
	String deposite(@PathVariable("acNo") int acNo,@PathVariable("name") String name,@PathVariable("amount")int amount)
	{
		System.out.println("Deposited");
		return "Deposited" + 5000;
	}
	@GetMapping("withdraw/{anNo}/{amount}/{Name}")
	String withdraw(@PathVariable("acNo") int acNo, @PathVariable("amount") int amount,@PathVariable("Name") String Name)
	{
		return "ur withdrw donr "+ amount;
	}
	@GetMapping("checkBalance/{pin}/{acNo}")
   String checkBalance (@PathVariable("pin")int pin,@PathVariable("acNo")int acNo){
    	return"your balance is 5000";
    }
}
