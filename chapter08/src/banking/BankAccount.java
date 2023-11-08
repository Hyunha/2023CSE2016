package banking;

public class BankAccount implements BankAccountSpecification {

    private int balance;

    public BankAccount() {
        balance = 0;
    }
    /**
     * deposit 입금
     *
     * @param amount 입금액 (0 이상의 정수)
     */
    public void deposit(int amount) {
        balance += amount;
    }

    /**
     * withdraw 출금 (잔고가 충분하면)
     *
     * @param amount 출금액 (0 이상의 정수)
     * @return true 출금 성공, false 출금 실패
     */
    public boolean withdraw(int amount) {
        if (amount <= balance) {
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }
}
