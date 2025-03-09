import java.util.HashMap;// clase que permite usar una tabla hash en Java.
import java.util.Map; // Nos permite recorrer la estructura más fácilmente.

class HashTableExample {
    public static void main(String[] args) {//se crear una tabla 
        HashMap<Integer, String> hashMap = new HashMap<>();// Integer es el tipo de las claves y string el tipo de valores

        //insertar elementos en el hashmap
        hashMap.put(1, "Manzana");//clave 1, valor manzana
        hashMap.put(2, "Banana");
        hashMap.put(3, "Cereza");

        System.out.println("Contenido del HashMap:");
        printHashMap(hashMap);//imprimir la tabla 

        int keyToSearch = 2;//devuelve el valor por su clave
        System.out.println("Valor asociado a la clave " + keyToSearch + ": " + hashMap.get(keyToSearch));

        int keyToRemove = 1;//elimina un valor por su clave
        System.out.println("Eliminando la clave " + keyToRemove);
        hashMap.remove(keyToRemove);
        
       //verifica que la clave existe
        System.out.println("¿La clave 3 existe? " + hashMap.containsKey(3));

        // Recorre el hashmap
        System.out.println("Iterando sobre el HashMap:");
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println("Clave: " + entry.getKey() + ", Valor: " + entry.getValue());
        }
    }
    //retorna todas las entradas clave-valor del hashmpas 
    public static void printHashMap(HashMap<Integer, String> map) {
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Clave: " + entry.getKey() + ", Valor: " + entry.getValue());//obtiene la clave y el valor
        }
    }
}
