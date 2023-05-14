public class MyHashTable {
    private class HashNode<K, V> {
        private K key; // K - key for the hash table
        private V value; // V - value associated with the key
        private HashNode<K, V> next; // reference to the next HashNode

        public HashNode(K key, V value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String toString() {
            return "{" + key + " " + value + "}";
        }
    }
    private HashNode<K, V>[] chainArray;
    private int M = 11; // size of the hash table, where 11 is a default number
    private int size; // pairs' number in the hash table

    public MyHashTable() { // the default constructor with the default size
        chainArray = new HashNode[M];
    }
    public MyHashTable(int M) { // the constructor takes an integer and sets M to the given value
        this.M = M;
        chainArray = new HashNode[M];
    }
    private int hash(K key) { // to return corresponding index via computing the hash code
        int hashCode = key.hashCode();
        int index = Math.abs(hashCode) % M;
        return index;

    }
    public void put(K key, V value) { // add a new key and value pair
        int index = hash(key);
        HashNode<K, V> head = chainArray[index];

        // Check is the key already exists or not
        while(head != null) {
            if(head.key.equals(key)) {
                head.value = value;
                return;
            }
            head = head.next;
        }

        // Create a new HashNode and add it to the front of the linked list
        HashNode<K, V> newNode = new HashNode<K, V>(key, value);
        newNode.next = chainArray[index];
        chainArray[index] = newNode;
        size++;
    }
    public V get(K key) { // retrieve the value associated with a given key
        int index = hash(key);
        HashNode<K, V> head = chainArray[index];

        while (head != null) { // if the key is found, the method returns the associated value
            if (head.key.equals(key)) {
                return head.value;
            }
            head = head.next;
        }
        return null;
    }
    public V remove(K key) {

    }
    public boolean contains (V value) {

    }
    public K getKey(V value) {

    }
}