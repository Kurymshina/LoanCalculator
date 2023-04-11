public class LoanService {

    public double calculate(double amount, double term, double interestRate) {
        return amount * (interestRate / 100 / 12 * Math.pow(interestRate / 100 / 12 + 1, term) / (Math.pow(interestRate / 100 / 12 + 1, term) - 1));
    }
}

