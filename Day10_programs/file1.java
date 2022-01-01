//program to reverse a string
import java.util.Scanner;

public class File1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuffer str = new StringBuffer(s);
        str.reverse();
        System.out.println(str);
    }
}
