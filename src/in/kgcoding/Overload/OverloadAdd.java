package in.kgcoding.Overload;

public class OverloadAdd{

    public int add(int x, int y) {
        return x+y;
    }

    public int add(int x, int y, int z){
        return x+y+z;
    }
    public double add(double x,double y) {
        return x + y;
    }

    public static void main(String[] args) {
        OverloadAdd overload=new OverloadAdd();
        System.out.println(overload.add(8,5));
        System.out.println(overload.add(8,33,54));
        System.out.println(overload.add(5.4,6.5));
    }
}
