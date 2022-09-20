import java.util.Scanner;

public class BmiService {
    public float calculate() {
        Scanner bw = new Scanner(System.in); //Сканер массы тела
        System.out.println("Масса тела в кг:");
        int bodyWeight = bw.nextInt(); // Масса тела
        Scanner g = new Scanner(System.in); //Сканер роста
        System.out.println("Рост в см:");
        double growth = g.nextInt(); // Рост
        float bmi = (float) (bodyWeight / ((growth * growth) / 10000));
        return bmi;
    }
}
