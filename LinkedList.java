
//LISTA ENLAZADA SIMPLE

class Node{ //se define una clase nodo el cual es un elemento de la lista
    int data; // variable llamaa data que guardara al nodo
    Node next; //variable next tipo nodo guardara el siguiente nodo de la lista

    public Node(int data){ //contructor que se ejecutara cuando sea la creación de un nuevo nodo y se le asigne un valor
        this.data=data; //guardamos el valor de data
        this.next=null; // ultimo nodo
    }
}

class LinkedList {// clase lista enlzada
    Node head; //nodo inicial 

    public void insert(int data) {// METODO PARA "AGREGAR" UN NUEVO NODO A LA LISTA 

        Node newNode = new Node(data);// nuevo nodo con el valor recibido
        if (head == null) {// si la lista esta vacia -->
            head = newNode;// el nuevo nodo se convierte en la cabezza de la lista
        } else { // si ya hay nodos en lista
            Node temp = head;// se crea una variable y se le apunta al primer nodo
            while (temp.next != null) {// y se recorre la lista hasta llegar al ulitmo nodo
                temp = temp.next; // conectamps el ulitmo nodo -->
            }
            temp.next = newNode;// con el nodo nuevo
        }
    }

    public void printList() {// METODO PARA IMPRIMIR LA LISTA 

        Node temp = head;//se crear una variable temp tipo nodo y se apunta al nodo inicial
        while (temp != null) {//mientras tema no sea nullo osea mientras haya nodos en ls lista
            System.out.print(temp.data + " -> ");// se imprimira el valor del nodo
            temp = temp.next;// se avaza al siguiente nodo
        }
        System.out.println("null"); // se imprime null para indicar el final de la lista
    }
    
    public static void main(String[] args) { //METODO PRINCIPAL 
        LinkedList list = new LinkedList();// se crea una lista la cual esta vacia
        list.insert(10);// se agrega un nodo con valor de 10
        list.insert(20);// se agrega un nodo con valor de 20
        list.insert(30);// se agrega un nodo con valor de 30
        list.printList();// se imprime la lista
    }
}






