package com.home.ds.stack;

public class runner {

	
	public static void main(String[] args) {
		stack st = new stack(4);
		st.peek();
		st.display();
		st.push(10);
		st.push(20);
		st.pop();
		st.push(30);
		st.peek();
		st.push(40);
		st.pop();
		st.push(50);
		st.peek();
		st.push(60);
		st.display();
	}
}
