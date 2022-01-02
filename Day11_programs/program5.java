import java.util.*;

public class Program5 {
    public static void main(String args[])
    {
    try {
            String str = "java";
            int n = Integer.parseInt(str);

        }
         catch (NumberFormatException se) 
        {
            System.out.println(se);
            System.out.println("wrong access");
        }
        System.out.println("end of the program");
    }
}
