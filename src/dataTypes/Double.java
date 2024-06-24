package dataTypes;

public class Double {
    public double number(){
        double a = 10.001;
        return a;
    }

    public static void main(String[] args) {
        Double obj = new Double();
        double x = obj.number();
        System.out.println(x);
    }
}
