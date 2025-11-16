package DoubleLinkedList;

import DoubleLinkedList.Nodel;

public class DoubleLinkedList {
	private Nodel head; //Guardar referencia primer nodo
	private Nodel tail; //Referencia último nodo

	public DoubleLinkedList() {
		this.head = null;
		this.tail=null;
	}
	
	public void anadirPrincipio(int data) {
		Nodel nuevo=new Nodel(data); 
		
		if (head == null) {
			head = nuevo;
			tail=nuevo;
		}
		nuevo.setNext(head);
		head.setPrev(nuevo);
		head=nuevo;
	}
	
	public void anadirFinal(int data) {
		Nodel nuevo=new Nodel(data); 
		
		if (tail==null) {
			head=nuevo; 
			tail=nuevo;
		}
		
		nuevo.setPrev(tail);
		tail.setNext(nuevo);
		tail=nuevo;
	}
	
	public boolean contains(int data) {
		Nodel recorrido=head; 
		
		while (recorrido != null) {
			if (recorrido.getData() == data) {
				return true;
			}
			recorrido = recorrido.getNext();
		}
		return false;
	}
	
	public void eliminarElemento(int data) {
		Nodel recorrido = head;

		while (recorrido != null) {
			if (recorrido.getData() == data) {

				// Borrar la cabeza
				if (recorrido == head) {
					head = recorrido.getNext();
					if (head != null) {
						head.setPrev(null);
					} else {
						// si la lista queda vacía
						tail = null;
					}
				}

				// Borrar la cola
				else if (recorrido == tail) {
					tail = recorrido.getPrev();
					tail.setNext(null);
				}

				// Eliminar nodo de en medio
				else {
					recorrido.getPrev().setNext(recorrido.getNext());
					recorrido.getNext().setPrev(recorrido.getPrev());
				}
			}
			recorrido = recorrido.getNext();
		}
	}
	
	  public void printForward() {
	        Nodel recorrido= head;
	        while (recorrido != null) {
	            System.out.print(recorrido.getData() + " <-> ");
	            recorrido = recorrido.getNext();
	        }
	        System.out.println("null");
	    }
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
        DoubleLinkedList list = new DoubleLinkedList();

        list.anadirPrincipio(3);
        list.anadirPrincipio(2);
        list.anadirPrincipio(1);

        list.anadirFinal(4);
        list.anadirFinal(5);

        list.printForward();   

        list.eliminarElemento(3);
        list.printForward();  
		
	}
}

