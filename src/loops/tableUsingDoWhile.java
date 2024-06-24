package loops;

public class tableUsingDoWhile {
    int number;
    tableUsingDoWhile(int num){
        number = num;
    }
    void printTable(){
        int i = 1;
        do{
            System.out.println(number + "*" + i + "=" + (number*i));
            i++;
        }while(i<=10);
    }

    public static void main(String[] args) {
        tableUsingDoWhile table = new tableUsingDoWhile(2);
        table.printTable();
    }
}
