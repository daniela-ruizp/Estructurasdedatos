package aled.cola;

public class Cola {
	private Nodo primero; 
	private Nodo ultimo;
	private int size;


public Cola() {
	primero=null; 
	ultimo=null;
	size=0; 
}


public Nodo getPrimero() {
	return primero;
}


public void setPrimero(Nodo primero) {
	this.primero = primero;
}


public Nodo getUltimo() {
	return ultimo;
}


public void setUltimo(Nodo ultimo) {
	this.ultimo = ultimo;
}
public void ponerFinal(Nodo nodo) {
	if(this.size==0) { 
		primero=nodo;
		ultimo=nodo; 
		size=1; 
	}
	else 
		ultimo.setNext(nodo);
		size++;
}

public int quitar(Nodo nodo) throws Exception{ 
	if (size==0) {
		throw new Exception("La cola está vacía");
	}
	else if (size==1) {
		primero=null;
		ultimo=null; 
		size=0; 
	}
	else {
		primero=primero.getNext();
		size--;
	}
	return nodo.getDato();
}

public Nodo peek() throws Exception{
	if (size==0) {
		throw new Exception("La cola está vacía");
		}
	else return primero; 
	
	}
	
}



