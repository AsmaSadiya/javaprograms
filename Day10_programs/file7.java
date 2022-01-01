//program to print string to uppercase
public class File7 {
    public static void main(String args[]) {
        String str = "this is a coding";
        String user = str.toUpperCase();
        System.out.println(user);
        String s = str.toUpperCase().substring(0, 4) + str.substring(5, 16);
        System.out.println(s);
    }

}
