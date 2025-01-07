import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Hanish");
        names.add("Shreeya");
        names.add("Shreeya");
        names.add("Reeva");

        for (String name : names) {
            System.out.println(name);
        }
    }
}
