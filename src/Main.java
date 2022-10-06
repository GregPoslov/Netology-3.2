import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        Scanner bw = new Scanner(System.in); //Сканер массы тела
        System.out.println("Масса тела в кг:");
        int bodyWeight = bw.nextInt(); // Масса тела
        Scanner g = new Scanner(System.in); //Сканер роста
        System.out.println("Рост в см:");
        float growth = g.nextInt(); // Рост
        float coutingBmi = service.calculate(bodyWeight, growth);
        System.out.printf("Ваш ИМТ = %.1f", coutingBmi);
    }
}