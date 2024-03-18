import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        System.out.print("X: ");
        double x = s.nextDouble();
        System.out.print("Y: ");
        double y = s.nextDouble();
        System.out.print("Z: ");
        double z = s.nextDouble();

        System.out.print("Function: ");

        String operation = s.next().toUpperCase();
        double result;

        if(operation.equals("SUM")){
            result = x + y + z;
        }else if(operation.equals("AVARAGE")){
            result = (x + y + z) / 3;
        }else if(operation.equals("MIN")){
            result = Math.min(Math.min(x,y),z);
        }else if(operation.equals("MAX")){
            result = Math.max(Math.max(x,y),z);
        }else{
            System.out.println("Unsupported function");
            return;
        }

        System.out.printf("Result: %.4f\n",result);
    }
}