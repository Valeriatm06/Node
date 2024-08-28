import co.edu.uptc.models.SimpleList;

public class App {
     public static void main(String[] args) {
      SimpleList sm = new SimpleList();
      long start = System.nanoTime();
      for(int i = 0; i < 29000000; i++){
       sm.addEnd("a");
      }
      long end = System.nanoTime();
      System.out.println("tiempo: " + (end-start));
      //   sm.add("hi");
      //   sm.add("hi2");
      //   sm.add("hi3");
      //   sm.addToTop("hi4");

      //   sm.addAfterNode("hi2", "hi5");

      //   sm.showList();
     }
}
