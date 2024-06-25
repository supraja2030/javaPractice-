package dataTypes;

public class Boolean { // Renamed to avoid conflict with built-in Boolean class
    public boolean boo() { // Corrected the method declaration
        boolean x = true;
        return x;
    }

    public static void main(String[] args) {
        Boolean obj = new Boolean();
        boolean y = obj.boo();
        System.out.println(y);
    }
}
