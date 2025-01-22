package com.batman.basic;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
// public strictfp class DataTypes implements CommandLineRunner{ --> Strictfp is
// a keyword in java used to restrict the floating-point calculations to ensure
// portability. It is with respective to its compiler. It can be applied to
// classes, interfaces, and methods only. It cannot be applied to variables.
// But from Java 17 it is not needed as it is by default applied to all floating
// point calculations
public class DataTypesAndCasting implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		log.info("Data Types ...........");
		double a;// double for high precision
		float b; // float for low precision
		long c; // long for large numbers
		int d; // int for normal numbers
		short e; // short for small numbers
		byte f; // byte for very small numbers
		// The size for double is 8 bytes,float is 4 bytes, long is 8 bytes, int is 4
		// bytes, short is 2 bytes, byte is 1 byte
		// The range for double is 1.7e-308 to 1.7e+308, float is 3.4e-038 to 3.4e+038,
		// long is -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807, int is
		// -2,147,483,648 to 2,147,483,647, short is -32,768 to 32,767, byte is -128 to
		// 127
		// The default value for double is 0.0d, float is 0.0f, long is 0L, int is 0,
		// short is 0, byte is 0
		// Since we did not set the value the primitive data types have their default
		// values in the above code they have 0.0d, 0.0f, 0L, 0, 0, 0
		a = 5.6d;
		b=5.6f;
		c=5;
		d=5;
		e=5;
		f=5;
		log.info("Primitives :: {} {} {} {} {} {}", a, b, c, d, e, f);

        log.info("F of Data Type with Value :: {} when added 127 will result :: {}",f,(byte)(f+127)); // Here an overflow will occur and the output will be -124 as the result is wrapped around the range of byte

		String name = "Batman";
		log.info("I am "+name+" and \"I am the night\""); //Here \ is an escape character and it is used to escape the double quotes
		log.info("........... Data Types");
		
		// Casting 
		/**
		 * 
		 * Casting is a process of converting one data type to another.
		 * 
		 * There are two types of casting 
		 * 
		 *  1. Narrowing  -> It is done by the programmer
		 *  2. Widening   -> It is done by the compiler
		 * 
		 * 
		 * Narrowing Casting (manually) - converting a larger type to a smaller size type
		 * 
		 * double>float>long>int>short>byte
		 * 
		 * Widening Casting (automatically) - converting a smaller type to a larger type
		 * 
		 */
		log.info("Casting ...........");
		int num1 = 5;
		int num2 = 2;

		log.info("Printing Without Casting :: {}", num1/num2); //Output is 2 //Because int division will give int output
		log.info("Printing With Casting :: {}", (double)num1/num2); //Output is 2.5 //Because we are casting num1 to double so the divison of double and int will give double output

		float miles = 100.0f;
		log.info("Miles :: {} in km :: {}", miles,miles/0.6213); //Output is 100.0 in km :: 160.95284081764044	
		//Here the decimal 0.6213 is a double so the division of float and double will give double output 
		//Note all decimals without predefined suffix are considered as double in java
		//So we can cast the double to float to get the output in float if low precision is needed
		log.info("Miles in {} in km :: {} in float represnetation ", miles,(float)(miles/0.6213));
		
		log.info("........... Casting");

		log.info("Decimal with Underscore (2.3_4_5_6) :: {}",2.3_4_5_6);//Output is 2.3456
		//Underscores are allowed in numeric literals from Java 7 onwards
		//Adding underscores in between the numbers will not affect the value of the number
		//But we cannot have underscore after/adjacent to the decimal point  or before the suffix like 2._3 or 2_.3 or 2.3_
		
	}

}
