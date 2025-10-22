// original implementation of hash map using ll ************imp 
// Why resizing is needed?

// Suppose capacity = 10, but we insert 100 keys.

// Many keys will collide into the same bucket → long linked lists → O(n) lookups.

// To fix this, we double the capacity and rehash all keys into a bigger array.

// This keeps lookup close to O(1).
// 🔹 Rules of resizing

// Keep track of size (number of elements inserted).

// Keep a load factor threshold (e.g., 0.7).

// loadFactor = size / capacity.

// When loadFactor > threshold, double the capacity and rehash.
import java.util.*;

class MyHashMap<K, V> {

    // Each bucket is a LinkedList of Entities
    private LinkedList<Entity<K, V>>[] buckets;
    private int capacity;
    private int size;
    private final double loadFactor = 0.7; // threshold for resizing

    // Key-Value pair class
    private static class Entity<K, V> {
        K key;
        V value;

        public Entity(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    // Constructor
    public MyHashMap() {
        this.capacity = 4; // small initial capacity
        this.buckets = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) {
            buckets[i] = new LinkedList<>();
        }
        this.size = 0;
    }

    // Hash function
    private int getBucketIndex(K key) {
        return Math.abs(key.hashCode() % capacity);
    }

    // Put key-value pair
    public void put(K key, V value) {
        int index = getBucketIndex(key);
        LinkedList<Entity<K, V>> bucket = buckets[index];

        for (Entity<K, V> e : bucket) {
            if (e.key.equals(key)) {
                e.value = value; // update
                return;
            }
        }

        bucket.add(new Entity<>(key, value)); // insert new
        size++;

        // check load factor
        if ((1.0 * size) / capacity > loadFactor) {
            resize();
        }
    }

    // Get value by key
    public V get(K key) {
        int index = getBucketIndex(key);
        LinkedList<Entity<K, V>> bucket = buckets[index];

        for (Entity<K, V> e : bucket) {
            if (e.key.equals(key)) {
                return e.value;
            }
        }
        return null;
    }

    // Remove key
    public V remove(K key) {
        int index = getBucketIndex(key);
        LinkedList<Entity<K, V>> bucket = buckets[index];

        Iterator<Entity<K, V>> it = bucket.iterator();
        while (it.hasNext()) {
            Entity<K, V> e = it.next();
            if (e.key.equals(key)) {
                it.remove();
                size--;
                return e.value;
            }
        }
        return null;
    }

    // Resize function: doubles capacity and rehashes all elements
    private void resize() {
        System.out.println("Resizing from " + capacity + " to " + capacity * 2);
        LinkedList<Entity<K, V>>[] oldBuckets = buckets;
        capacity *= 2;
        buckets = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) {
            buckets[i] = new LinkedList<>();
        }

        size = 0; // reset size and re-add
        for (LinkedList<Entity<K, V>> bucket : oldBuckets) {
            for (Entity<K, V> e : bucket) {
                put(e.key, e.value); // rehash into new buckets
            }
        }
    }

    // Driver code
    public static void main(String[] args) {
        MyHashMap<String, String> map = new MyHashMap<>();

        map.put("Mango", "King of fruits");
        map.put("Apple", "Red fruit");
        map.put("Banana", "Yellow fruit");
        map.put("Grapes", "Small fruit");
        map.put("Orange", "Citrus"); // will trigger resize

        System.out.println("Apple: " + map.get("Apple"));   
        System.out.println("Removed Mango: " + map.remove("Mango")); 
        System.out.println("Mango after removal: " + map.get("Mango")); 
    }
}

