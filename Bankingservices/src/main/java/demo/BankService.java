package demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankService {

	@GetMapping("deposite/{accNo}/{amount}")
	String deposite(@PathVariable("accNo") int accNo, @PathVariable("amount") int amount) {
       System.out.println("deposite");
		return "deposite done" + amount;
	}

	int withdraw(@PathVariable("accNo")  int accNo, @PathVariable("pinNo")int pinNo,@PathVariable("amount")int amount, @PathVariable("name")int name) {
		return 1000;
	}

	@GetMapping("checkBalance/{pin}/{Accno}/{name}")
	int checkBalance(@PathVariable("pin") int pin, @PathVariable("Accno") int Accno, @PathVariable("name") String name) {
		return 5000;
	}

}
