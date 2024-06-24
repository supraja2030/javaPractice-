package memoryAllocation;

public class memory {
    int number;
    memory(int number){
        this.number = number;
    }
    void display(){
        int number= 10;
        System.out.println("Local variable:"+ number);
    }
    public static void main(String[] args) {
        memory Memory = new memory(20);
        Memory.display();
        System.out.println("Instance variable: " + Memory.number);



    }
}
