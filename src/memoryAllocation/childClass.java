package memoryAllocation;

public class childClass extends parentClass {
    int childNumber;
    childClass(int parentNumber, int childNumber){
        super(parentNumber);
        this.childNumber = childNumber;
    }
    void displayChild(){
        int localNumber = 100;
        System.out.println("Local variable :" + localNumber );
    }

    public static void main(String[] args) {
        childClass memory = new childClass(10,20);
        System.out.println("child number :" + memory.childNumber);
        System.out.println("parent number :" + memory.parentNumber);
        memory.displayParent();
        memory.displayChild();
    }
}
