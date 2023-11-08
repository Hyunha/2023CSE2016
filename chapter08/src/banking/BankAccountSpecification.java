package banking;

public interface BankAccountSpecification {
    /** deposit 입금
     * @param amount 입금액 (0 이상의 정수)
     */
    public void deposit(int amount);

    /** withdraw 출금 (잔고가 충분하면)
     * @param amount 출금액 (0 이상의 정수)
     * @return true 출금 성공, false 출금 실패
     */
    public boolean withdraw(int amount);
}
