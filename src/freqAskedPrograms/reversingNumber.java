package freqAskedPrograms;

import java.util.Scanner;

public class reversingNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scanner.nextInt();
        reverse(number);
        }
        public static void reverse(int number){
        int reverse = 0;
        while(number!=0){
            int digit = number%10;
            reverse = reverse * 10 + digit;
            number = number/10;
        }
            System.out.println(reverse);

    }
}
