package freqAskedPrograms;

import java.util.Scanner;
import java.util.Arrays;


public class anagramNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first string");
        String firstString = scanner.nextLine();
        System.out.println("Enter the second string");
        String secondString = scanner.nextLine();
        anagramNumber(firstString, secondString);

    }
    public static void anagramNumber(String str1, String str2){
        str1 = str1.replaceAll("\\s", "");
        str2 = str2.replaceAll("\\s", "");

        if(str1.length()!= str2.length()){
            System.out.println("we cannot do anagram operation");
            return;
        }
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        if(Arrays.equals(charArray1, charArray2)){
            System.out.println("the strings are anagram");
        }
        else{
            System.out.println("the strings are not anagram");
        }
    }
}
