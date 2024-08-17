package in.gettersetter;

public class Car {
    public String color;
    private String model;
    private double fuellevel;
    private long costOfCar;

    public Car (String model,String color) {
        this.model = model;
        this.color=color;
    }
    public String getColor(){return color;};
}


  /*  String getColor(){
        return color;
    }
    public String getModel(){
        return model;
    }
}*/
