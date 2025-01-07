import java.util.HashMap;

public class Duplicate{
    public static void main(String[] args) {
        String str = "programming in java";

        
        printDuplicateCharacters(str);
    }

    public static void printDuplicateCharacters(String str) {
        
        str = str.toLowerCase();
        
        // Use a HashMap to store character frequencies
        HashMap<Character, Integer> charCountMap = new HashMap<>();
        
        // Traverse the string and count occurrences of each character
        for (char c : str.toCharArray()) {
            if (c != ' ') { // Ignore spaces
                charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
            }
        }

        // Print characters that appear more than once
        System.out.println("Duplicate characters:");
        for (HashMap.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " -> " + entry.getValue() + " times");
            }
        }
    }
}
