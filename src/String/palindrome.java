package String;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();
        palindrome(number);

    }
    public static void palindrome(int number){
        int originalNumber = number;
        int reverseNumber = 0;
        while(number!=0){
            int digit = number%10;
            reverseNumber = reverseNumber * 10 + digit;
            number = number/10;

        }
        if(reverseNumber == originalNumber){
            System.out.println(reverseNumber + " is a palindrome number");
        }else{
            System.out.println(reverseNumber + " is not a palindrome number");
        }
    }
}
