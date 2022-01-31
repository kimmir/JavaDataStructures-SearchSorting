package main;

import java.io.*;
import java.util.*;

public class QueueExample {

	public static void main(String[] args) {
		
		Queue<Integer> queue = new LinkedList<Integer>();
		
		for (int i = 0; i < 5; i++) {
			queue.add(i);
		}
		System.out.println("All queue elements " + queue);
		
		int removedElement = queue.remove();
		System.out.println("Removed Element " + removedElement);
		
		System.out.println("All queue elements " + queue);
		
		int queuePeek = queue.peek();
		System.out.println("Head of the queue " + queuePeek);
		
		int size = queue.size();
		System.out.println("Queue size " + size);
	}
}
