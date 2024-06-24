package swap;

public class swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("The value of a before swapping " + a);
        System.out.println("The value of b before swapping " + b);
        int temp = 0;
        temp  = a;
        a = b;
        b = temp;
        System.out.println("The value of a after swapping " + a);
        System.out.println("The value of a after swapping " + b);


    }
}
