//LISTA ENLAZADA DOBLE

class Node { //se define un nodo
    int data;// se guarda el valor del nodo
    Node next;// apunta al siguiente nodo
    Node prev;//apunta al nodo anterior

    public Node(int data) {// constructor
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class DoublyLinkedList { // se crea la clase lista doble
    Node head; //apunta al primer nodo
    Node tail; // apunta al ultimo nodo

    public void insert(int data) {
        Node newNode = new Node(data);// se crear un nuevo nodo
        if (head == null) {// si la lista esta vacia -->
            head = newNode; //el nuevo nodo apuntara al inicio
            tail = newNode;// y al final de la cola
        } else {
            tail.next = newNode;// si hay elementos, se conecta el ultimo nodo con el nuevo
            newNode.prev = tail;// y el nuevo nodo apunta hacia atras
            tail = newNode;// movemos tail al nuevo nodo
        }
    }

    public void printForward() { //
        Node temp = head;// incia desde head
        while (temp != null) {//se recorre la lista imprimiendo los valores 
            System.out.print(temp.data + " ⇄ ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void printBackward() {
        Node temp = tail;// inciamos desde la cola 
        while (temp != null) {
            System.out.print(temp.data + " ⇄ ");
            temp = temp.prev;// se recorre la lista hacia atras con prev 
        }
        System.out.println("null");
    }

    public static void main(String[] args) { // se crea una lista enlazada doble 
        DoublyLinkedList list = new DoublyLinkedList();
        list.insert(10);// inserta varios valores nuevos
        list.insert(20);
        list.insert(30);

        System.out.println("Lista en orden:");
        list.printForward();// se imprime la lista en orden normal 

        System.out.println("Lista en orden inverso:");
        list.printBackward();// se imprim la lista en orden inverso 
    }
}