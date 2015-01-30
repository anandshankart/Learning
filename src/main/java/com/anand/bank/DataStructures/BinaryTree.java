package com.anand.bank.DataStructures;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class BinaryTree {

	
	List <BinaryTree> strings;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a = new ArrayList();
		a.add("Anand");
		a.add("Ashok");
		a.add("BV");
		a.add("BC");
		
		ListIterator s = a.listIterator();
		while(s.hasNext()){
			System.out.println(s.next());
			
		}

	}

}
