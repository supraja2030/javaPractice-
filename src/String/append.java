package String;

public class append {
    public static void main(String[] args) {
        StringBuilder str1 = new StringBuilder("Hello World!");
        str1.append("- appended string");
        str1.append('-');
        str1.append(120);
        str1.append('-');
        str1.append('a');
        str1.append('-');
        str1.append(true);
        str1.append('-');
        str1.append(48.67);
        System.out.println(str1);


        StringBuffer str2 = new StringBuffer("Hello Supraja");
        str2.append("- appended string");
        str2.append("-");
        str2.append(140);
        str2.append("-");
        str2.append(26.7);
        str2.append("-");
        str2.append(false);
        str2.append("-");
        str2.append('b');
        System.out.println(str2);

    }

}
