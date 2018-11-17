package org.mitre.web;

public class StackExample {
	
	private Person[] stack;
	private int top;
	private int size;
	
	public StackExample(){
		top = -1;
		size = 50;
		stack= new Person[50];
	}
	
	public StackExample(int size){
		top = -1;
		this.size = size;
		stack= new Person[this.size];
	}
	public boolean push(Person item){
		if(!isFull()){top++;
		stack[top]=item;
		return true;
		}else{
			return false;
		}
	}
	private boolean isEmpty() {
		// TODO Auto-generated method stub
		return (top == -1);
	}
	private boolean isFull() {
		// TODO Auto-generated method stub
		return (top==stack.length-1);
	}

	public Person pop(){
		return stack[top--];
	}

}
