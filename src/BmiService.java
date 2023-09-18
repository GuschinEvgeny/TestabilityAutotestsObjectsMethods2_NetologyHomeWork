public class BmiService {
    public int calculate(double height, double weight) {
        double index = (weight / Math.pow(height, 2));
        int preBmi = (int) index;
        return preBmi;
    }
}