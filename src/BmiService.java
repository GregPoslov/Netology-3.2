import java.util.Scanner;

public class BmiService {
    public double calculate() {
        Scanner bw = new Scanner(System.in); //Сканер массы тела
        System.out.println("Масса тела в кг:");
        int bodyWeight = bw.nextInt(); // Масса тела
        Scanner g = new Scanner(System.in); //Сканер роста
        System.out.println("Рост в см:");
        double growth = g.nextInt(); // Рост
        double bmi = bodyWeight / ((growth * growth) / 10000);
        return bmi;
    }
}
