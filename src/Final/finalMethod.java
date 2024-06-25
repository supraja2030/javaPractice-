package Final;

public class finalMethod {
    final int display(){
        int a = 10;
        return a;
    }

    public static void main(String[] args) {
        finalMethod x =new finalMethod();
        int z = x.display();
        System.out.println(z);

    }
}
