////STACK 

class Stack {// se define la clase stack 
    private Node top; // nodo que siempre apunta al ultimo elemento agregado en la pila

    private static class Node {
        int data; 
        Node next;

        public Node(int data) {
            this.data = data;// guarda el valor del nodo 
            this.next = null;// aputan al nodo anterior de la pila 
        }
    }

    public Stack() {
        this.top = null;// pila vacia 
    }

    public void push(int data) {
        Node newNode = new Node(data);// se crea nuevo nodo
        newNode.next = top;//el nuevo nodo apunta a el nodo actual 
        top = newNode;// top se actualiza al nuevo nodo
    }

    public int pop() {
        if (isEmpty()) {// si la pila esta vacia 
            System.out.println("Error: La pila está vacía");

        }
        int poppedValue = top.data;// se guarda el valor de poppedvalue
        top = top.next;// mueve top al siguiente nodo
        return poppedValue;// devuelve poppedValue
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Error: La pila está vacía");
        }
        return top.data;//devuelve el valor del nodo en top 
        }

    public boolean isEmpty() {
        return top == null;//se verifica que la pila este vacia 
    }

    public void printStack() {
        Node temp = top;
        while (temp != null) {// recorre la pila desde top y muestra todos los elementos 
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);// se insertan nuevos nodos
        stack.push(20);
        stack.push(30);

        System.out.println("Pila después de insertar elementos:");
        stack.printStack();// se imprime la pila 

        System.out.println("Elemento en la cima: " + stack.peek());

        System.out.println("Elemento eliminado: " + stack.pop());

        System.out.println("Pila después de hacer pop:");
        stack.printStack();
    }
}