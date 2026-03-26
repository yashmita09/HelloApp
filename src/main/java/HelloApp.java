import java.io.*;
import java.util.*;

public class HelloApp {

    static final String FILE_NAME = "names.txt";

    public static void main(String[] args) {

        List<String> names = loadNames();

        // Add new names from args
        for (String arg : args) {
            names.add(arg);
        }

        saveNames(names);

        String message = buildMessage(names);
        displayMessage(message);
    }

    // Load names from file
    public static List<String> loadNames() {
        List<String> names = new ArrayList<>();

        try {
            File file = new File(FILE_NAME);
            if (file.exists()) {
                Scanner sc = new Scanner(file);
                while (sc.hasNextLine()) {
                    names.add(sc.nextLine());
                }
                sc.close();
            }
        } catch (Exception e) {
            System.out.println("Error reading file");
        }

        return names;
    }

    // Save names to file
    public static void saveNames(List<String> names) {
        try {
            PrintWriter writer = new PrintWriter(FILE_NAME);
            for (String name : names) {
                writer.println(name);
            }
            writer.close();
        } catch (Exception e) {
            System.out.println("Error writing file");
        }
    }

    // Build message
    public static String buildMessage(List<String> names) {
        if (names.size() > 0) {
            return String.join(", ", names);
        } else {
            return "World";
        }
    }

    // Display output
    public static void displayMessage(String message) {
        System.out.println("Hello, " + message + "!");
    }
}