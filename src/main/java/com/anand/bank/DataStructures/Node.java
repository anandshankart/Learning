package com.anand.bank.DataStructures;

public class Node {

	String value;
	Node previousNode;
	Node nextNode;
	
	
	public Node (String value){
		this.value=value;
	}
	
	public String toString(){
		return value;
	}
}
