package bank;

/* 시동 클래스
 * 입력 포맷
 *   D 금액 - 입금
 *   W 금액 - 출금
 *   Q     - 종료
 * 출력
 *   거래 결과 */
public class AccountManager {
    public static void main(String[] args) {
        BankReader reader = new BankReader();
        BankAccount account = new BankAccount();
        BankWriter writer = new BankWriter("한양은행", account);
        AccountController controller = new AccountController(reader, writer, account);
        controller.processTransactions();
    }
}
