import java.util.Scanner;

public class Program1 {
    public static void main(String args[])

    {
        Scanner obj = new Scanner(System.in);
        int i = obj.nextInt();
        int j = obj.nextInt();
        int k = i / j;

        try {
            System.out.println(k);
        } catch (ArithmeticException ae) {
            System.out.println(ae);
        }
    }
}
