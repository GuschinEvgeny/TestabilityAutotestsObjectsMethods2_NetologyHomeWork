public class Main {
    public static void main(String[] args) {
        BmiService service= new BmiService();
        double m = 1.80 ;
        double kg = 95 ;
        int bmi = service.calculate( m , kg);
        System.out.println("Ваш индекс массы тела");
        System.out.println("равен " + bmi);
    }
}