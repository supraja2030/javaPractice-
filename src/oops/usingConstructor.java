package oops;

public class usingConstructor {
    int length;
    int breadth;
    usingConstructor(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }
    int area(){
        int area1 = length*breadth;
        return area1;
    }
    int perimeter(){
        int perimeter1 = 2*(length+breadth);
        return perimeter1;
    }

    public static void main(String[] args) {
        usingConstructor x = new usingConstructor(10,35);
        int area1 = x.area();
        int perimeter1 = x.perimeter();
        System.out.println(area1);
        System.out.println(perimeter1);

    }
}
