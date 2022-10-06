public class BmiService {
    public float calculate(float bodyWeight, double growth) {
        float bmi = (float) (bodyWeight / ((growth * growth) / 10000));
        return bmi;
    }
}