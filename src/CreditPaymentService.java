public class CreditPaymentService {
    public double calculate (double creditAmount, double interestRate, int months){
        double monthlyRate = interestRate / 12 / 100;
        double a = Math.pow((1 + monthlyRate),months);
        double coefficient = monthlyRate * a / (a - 1);
        return coefficient * creditAmount;
    }
}