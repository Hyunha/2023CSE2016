package banking;

public class MortgagePaymentCalculator {
    private BankAccountSpecification bank_account;

    /** Constructor
     * @param account 사용 계좌
     */
    public MortgagePaymentCalculator(BankAccountSpecification account) {
        bank_account = account;
    }

    public void makeMortgagePayment(int amount) {
        if (bank_account.withdraw(amount))
            System.out.println(amount + "원 지불");
        else
            System.out.println("잔고 부족");
    }
}
