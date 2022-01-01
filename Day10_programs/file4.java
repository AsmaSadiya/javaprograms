// progrma to compare strings
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String str1 = scan.nextLine();
        System.out.println(str.compareTo(str1));
        if (str1.equals(str)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}
