import java.util.ArrayList;
import java.util.List;

import co.edu.uptc.test.RealCal;
import co.edu.uptc.test.Test;

public class App {
     public static void main(String[] args) {
          
          List<Integer> randomNumber = generateRandomNumer(10000, 1, 10000);

          Test test = new Test();

          test.testArrayList(randomNumber);
          RealCal<Integer> ra = new RealCal<>();
          ra.run(test.getList(), "Array List");

          test.testSimpleList(randomNumber);
          ra.run(test.getList(), "Simple List");

     }

     public static List<Integer> generateRandomNumer(int size, int min, int max){
          List<Integer> list =  new ArrayList<Integer>();
          for (int i = 0; i < size; i++) {
               int randomNumber = ((int)(Math.random() * (max - min + 1))+min);
               list.add(randomNumber);
          }
          return list;
     }





      //  SimpleList sm = new SimpleList();
     //  long start = System.nanoTime();
     //  for(int i = 0; i < 29000000; i++){
     //   sm.addEnd("a");
     //  }
     //  long end = System.nanoTime();
     //  System.out.println("tiempo: " + (end-start));
     //    sm.add("hi");
     //    sm.add("hi2");
     //    sm.add("hi3");
     //    sm.addToTop("hi4");

     //    sm.addAfterNode("hi2", "hi5");

     //    sm.showList();
}
