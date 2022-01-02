import java.util.*;

public class Program3 {
    public static void main(String args[]) {
        String str = "java";
        System.out.println(str);
        try {
            System.out.println(str.charAt(6));

        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("At this positon index cannot be determined");
        }
    }

}
