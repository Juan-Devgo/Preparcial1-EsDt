package co.edu.uniquindio;

public class Pair<K extends Comparable<K>, V> implements Comparable<Pair<K,V>> {
    private final K key;
    private final V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    @Override
    public int compareTo(Pair<K, V> o) {
        return key.compareTo((K) o.getKey());
    }

    @Override
    public String toString() {
        return key + " = " + value;
    }
}