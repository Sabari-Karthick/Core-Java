package com.batman.basic;

import lombok.extern.slf4j.Slf4j;

/**
 * Technically we can have any number of main methods in diffetent classes and
 * choose which to run
 * 
 * Static -> means it is independent of class means it belongs to class not to
 * its instance
 * 
 * 
 * If we override a main method, it will not be called by JVM JVM calls the main
 * method with the following signature only -> public static void main(String[]
 * args)
 * 
 * And for a single Java file there can be only one public class
 * 
 * 
 */
@Slf4j
public class HelloWorld {
	public static void main(String[] args) {
		log.info("Hello, World!");
	}
}
