import java.util.ArrayList;

import Classes.Box;
import Classes.Pair;

public class App {
    public static void main(String[] args) {
        Box<String> box1 = new Box<String>("one", "один");
        box1.printBoxContents();

        Pair<Integer, String> pair1 = new Pair<Integer, String>(7, "Семь");
        Pair<Integer, String> pair2 = new Pair<Integer, String>(3, "Три");
        ArrayList<Pair<Integer, String>> list = new ArrayList<>();
        list.add(pair1);
        list.add(pair2);
        System.out.println(list);

        
        Pair.swapPairs(list);;
    }

}
