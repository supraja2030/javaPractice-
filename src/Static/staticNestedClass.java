package Static;

public class staticNestedClass {
    static int number;

    static class nested{
        static int display() {
            int number = 10;
            return number;
        }
    }
    public static void main(String[] args) {
        int result = staticNestedClass.nested.display();
        System.out.println(result);
    }
}
