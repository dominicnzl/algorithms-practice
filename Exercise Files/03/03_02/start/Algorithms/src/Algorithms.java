import java.util.LinkedList;

public class Algorithms {

    public static void main(String[] args) {

        var list = new LinkedList<>();
        list.add("Sally");
        list.add("Becky");
        list.add("Nicke");
        list.add("Jack");
        list.add("Rachel");

        System.out.println(list);
        System.out.println(list.contains("Becky"));
        System.out.println(list.size());
        list.removeFirst();
        System.out.println(list);
    }
}
