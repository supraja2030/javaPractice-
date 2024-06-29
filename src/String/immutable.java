package String;

public final class immutable {
    private final String name;
    public immutable(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public static void main(String[] args) {
        immutable change = new immutable("putty");
        String s  = change.getName();
        System.out.println(s);

    }
}
