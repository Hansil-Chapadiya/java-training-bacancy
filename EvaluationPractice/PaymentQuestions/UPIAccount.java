package EvaluationPractice.PaymentQuestions;

public class UPIAccount extends  Account implements Payment{

    @Override
    double calculateFee(int amount) {
        return amount * 0.10;
    }

    @Override
    public double pay(int amount) {
        balance -= amount + calculateFee(amount);
        return balance;
    }
}
