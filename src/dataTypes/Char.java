package dataTypes;

public class Char {
    public char letter(){
        char x = 'S';
        return x;
    }

    public static void main(String[] args) {
        Char obj = new Char();
        char y = obj.letter();
        System.out.println(y);

    }
}
