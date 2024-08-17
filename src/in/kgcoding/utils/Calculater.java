package in.kgcoding.utils;
import in.kgcoding.geometry.Circle;
import in.kgcoding.geometry.Mean;
import in.kgcoding.geometry.Rectangle;
public class Calculater {
    public static void main(String[] args) {
        Circle cir=new Circle(5.5);
        Rectangle rec=new Rectangle(7,8);
        double Cirresult=Math.PI*Math.pow(cir.radius,2);
        double Recresult=rec.length*rec.breadth;
        System.out.printf("Radius of circle is: %f," +
                "Area of rectangle is: %f",Cirresult,Recresult);
        Mean mean=new Mean();
        System.out.println(mean);
     }
}
