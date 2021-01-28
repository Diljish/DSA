package com.diljish.datastrucrure.stack;

public class Stack {
	
	
	int stack[] = new int [5];
	int top = 0;
	public void push(int data) {
		stack[top] = data;
		top++;
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