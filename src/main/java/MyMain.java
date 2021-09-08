import java.util.Scanner;

public class MyMain {

    // Calculates the median of the three inputs
    public static int median(int a, int b, int c) {
        int max_num = Math.max(Math.max(a,b), c);
        int min_num = Math.min(Math.min(a,b), c);
        int median_num = a + b + c - max_num - min_num;
        return median_num;

    }

    // Returns the input with the larger absolute value
    public static int magnitude(int a, int b) {
        if (Math.abs(a) > Math.abs(b)) {
            return a;
        }
        else{
            return b;
        }
    }

    // Returns the "c" value from the Pythagorean theorem "a^2 + b^2 = c^2",
    // where "a" and "b" are the inputs to the method
    public static double pythagoras(int a, int b) {
        int squares = (a*a) + (b*b);
        double c = Math.sqrt(squares);
        return c;
    }

    public static void main(String[] args) {
        // You may want to keep these lines of code to test that your methods work
        System.out.println(median(1, 2, 3)); // should be 2
        System.out.println(magnitude(-7, -1)); // should be -7
        System.out.println(pythagoras(3, 4)); // should be 5.0

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter which method you would like to use ");
        String method_checker = scan.nextLine();
        String median = "median";
        String magnitude = "magnitude";
        String pythagoras = "pythagoras";
        if (method_checker.equals(median)){
            Scanner num1 = new Scanner(System.in);
            System.out.println("Enter the first number: ");
            int a_num = scan.nextInt();
            Scanner num2 = new Scanner(System.in);
            System.out.println("Enter the second numner: ");
            int b_num = scan.nextInt();
            Scanner num3 = new Scanner(System.in);
            System.out.println("Enter the third number: ");
            int c_num = scan.nextInt();
            System.out.println(median(a_num,b_num,c_num));

        }
        if (method_checker.equals(magnitude)){
            Scanner num1 = new Scanner(System.in);
            System.out.println("Enter the first number: ");
            int a_num = scan.nextInt();
            Scanner num2 = new Scanner(System.in);
            System.out.println("Enter the second numner: ");
            int b_num = scan.nextInt();
            System.out.println(magnitude(a_num, b_num));
        }
        if (method_checker.equals(pythagoras)){
            Scanner num1 = new Scanner(System.in);
            System.out.println("Enter the first number: ");
            int a_num = scan.nextInt();
            Scanner num2 = new Scanner(System.in);
            System.out.println("Enter the second numner: ");
            int b_num = scan.nextInt();
            System.out.println(pythagoras(a_num,b_num));
        }

    }
}
