import java.util.ArrayList;
import java.util.List;

import co.edu.uptc.models.SimpleList;

public class DemoSimpleList {
    
    private List<Integer> list;

    public void testSimpleList(List<Integer> randomNumbers){
       loadDataSimpleList(randomNumbers);
       sumDataSimpleList(); 
    }

    private void loadDataSimpleList(List<Integer> randomNumbers) {
        list = new SimpleList<Integer>();
        for (int i = 0; i < randomNumbers.size(); i++) {
            list.add(randomNumbers.get(i));
        }
    }

    private void sumDataSimpleList() {
        int result = 0;
        System.out.println("");
        System.out.println("-------Simple List-------");
        double start = System.nanoTime();
        for (int i = 0; i < list.size(); i++) {
            result += list.get(i);
        }
        double end = System.nanoTime();
        double time = end - start;
        System.out.println("Nano: " + time);
        System.out.println("Mili: " + (time/1000000));
        System.out.println("Seg: " + (time/1000000000));
        System.out.println("Resultado: " + result);
    }

}
