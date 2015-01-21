package com.anand.bank.DataStructures;

import java.util.ArrayList;

public class MapTutorial {

	public static void main(String[] args) {
		
//		HashMap <>
		
		Node node = new Node("parent");
//		System.out.println(node);
		
		ArrayList<Node> nodes = new ArrayList<Node>();
		
		nodes.add(new Node("child1"));
		nodes.add(new Node("child2"));
		
		System.out.println(nodes);
		
	}

}
