import java.util.ArrayList;

public class ArrayListMain {
    public static void main(String[] args) {
        ArrayList<String> lolipops = new ArrayList<>();

        lolipops.add("red");
        lolipops.add("green");
        lolipops.add("blue");
        lolipops.add("white");

        System.out.println("Lolipops at market A: ");
        for(int i = 0; i < lolipops.size(); i++){
            System.out.println(lolipops.get(i));
        }

        System.out.println("Lolipops at market B: ");
        int j = 0;
        while(j < lolipops.size()){
            System.out.println(lolipops.get(j));
            j++;
        }
    }
}