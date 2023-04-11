public class Check {
    public static void main(String[] args) {
        LoanService countService = new LoanService();
        double number = (countService.calculate(1_000_000, 12, 9.99));
        System.out.printf("Ежемесячный платеж составляет %.2f руб.", number);
    }
}
