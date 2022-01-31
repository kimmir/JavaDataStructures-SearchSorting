package main;
import java.io.*;
import java.util.*;

public class StackExample {

	public static void main(String[] args) {

		Stack<Integer> stack = new Stack<Integer>();

		StackPush(stack);
		StackPop(stack);
		StackPush(stack);
		StackPeek(stack);
		StackSearch(stack, 2);
		StackSearch(stack, 6);
	}

	// Pushing Element to top of stack
	static void StackPush(Stack<Integer> stack) {
		for (int i = 0; i < 5; i++) {
			stack.push(i);
		}
	}

	// Popping element from top of stack
	static void StackPop(Stack<Integer> stack) {
		for (int i = 0; i < 5; i++) {
			Integer y = (Integer) stack.pop();
			System.out.println(y);
		}
	}

	// Display element on the top of stack
	static void StackPeek(Stack<Integer> stack) {
		Integer element = (Integer) stack.peek();
		System.out.println("Element on top of the stack " + element);
	}

	// Searching element in the stack
	static void StackSearch(Stack<Integer> stack, int element) {
		Integer pos = (Integer) stack.search(element);

		if (pos == -1) {
			System.out.println("Element not found");
		} else {
			System.out.println("Element found at position " + pos);
		}
	}
}
