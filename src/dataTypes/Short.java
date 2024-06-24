package dataTypes;

public class Short {
    public short number(){
        short x = 7899;
        return x;
    }

    public static void main(String[] args) {
        Short obj = new Short();
        short y = obj.number();
        System.out.println(y);

    }
}
