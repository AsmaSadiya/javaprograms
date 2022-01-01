//program to join the string
public class File12_1 {
    public static void main(String args[]) {
        String set = "asma:ayesha";
        String get = "123/222*";
        System.out.println(set.join(":", "asma", "ayesha"));
        System.out.println(get.join("/", "123", "222*"));

    }

}
