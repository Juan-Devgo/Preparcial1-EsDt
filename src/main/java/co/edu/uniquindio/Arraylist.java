package co.edu.uniquindio;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist<V> implements Iterable<V> {
    private ArrayList<V> lista;

    public Arraylist() {
        lista = new ArrayList<>();
    }

    public Iterator<V> iterator() {
        return lista.iterator();
    }
}
