public class Main {
    public static void main(String[] args) {
        BmiService bmiService = new BmiService();
        double height = 1.87; // метры
        double weight = 98; // кг
        int bmi = bmiService.calculate(height, weight);
        System.out.println("Ваш индекс массы тела: " + bmi);
    }
}
