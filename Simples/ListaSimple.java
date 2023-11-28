public class ListaSimple{
	Node top;

    public boolean insertaPrimerNodo(String dato){
	if (top == null) { //La lista no está vacía
	      top = new Node();
	      top.name = dato;
	      top.next = null;

		return true;
	}
	else {
		return false;
	}
    }

    public void insertaAntesPrimerNodo(String nombre){
	Node temp; 
	temp = new Node ();
	temp.name = nombre;
	temp.next = this.top;
	this.top = temp;
	temp = null;
    }

    public void insertaAlFinal(String nombre){
	Node temp = new Node ();
	temp.name = nombre;
	temp.next = null;
	Node temp2 = this.top;

	while (temp2.next != null)
	temp2 = temp2.next;
        


	temp2.next = temp;
	temp = null;
	temp2 = null;
    }

    public boolean insertaEntreNodos(String nombre, String buscado) {
        Node temp = new Node();
        temp.name = nombre;
        Node temp2 = this.top;

        while (temp2 != null && temp2.name.equals(buscado) == false) {
            temp2 = temp2.next;
        }

        if (temp2 != null) {  // Nodo buscado se encontró
              temp.next = temp2.next;
              temp2.next = temp;
              temp = null;
              temp2 = null;
              return true;
            } else {
                return false;
        }
    }

    public void imprimir(){
	for (Node temp = this.top; temp != null; temp = temp.next){
		System.out.print("[ " + temp.name + " ] -> ");
	}

	System.out.print("[X]\n"); 
    }

    public String toString(){
	String cadAux = "";
	for (Node temp = this.top; temp != null; temp = temp.next){
			cadAux += "[ " + temp.name + " ] -> ";
	}

	cadAux += "[X]\n"; 

	return cadAux;
    }

    public Node buscarPorValor(String valor) {
        Node temp = this.top;

        while (temp != null && !temp.name.equals(valor)) {
            temp = temp.next;
        }

        return temp;
    }

    public void insertarDespuesDe(String claveBuscada, String nuevoValor) {
        Node temp = this.top;

        while (temp != null && !temp.name.equals(claveBuscada)) {
            temp = temp.next;
        }

        if (temp != null) {
            Node nuevoNodo = new Node();
            nuevoNodo.name = nuevoValor;
            nuevoNodo.next = temp.next;
            temp.next = nuevoNodo;
        }
    }

    public void intercambiarNodos(String valorNodo1, String valorNodo2) {
        Node nodo1 = null, nodo2 = null;
        Node temp = this.top;

        while (temp != null && (nodo1 == null || nodo2 == null)) {
            if (temp.name.equals(valorNodo1)) {
                nodo1 = temp;
            } else if (temp.name.equals(valorNodo2)) {
                nodo2 = temp;
            }
            temp = temp.next;
        }

        if (nodo1 != null && nodo2 != null) {
            String tempName = nodo1.name;
            nodo1.name = nodo2.name;
            nodo2.name = tempName;
        }
    }

    public void borrarPrimerNodo(){
		this.top = this.top.next;
    }

    public boolean borrarCualquierNodo(String buscado){
	Node temp = this.top;

	while ( (temp != null) && temp.name.equals(buscado) == false ) {	
		  temp = temp.next;
	}

	if (temp != null){  
		temp.next = temp.next.next;
		temp = null;	
		return true;
	}
	else return false;
    }

}