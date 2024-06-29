package freqAskedPrograms;

import java.util.Scanner;

public class palindromeString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string");
        String inputString = scanner.nextLine();
        String reverse = reversedString(inputString);
        System.out.println(reverse);

        if(inputString.equals(reverse)){
            System.out.println("this is the palindrome string");
        }
        else{
            System.out.println("this is not a palindrome string ");
        }

    }
    public static String reversedString(String str){
        StringBuffer x = new StringBuffer(str);
        x.reverse();
        return x.toString();

    }
}
