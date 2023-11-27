package Classes;

import java.util.ArrayList;


public class Pair <T,E> {
    private T tObj;
    private E eObj;
    

    public Pair(T tObj, E eObj) {
        this.tObj = tObj;
        this.eObj = eObj;
    }

    public T gettObj() {
        return tObj;
    }

    public E geteObj() {
        return eObj;
    }

    public void settObj(T tObj) {
        this.tObj = tObj;
    }

    public void seteObj(E eObj) {
        this.eObj = eObj;
    }

    @Override
    public String toString() {
        return tObj + " " + eObj;
    }
    
    
    public static <T,E> void swapPairs(ArrayList<Pair<T,E>> list){
        ArrayList<Pair<E,T>> newList = new ArrayList<>(list.size());
        for(Pair<T,E> p : list){
            Pair<E,T> newPair = new Pair<>(p.geteObj(), p.gettObj());
            newList.add(newPair);
        }
        System.out.println(newList);
    }
}

