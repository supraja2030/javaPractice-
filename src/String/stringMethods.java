package String;

public class stringMethods {
    public static void main(String[] args) {
        String str = "Hello World!, this is Supraja";

        System.out.println(str.length());
        System.out.println(str.charAt(8));
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.replace('t','T'));
        System.out.println(str.indexOf("this"));
        System.out.println(str.substring(5,8));

    }
}
