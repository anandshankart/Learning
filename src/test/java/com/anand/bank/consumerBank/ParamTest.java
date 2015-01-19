package com.anand.bank.consumerBank;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class ParamTest {

	@Test
	@Parameters("myparam1")
	public void printme(String myparam1){
		System.out.println("The param name is : "+myparam1);
	}
}
