package String;

public class bufferMethods {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("Hello");

        str.append(" World");
        System.out.println(str);

        str.insert(6,"java");
        System.out.println(str);

        str.replace(6,9,"abc");
        System.out.println(str);

        str.delete(6,10);
        System.out.println(str);

        str.deleteCharAt(5);
        System.out.println(str);

        str.reverse();
        System.out.println(str);

        str.setCharAt(2,'h');
        System.out.println(str);

        str.length();
        System.out.println(str);

        str.setLength(8);
        System.out.println(str);

        System.out.println(str.charAt(7));

        System.out.println(str.capacity());

        str.ensureCapacity(50);
        System.out.println(str);




    }
}
