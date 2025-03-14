package co.edu.uniquindio;

import java.util.HashMap;
import java.util.Iterator;

public class Hashmap<K, V> implements Iterable<K> {
    private HashMap<K, V> hashmap;

    public Hashmap() {
        hashmap = new HashMap<>();
    }

    @Override
    public Iterator<K> iterator() {
        return hashmap.keySet().iterator();
    }


}