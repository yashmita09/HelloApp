import java.util.ArrayList;
import java.util.List;

public class HelloApp {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        // Add all command-line arguments to list
        for (String arg : args) {
            names.add(arg);
        }

        String message;

        if (names.size() > 0) {
            message = String.join(", ", names);
        } else {
            message = "World";
        }

        System.out.println("Hello, " + message + "!");
    }
}