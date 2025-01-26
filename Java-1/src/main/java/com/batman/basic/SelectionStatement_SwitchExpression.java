package com.batman.basic;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class SelectionStatement_SwitchExpression implements CommandLineRunner {

	public enum Months {
		JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE,
		JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER
	}

	@Override
	public void run(String... args) throws Exception {
		log.info("Switch Expression ...");
		
		Months[] months = {Months.JANUARY,Months.MARCH};
		for(Months month : months){
			var result = switch (month) { //This Switch Expression doesn't fall throwh every case like in Switch Case. So no break statements needed
			case JANUARY, JUNE, JULY -> 1;  // We can have comma seperated criteria 
			case FEBRUARY, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER -> 3;
			case MARCH, MAY, APRIL, AUGUST -> {
				  int monthLength = month.toString().length();
				  yield monthLength * 3;  //yield is keyword used to return from the switch expression // It is used as we can return a switch expression but not from the switch expression to a variable so yield is used
			}
			default -> 0; // Here the default case is not mandatory as all the cases are coverd in the switch if we miss any possible value default case is needed.
		};
		log.info("Selected Month Number :: {}", result);
	}
	log.info("... Switch Expression ...");


	}

}
