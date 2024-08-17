package in.kgcoding.shapeCR;

public class Square extends shape {
    private  double side;
    public Square(double side) {
        this.side = side;
    }
    @Override
    public double calculateArea(){
        return Math.pow(side,2);
    }

}
