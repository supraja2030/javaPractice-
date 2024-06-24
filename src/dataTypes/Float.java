package dataTypes;

public class Float {
    public float number(){
        float x = 10.9832737f;
        return x;
    }

    public static void main(String[] args) {
        Float obj = new Float();
        float y = obj.number();
        System.out.println(y);
    }
}
