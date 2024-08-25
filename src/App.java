import co.edu.uptc.models.SimpleList;

public class App {
     public static void main(String[] args) {
        SimpleList sm = new SimpleList();
        sm.add("hi");
        sm.add("hi2");
        sm.add("hi3");
        sm.addToTop("hi4");

        sm.addAfterNode("hi2", "hi5");

        sm.showList();
     }
}
