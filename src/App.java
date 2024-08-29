import java.util.ArrayList;
import java.util.List;

public class App {
     public static void main(String[] args) {
          
          List<Integer> randomNumber = generateRandomNumer(10000, 1, 10000);

          DemoArrayList ar = new DemoArrayList();
          ar.testArrayList(randomNumber);

          DemoSimpleList sl = new DemoSimpleList();
          sl.testSimpleList(randomNumber);;

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
