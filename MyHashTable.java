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
    public void put(K key, V value) {

    }
    public V get(K key) {

    }
    public V remove(K key) {

    }
    public boolean contains (V value) {

    }
    public K getKey(V value) {

    }
}