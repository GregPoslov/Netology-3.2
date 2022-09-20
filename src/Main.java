public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float coutingBmi = service.calculate();
        System.out.printf("Ваш ИМТ = %.1f", coutingBmi);
    }
}