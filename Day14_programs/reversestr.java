import java.util.*;
import java.io.*;
public class Program8 {
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        String num=input.nextLine();
        StringBuilder str = new StringBuilder(num);
        str.reverse();
        System.out.println(str);
    }

    
}
