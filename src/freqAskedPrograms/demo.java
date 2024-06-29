public class demo {
    public static void main(String[] args) {
        // Creating a new String
        String str = "Hello, World!";

        // Attempting to modify the string
        String newStr = str.replace("World", "Java");

        // Original string remains unchanged
        System.out.println("Original String: " + str);
        System.out.println("Modified String: " + newStr);
    }
}
