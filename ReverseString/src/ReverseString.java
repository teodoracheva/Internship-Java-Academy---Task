import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("String: ");
        String word = s.nextLine();

        System.out.println("Reversed string: ");
        for(int i = word.length(); i > 0; i--){
            System.out.print(word.charAt(i - 1));
        }
    }
}