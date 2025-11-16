package DoubleLinkedList;

public class Nodel {
		
		private int data; 
		private Nodel next; 
		private Nodel prev; 
		
	public Nodel(int data) {
		this.data=data; 
		this.next=null; 
		this.prev=null;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Nodel getNext() {
		return next;
	}

	public void setNext(Nodel next) {
		this.next = next;
	}

	public Nodel getPrev() {
		return prev;
	}

	public void setPrev(Nodel prev) {
		this.prev = prev;
	}
		

}
