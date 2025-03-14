package co.edu.uniquindio;

import java.util.*;


public class App {
    public static void main( String[] args ){
        /*punto2();
        punto3C();
        punto4();
        punto6();
        punto7();
        punto8();
        punto9();
        punto10();*/
        punto11();
    }

    private static void punto2() {
        ArrayList<?> listaGenerica = new ArrayList<>();

        System.out.println(invertirListaGenerica(listaGenerica));
    }

    private static List<?> invertirListaGenerica(ArrayList<?> listaGenerica) {
        Collections.reverse(listaGenerica);
        return listaGenerica;
    }

    private static void punto3C() {

        /*
         * En este ejemplo se usará el método binarySearch,
         * Este método buscará un elemento especificado en
         * la colección que le pase como parámetro. Devolverá
         * un entero el cuál será el índice de donde se encuentra
         * el elemento en caso de ser una lista, en otro caso,
         * devuelve la llave con la que se accede al elemento
         * en la colección. En caso de no encontrar el elemento,
         * devolverá -1 para el caso de las listas, en otro caso,
         * devolverá el valor de la menor llave menos uno.
         */

        int n = 4;
        ArrayList<Integer> listaEnteros = new ArrayList<>();
        int[] array = {1, 2, 3, 4, 6, 7, 10};

        for (int e: array) {
            listaEnteros.add(e);
        }

        System.out.println(Collections.binarySearch(listaEnteros, n));

        /*
         * En este caso usaremos el método min, el cual devolverá
         * el menor elemento de la colección, para encontrarlo,
         * necesitará que la colección sea de elementos que implementen
         * comparable y según lo que tengan definido en su método
         * compareTo. Para tipos de datos comunes escogerá el
         * mínimo con base al ordenamiento natural.
         */

        TreeSet<Integer> conjunto = new TreeSet<>(listaEnteros);

        System.out.println(Collections.min(conjunto));
    }

    private static void punto4() {
        Arraylist<Integer> listaEnteros = new Arraylist<>();
        for (Integer e: listaEnteros) {
            System.out.println(e);
        }

        Hashmap<Integer, String> hashmap = new Hashmap<>();
        for (Integer e: hashmap){
            System.out.println(e);
        }
    }

    private static void punto6() {

        String[] array = {"hey", "ey", "ay", "ei", "ei"};
        String element = "ei";

        System.out.println(countOcurrencies(array, element));
    }

    private static <T> int countOcurrencies(T[] array, T element) {
        int count = 0;

        for(T t: array) {
            if(t.equals(element)) {
                count++;
            }
        }

        return count;
    }

    private static void punto7() {
        List<Pair<?, String>> listaPares = new ArrayList<>();

        listaPares.add(new Pair<>(1, "hey"));
        listaPares.add(new Pair<>(2, "hei"));
        listaPares.add(new Pair<>(6, "ey"));
        listaPares.add(new Pair<>(-4, "ay"));
        listaPares.add(new Pair<>(8, "ei"));

        Collections.sort((List) listaPares);
        System.out.println(listaPares.getLast().getKey());
    }

    private static void punto8() {
        Integer[] array = {1, 2, 3, 4, 6, 7, 10};

        ArrayList<? super Number> listaGenericaNumeros = new ArrayList<>();

        Collections.addAll(listaGenericaNumeros, array);

        System.out.println(sumar(listaGenericaNumeros));
    }

    private static Integer sumar(Collection<? super Number> lista) {
        Integer suma = 0;
        for (Object o: lista) {
            suma += (Integer) o;
        }
        return suma;
    }

    private static void punto9() {

        HashSet<? super Object> set1 = new HashSet<>();
        HashSet<?super Object> set2 = new HashSet<>();

        set1.add("A"); set2.add("B");
        set1.add("C"); set2.add("D");
        set1.add("B"); set2.add("A");
        set1.add("D"); set2.add("C");
        set1.add("X"); set2.add("Y");

        System.out.println(intersection(set1, set2));
    }

    private static Set<? super Object> intersection(Set<? super Object> set1, Set<? super Object> set2) {
        HashSet<? super Object> intersection = new HashSet<>();

        for (Object o: set1) {
            for (Object o2: set2) {
                if(o.equals(o2)) {
                    intersection.add(o);
                }
            }
        }

        return intersection;
    }

    private static void punto10() {
        List<? super Object> lista = new ArrayList<>();
        lista.add(null);
        lista.add("null");
        lista.add(null);
        lista.add("null1");
        lista.add(null);
        lista.add("null2");

        Map<Integer, ?> mapa = frecuencyMap(lista);

        System.out.println(mapa);
    }

    private static <T> HashMap<Integer, T> frecuencyMap(List<T> lista) {
        HashMap<Integer, T> mapa = new HashMap<>();
        for (int i = 0; i < lista.size(); i++) {
            mapa.put(i, lista.get(i));
        }
        return  mapa;
    }

    private static void punto11() {
        Map<? super Object, Integer> mapa = new HashMap<>();

        mapa.put("OO1", 1);
        mapa.put("O1O", 2);
        mapa.put("O11", 3);
        mapa.put("1OO", 4);
        mapa.put("1O1", 5);
        mapa.put("11O", 6);
        mapa.put("111", 7);

        removeIfEven(mapa);

        System.out.println(mapa);
    }

    private static void removeIfEven(Map<? super Object, Integer> mapa) {
        ArrayList<? super Object> posicionesPares = new ArrayList<>();
        for (Object o: mapa.keySet()) {
            Integer pos = mapa.get(o);
            if (pos % 2 == 0) {
                posicionesPares.add(o);
            }
        }

        for (Object pos: posicionesPares) {
            mapa.remove(pos);
        }
    }
}