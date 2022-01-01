//program to print character at position
import java.util.Scanner;

public class File6 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = "this is a program";
        System.out.println(str.charAt(4));
        System.out.println(str.charAt(10));
        if (str.charAt(4) == 'i') {
            System.out.println("it is true");
        } else {
            System.out.println("it considers space");
        }

    }

}
