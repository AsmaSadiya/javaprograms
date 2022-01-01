//program to print equalsignorecase between two strings
public class File10_1 {
    public static void main(String args[]) {

        String first = "terminal";
        String second = "timeline";
        String third = "timeline";
        boolean check = first.equalsIgnoreCase(second);
        boolean condition = second.equalsIgnoreCase(third);
        System.out.println(check);
        System.out.println(condition);

    }
}
