package loops;

public class tableUsingFor {
    int number,i;
    tableUsingFor(int num){
        number = num;
    }
        void printTable(){
            for(i=1;i<=10;i++){
                System.out.println(number + "*" + i + "=" + (number*i));
        }
    }
    public static void main(String[] args) {
        tableUsingFor table = new tableUsingFor(2);
        table.printTable();


    }
}

