import java.util.ArrayList;
import java.util.List;

public class HelloApp {

    public static void main(String[] args) {
        List<String> names = getNames(args);
        String message = buildMessage(names);
        displayMessage(message);
    }

    // Method to collect names
    public static List<String> getNames(String[] args) {
        List<String> names = new ArrayList<>();

        for (String arg : args) {
            names.add(arg);
        }

        return names;
    }

    // Method to build message
    public static String buildMessage(List<String> names) {
        if (names.size() > 0) {
            return String.join(", ", names);
        } else {
            return "World";
        }
    }

    // Method to display output
    public static void displayMessage(String message) {
        System.out.println("Hello, " + message + "!");
    }
}