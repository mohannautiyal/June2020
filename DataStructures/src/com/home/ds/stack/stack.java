package com.home.ds.stack;

public class stack {

	int arr[];
	int top;
	int size;

	// constructor to initialize array size
	public stack(int size) {
		this.size = size;
		arr = new int[size];

	}
	
	//==========================================
	// check if stack is empty
	public boolean isEmpty() {
		if (top == 0) {
		//	System.out.println("Stack is empty");
			return true;
		} else
			return false;
	}

	//==========================================
	//check if stack is full
	public boolean isFull() {
		if (top == size) {
		//	System.out.println("Stack is full");
			return true;
		} else
			return false;
	}

	//==========================================
	public void push(int i) {
       if(!isFull()) {
    	   arr[top] = i;
   		top++;
       }
       else
    	   System.out.println("Stack is Full");
	}
	
	//==========================================
	public void display() {
		if (!isEmpty()) {
		 System.out.println("===== Displaying elements =====");
			for (int i : arr)
				System.out.println(i);
		}
		else
			System.out.println("Stack is empty");
	}
	
	//==========================================
     public void pop() {
    	 if(!isEmpty()) {    		 
    		int popElement =  arr[top-1];
    		top--;
    	 }
    	 else
    		 System.out.println("Stack is empty");    	 
     }
	
     
     //========================================
     public void peek() {
    	
    	 if(!isEmpty()) {
    		 System.out.println("Top Element is " + arr[top-1]); 
    		 
    	 }
    	 else 
    		 System.out.println("Stack is empty");
     }
     
     
     
     
     
}
