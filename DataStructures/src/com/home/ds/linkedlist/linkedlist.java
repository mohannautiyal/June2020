package com.home.ds.linkedlist;

public class linkedlist {

	node head;

	// ****************inserting data at the end *************
	public void insert(int data) {
		node newNode = new node();
		newNode.data = data;

		if (head == null)
			head = newNode;
		else {
			node pos = head;
			while (pos.next != null) {
				pos = pos.next;
			}

			pos.next = newNode;
		}

	}

	//*******************display all the data ***********************
	public void show() {
		node pos = head;
		while (pos.next != null) {
			System.out.print(pos.data + " ");

			pos = pos.next;
		}

		System.out.println(pos.data);
	}
	
	
	//********************delete nth element from the end of the list************
	public void deleteElementFromEnd(int n) {
		
		node currpos = null;
		currpos.next = null;
		
		while(currpos.next != null) {
			
			
			
		}
		
	}
	
	
	

}
