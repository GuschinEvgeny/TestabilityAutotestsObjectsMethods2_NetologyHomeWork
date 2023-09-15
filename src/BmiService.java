public class BmiService {
    public int calculate ( double m , double kg) {
        double i = kg / ( m * m ) ;
        int index = (int) i ;
        return index;
    }
}