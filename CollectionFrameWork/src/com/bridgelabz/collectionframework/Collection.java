package com.bridgelabz.collectionframework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Stack;

public class Collection{

	private static void doListDemo() {
		System.out.println(" In doListDemo:");
		// Creating List
		List<String> list = new LinkedList<>();
		// Adding object to the list
		list.add("Ravi");
		list.add("Vijay");
		list.add("Ravi");
		list.add("Ajay");

		// Traversing list through Iterator
		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

	private static void doStackDemo() {
		System.out.println("\n In doStackDemo:");
		// Creating Stack
		Stack<String> stack = new Stack<>();
		// Adding object to the stack
		stack.push("Ayush");
		stack.push("Garvit");
		stack.push("Amit");
		stack.push("Ashish");
		stack.push("Garima");

		// Traversing stack through Iterator
		Iterator itr = stack.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

	private static void doQueueDemo() {
		System.out.println("\n In doQueueDemo:");
		// Creating Queue
		PriorityQueue<String> queue = new PriorityQueue<>();
		// Adding object to the queue
		queue.add("Amit Sharma");
		queue.add("Vijay Raj");
		queue.add("JaiShankar");
		queue.add("Raj");
		System.out.println("head:" + queue.element());
		System.out.println("head:" + queue.peek());
		System.out.println("iterating the queue elements:");

		// Traversing queue through Iterator
		Iterator itr = queue.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		queue.remove();
		queue.poll();
		System.out.println("after removing two elements:");
		Iterator<String> itr2 = queue.iterator();
		while (itr2.hasNext()) {
			System.out.println(itr2.next());
		}
	}

	private static void doSetDemo() {
		System.out.println("\n In doSetDemo:");
		// Creating HashSet and adding elements
		HashSet<String> set = new HashSet<String>();
		set.add("Ravi");
		set.add("Vijay");
		set.add("Ravi");
		set.add("Ajay");

		// Traversing elements
		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

	private static void doMapDemo() {
		System.out.println("\n In doMapDemo:");
		// Creating HashMap and adding elements
		Map<Integer, String> map = new HashMap<>();
		map.put(100, "Amit");
		map.put(101, "Vijay");
		map.put(102, "Rahul");

		// Element can traverse in any order
		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}

	public static void main(String[] args) {
		doListDemo();
		doStackDemo();
		doQueueDemo();
		doSetDemo();
		doMapDemo();
	}
}
