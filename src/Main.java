public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double coutingBmi = service.calculate();
        System.out.format("Ваш ИМТ = " + coutingBmi);
    }
}