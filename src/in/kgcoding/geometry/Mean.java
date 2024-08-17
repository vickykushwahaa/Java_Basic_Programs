package in.kgcoding.geometry;

public class Mean {
    private int[] numbers;

    public void hello(int [] numbers){
        this.numbers=numbers;
    }
    public class Statistics{
        double mean() {
            double sum = 0;
            for (int number : numbers) {
                sum += number;
            }
            return sum / numbers.length;
        }
    }
}
