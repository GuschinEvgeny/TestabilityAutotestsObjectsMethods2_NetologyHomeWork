public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int bmi = service.calculate(1.87, 98);
        System.out.println("Ваш индекс массы тела");
        System.out.println("равен " + bmi);
    }
}