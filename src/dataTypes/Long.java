package dataTypes;

public class Long {
    public long number() {
        long x = 1875675769;
        return x;
    }

    public static void main(String[] args) {
        Long obj = new Long();
        long y =  obj.number();
        System.out.println(y);
    }
}
