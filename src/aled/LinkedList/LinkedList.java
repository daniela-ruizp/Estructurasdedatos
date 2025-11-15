package aled.LinkedList;

public class LinkedList {
	private Node head; //Guardar referencia primer nodo

	public LinkedList() {
		this.head = null;
	}
	//Añadir un Node al inicio
	public void anadirPrincipio(int data) {
		Node nuevo= new Node(data); 
		nuevo.setNext(head);
		head=nuevo;
	}
	
	//Anadir un nodo al final 
	public void anadirFinal(int data) {
		Node nuevo = new Node(data);

		if (head == null) {
			head = nuevo;
			return;
		}

		Node recorrido = head;
		while (recorrido.getNext() != null) {
			recorrido = recorrido.getNext();
		}

		recorrido.setNext(nuevo);
	}

	// La lista contiene el elemento
	public boolean contains(int data) {
		Node recorrido = head;
		while (recorrido != null) {
			if (recorrido.getDato() == data) {
				return true;
			}
			recorrido = recorrido.getNext();
		}
		return false;
	}
	
	//Quitar un elemento de la lista
	public void eliminarElemento(int data) {
		if (head.getDato()==data) {
			head=head.getNext();
		}
		Node recorrido=head;
		while(recorrido.getNext()!=null && recorrido.getNext().getDato()!=data) { //Si se sale es que el siguiente tiene el dato a eliminar
			recorrido=recorrido.getNext();
		}
		if(recorrido.getNext()!=null) {
			recorrido.setNext(recorrido.getNext().getNext());
		}
	}
		
	// Imprime la linkedList
	public void print() {
		Node recorrido = head;
		while (recorrido != null) {
			System.out.print(recorrido.getDato() + " -> ");
			recorrido = recorrido.getNext();
		}
		System.out.println("null");

	}
	
	public static void main(String[] args) {
		LinkedList list = new LinkedList();

		list.anadirPrincipio(3);
		list.anadirPrincipio(2);
		list.anadirPrincipio(1);

		list.anadirFinal(4);
		list.anadirFinal(5);

		list.print();

		list.eliminarElemento(3);
		list.print(); 

		System.out.println(list.contains(4)); 
		System.out.println(list.contains(99)); 

	}
}
