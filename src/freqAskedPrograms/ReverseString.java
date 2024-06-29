package freqAskedPrograms;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string");
        String inputString = scanner.nextLine();
        reversedString(inputString);

    }public static void reversedString(String str){
        StringBuffer stringbuffer = new StringBuffer(str);
        stringbuffer.reverse();
        System.out.println("The reversed string ");
        System.out.println(stringbuffer.toString());
    }
}
