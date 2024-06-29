package oops;

public class areaOfRec {
    int length;
    int breadth;
    int area;

    public int  areaRec(int length, int breadth){
        int area = length*breadth;
        return area;
    }
    public int perimeter(int length, int breadth){
        int perimeter = 2*(length+breadth);
        return perimeter;
    }

    public static void main(String[] args) {
        areaOfRec x = new areaOfRec();
        int area = x.areaRec(12,20);
        int perimeter = x.perimeter(12,20);
        System.out.println(area);
        System.out.println(perimeter);
    }
}

