import java.util.*;

import java.util.Scanner;

public class Program4 {

    public static void main(String args[]) {
        Scanner string = new Scanner(System.in);
        String str = "good";
        String input = null;
        try {
            System.out.println(str.length());
            System.out.println(input.length());
        } catch (NullPointerException ne) {
            System.out.println("exception handled");

        }

    }
}
