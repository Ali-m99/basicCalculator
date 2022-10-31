import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Enter value x: ");
            double x = sc.nextDouble();
            sc.nextLine();

            System.out.println("Enter the operation you want to perform: ");
            String operation = sc.nextLine();
            
            System.out.println("Enter value y: ");
            double y = sc.nextDouble();

            double result;

            if (operation.equals("+")) {
                result = x + y;
                System.out.println(result);
            } else if (operation.equals("-")) {
                result = x - y;
                System.out.println(result);
            } else if (operation.equals("*")) {
                result = x * y;
                System.out.println(result);
            } else if (operation.equals("/")) {
                result = x / y;
                System.out.println(result);
            } else {
                System.out.println("Invalid Operation");
            }
        }
    }
}
