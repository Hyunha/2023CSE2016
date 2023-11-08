package database;

public class BankAccount implements Record {

    private int balance;
    private Key key;

    /** Constructor 계좌계설
     * @param initial_amount 개설 예금액
     * @param id 계좌의 키 */
    public BankAccount(int initial_amount, Key id) {
        balance = initial_amount;
        key = id;
    }

    /** deposit 입금
     * @param amount 입금액 (0이상의 정수) */
    public void deposit(int amount) {
        balance += amount;
    }

    /** withdraw 출금 (잔고가 충분하면)
     * @param amount 출금액 (0이상의 정수)
     * @return true 출금 성공, false 출금 실패 */
    public boolean withdraw(int amount) {
        if (amount <= balance) {
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }

    /** getBalance 잔액 리턴
     * @return 잔액 */
    public int getBalance() {
        return balance;
    }

    /** getKey 계좌 키 리턴
     * @return 키 */
    public Key getKey() {
        return key;
    }
}
