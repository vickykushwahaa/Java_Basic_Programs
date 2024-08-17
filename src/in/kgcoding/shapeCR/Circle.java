package in.kgcoding.shapeCR;

public class Circle extends shape {

    private final double radius;

    public Circle(double radius) {
        this.radius=radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI*(Math.pow(radius,2));
    }
}
