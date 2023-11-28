public class UsaLista {

    public static void main(String[] args) {
        ListaSimple lista = new ListaSimple();

        lista.insertaPrimerNodo("H");
        lista.insertaAntesPrimerNodo("O");
        lista.insertaAlFinal("Y");
        lista.insertaEntreNodos("R", "H");

        System.out.println("Lista original:");
        lista.imprimir();
        System.out.println();

        String valorBuscado = "O";
        Node nodoEncontrado = lista.buscarPorValor(valorBuscado);
        if (nodoEncontrado != null) {
            System.out.println("Nodo encontrado por valor '" + valorBuscado + "': " + nodoEncontrado.name);
        } else {
            System.out.println("Nodo no encontrado por valor '" + valorBuscado + "'.");
        }
        System.out.println();

        String claveBuscada = "H";
        String nuevoValor = "N";
        lista.insertarDespuesDe(claveBuscada, nuevoValor);

        System.out.println("Lista después de insertar '" + nuevoValor + "' después de '" + claveBuscada + "':");
        lista.imprimir();
        System.out.println();

        String valorNodo1 = "H";
        String valorNodo2 = "Y";
        lista.intercambiarNodos(valorNodo1, valorNodo2);

        System.out.println("Lista después de intercambiar nodos '" + valorNodo1 + "' y '" + valorNodo2 + "':");
        lista.imprimir();
    }
}