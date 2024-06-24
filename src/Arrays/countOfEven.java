package Arrays;

public class countOfEven {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        int evenCount = 0;
        for(int i=1; i <= numbers.length; i++){
            if(i  % 2 ==0){
                evenCount++;
            }
        }
        System.out.println("count of even numbers :" + evenCount);

    }
}
