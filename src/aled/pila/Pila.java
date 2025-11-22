package aled.pila;

public class Pila {
	private Nodel top;
	private int size;
	
	public Pila() {
		top=null;
		size=0;
	}
	
	public void push(Nodel nodo) { //Poner arriba 
		if(size==0) {
			top=nodo;
			size++;
		}
		else 
			nodo.setPrev(top);
			top.setNext(nodo);
			top=nodo;
			size++;
	}
	
	public Nodel pop() throws Exception {
		if (size==0) 
			throw new Exception("La pila está vacía");
		else {
			Nodel aDevolver=top;
			top.getPrev().setNext(null);
			size--;
			return aDevolver;
		}
	}
	public Nodel peek() throws Exception{
		if(size==0) 
			throw new Exception("Pila vacía");
		else return top;
	}
	
	public boolean contains(Nodel n) {
		Nodel recorrido=top; 
		while(recorrido!=null) {
			if (recorrido==n)
				return true;
			recorrido=recorrido.getPrev();
		}
		return false;
	}
}
