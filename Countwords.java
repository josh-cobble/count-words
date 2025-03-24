import java.io.*;
import java.util.*;
import java.util.HashMap;
import java.util.Map;

public class Countwords {
public static void main(String[] args) {
    Map<String, Integer> wordCount = new HashMap<>();

try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"))) {
    String forLine;
    while ((forLine = reader.readLine()) != null) {
        String word = forLine.trim().toLowerCase();

        int count = 1;
        for (int i = 0; i < 1; i++) {
            if(wordCount.containsKey(word)) {
                count = wordCount.get(word) + 1;
            }
        }
        wordCount.put(word, count);
    }
}

catch (IOException e) {
    System.out.println(e.getMessage());
}

try (BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {
    for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
        writer.write(entry.getKey() + " " + entry.getValue());
        writer.newLine();
    }
}
catch (IOException e) {
    System.out.println(e.getMessage());
}

}
}