package Static;

public class staticBlock {
    static int number;
    static{
        int number = 10;
    }

    public static void main(String[] args) {
        System.out.println(number);
    }
}
