package com.anand.bank.consumerBank;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StaticMethodTutorial {

	StaticMethodTutorial smt;
	@Before
	public  void setup(){
		 System.out.println("Setting up... ");
	}

	
	@After 
	public void cleanup(){
		System.out.println("Cleaning up!!!"); 
	}
	
	
	@Test
	public  void printHello(String value){
		System.out.println(value);
		Assert.assertEquals(true, true);
	}
}
