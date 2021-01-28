package com.diljish.datastrucrure.stack;

public class DynamicStack {
	
	int capacity = 2;
	int stack[] = new int [capacity];
	int top = 0;
	public void push(int data) {
		
		if(stack.length == capacity) {
			expand();
		}
		stack[top] = data;
		top++;
	}
	
	private void expand() {
		int length = stack.length;
		int newStack [] = new int[capacity *2];
		System.arraycopy(stack, 0, newStack, 0, length);
		capacity = capacity *2;
		stack = newStack;
		
	}
	
	public void show() {
		for(int n: stack) {
			System.out.println(n);
		}
	}
	
	public int pop() {
		int data;
		data = stack[top];
		stack[top] =0;
		top--;
		return data;
	}
	
	
	public int peek() {
		int data;
		data = stack[top-1];
		return data;
		
	}

}
