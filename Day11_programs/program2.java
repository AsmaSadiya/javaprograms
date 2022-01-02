import java.util.*;

public class Program2 {
    public static void main(String args[]) {

        int[] arr = { 20, 30, 40, 50 };
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        try {
            for (int i = 0; i <= arr[4]; i++) {
                System.out.println(i);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index out of bound");
        }
        System.out.println("program end");
    }

}
