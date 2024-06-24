package loops;

public class tableUsingWhile {
    int number;
    tableUsingWhile(int num){
        number = num;
    }
    void printTable(){
        int i = 1;
        while(i <= 10){
            System.out.println(number + "*" + i + "=" + (number*i));
            i++;
        }
    }

    public static void main(String[] args) {
        tableUsingWhile table = new tableUsingWhile(2);
        table.printTable();
    }
}
