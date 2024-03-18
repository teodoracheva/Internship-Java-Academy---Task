import java.util.Scanner;

public class DuplicatedCharacters {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("String: ");
        String word = s.nextLine();

        System.out.println("Duplicated characters: ");
        char[] carray = word.toCharArray();
        for (int i = 0; i < word.length(); i++) {
            for (int j = i + 1; j < word.length(); j++) {
                if (carray[i] == carray[j]) {
                    System.out.print(carray[j] + " ");
                    break;
                }
            }
        }

    }
}