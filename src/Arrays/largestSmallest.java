package Arrays;

public class largestSmallest {
    public static void main(String[] args) {
        int[] numbers = {40, 60, 44, 82, 12, 26, 100};
        int largest = numbers[0];
        int smallest = numbers[0];
        for (int number : numbers) {
            if (largest > number) {
                largest = number;
            } else if (smallest < number) {
                smallest = number;
            }
        }
    }


}
