////////////QUEUE

class Node { // represneta un elemento de la cola
    int data;
    Node next;

    public Node(int data) {
        this.data = data; // guarda el valor 
        this.next = null; // apunta al siguiente nodo 
    }
}

class Colas {
    private Node front;// apunta al primer nodo el más antiguo
    private Node rear; // apunt al ulitmo nodo o al mas reciente

    public Colas() {// se inicializa la cola 
        this.front = null; 
        this.rear = null;
    }
    //Método enqueue(int data) (Agregar elemento)
    public void enqueue(int data) {
        Node newNode = new Node(data);// se crea nuevo nodo 
        if (isEmpty()) {// si la cola esta vacia
            front = rear = newNode; // el nodo es tanto el primer nodo como el ultimo
        } else {
            rear.next = newNode;// el nuevo nodo se agrega al dinal 
            rear = newNode;// y rear apunta a ese nodo
        }
    }
     //METODO Pdequeue() (Eliminar el primer elemento)
    public int dequeue() {
        if (isEmpty()) {// si la cola esta vacia 
            System.out.println("Error: La cola está vacía, no se puede hacer dequeue.");// se imprime el error 
            return -1;
        }
        int dequeuedValue = front.data;
        front = front.next;// se mueve al front al siguiente nodo
        if (front == null) {
            rear = null;//si front en nulo tambien se borra rear por lo consiguiente quedo vacia la cola
        }
        return dequeuedValue;
    }

    //METODO PEEK (Ver el primer elemento sin eliminarlo)
    public int peek() {
        if (isEmpty()) {
            System.out.println("Error: La cola está vacía, no hay elementos en el frente.");
            return -1;
        }
        return front.data;
    }

    public boolean isEmpty() {
        return front == null;//retorna true si el front es null osea si esta vacia la cola
    }

    //Método printQueue() (Imprimir la cola)
    public void printQueue() {
        Node temp = front;
        while (temp != null) {
            System.out.print(temp.data + " <- ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Queue queue = new Queue();

        System.out.println("Intentando hacer dequeue en una cola vacía:");
        System.out.println("Elemento eliminado: " + queue.dequeue()); // Error

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Cola después de encolar elementos:");
        queue.printQueue();

        System.out.println("Elemento en el frente: " + queue.peek());

        System.out.println("Elemento eliminado: " + queue.dequeue());

        System.out.println("Cola después de hacer dequeue:");
        queue.printQueue();
    }
}