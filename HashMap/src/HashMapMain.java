import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapMain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Text: ");
        String text = s.nextLine();

        Map<String, Integer> wordCount = new HashMap<>();

        String[] words = text.split(" ");

        for(int i = 0; i < words.length; i++){
            String word = words[i].toLowerCase();
            if(wordCount.containsKey(word)){
                wordCount.put(word, wordCount.get(word) + 1);
            } else{
                wordCount.put(word, 1);
            }
        }
        System.out.println("Count: " + wordCount);
    }
}
