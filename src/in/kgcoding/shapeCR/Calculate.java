package in.kgcoding.shapeCR;

public class Calculate {
    public static void main(String[] args) {
        Circle circle=new Circle(14);
        Square squre=new Square(7);
        System.out.printf("Area of Circle: %5.3f\n",circle.calculateArea());
        System.out.printf("Area of Square: %f5.3\n",squre.calculateArea());
    }
}
