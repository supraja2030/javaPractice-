package String;

import java.util.StringTokenizer;

public class tokenization {
    public static void token(String str){
        StringTokenizer x = new StringTokenizer(str, ",");
        System.out.println("Tokens using string tokenization");
        while (x.hasMoreTokens()){
            System.out.println(x.nextToken());
        }

    }
    public static void main(String[] args) {
        String str = "My name is Supraja";
        tokenization.token(str);
    }
}
