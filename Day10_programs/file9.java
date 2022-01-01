//program to compare two strings 
import java.util.Scanner;

public class File9 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String[] str = { "35", "39", "32", "37" };
        String[] grades = { "35", "39", "32", "35" };
        for (int i = 0; i <= n; i++) {
            if (grades[i].equals(str[i])) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }

    }
}
