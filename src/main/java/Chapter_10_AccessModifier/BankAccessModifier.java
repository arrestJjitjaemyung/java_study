package Chapter_10_AccessModifier;
/*
    접근 지정자(Access Modifier): class, method, field variable access 권한 제한에 사용됨.

    public: 모든 class에서 접근 가능
    protected: 같은 package 내 class 및 이 class를 상속받은 자식 class에서 접근 가능
    default (package-private): 지정자 명시하지 않으면 default 간주, 같은 package 내 class에서만 접근 가능
    private: 같은 class 내에서만 접근 가능

    Guideline
    public class BankAccessModifier

    field
        accountNo
        accountHolder
        balance
        pinNo

    constructor
        None
        accountNo
        accountNo, accountHolder
        accountNo, accountHolder, balance
        accountNo, accountHolder, balance, pinNo

    method
        Setter-getter
            Setter: 잔액은 음수 불가능, 비밀번호는 4자리 숫자만.
            deposit(int amount, int inputPin)
                유효한 금액 검증
                성공 시 콘솔에 "입금 성공, 현재 잔액: 0000원" 출력
                실패 시 "유효한 금액 입력" 출력
            withdraw(int amount, int inputPin)
                "
                "
                출금 후 잔액이 0 이상 검증
                성공 시 콘솔에 "출금 성공, 현재 잔액: 0000원" 출력
                실패 시 "계좌 잔액 확인 후 다시 시도" 출력

            showAccountInfo()
                return ...
 */
public class BankAccessModifier {
    private int accountNo, pinNo;
    private String accountHolder;
    private long balance;

    public BankAccessModifier() {
    }

    public BankAccessModifier(int accountNo) {
        this.accountNo = accountNo;
    }

    public BankAccessModifier(int accountNo, String accountHolder) {
        this.accountNo = accountNo;
        this.accountHolder = accountHolder;
    }

    public BankAccessModifier(int accountNo, String accountHolder, long balance) {
        this.accountNo = accountNo;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public BankAccessModifier(int accountNo, String accountHolder, long balance, int pinNo) {
        this.accountNo = accountNo;
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.pinNo = pinNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public void setBalance(long balance) {
        if (balance < 0) {
            System.out.println("이거 마이너스 통장 아니에요;;;");
            return;
        }
        this.balance = balance;
    }

    public void setPinNo(int pinNo) {
        if (pinNo < 0 || pinNo > 9999) {
            System.out.println("4자리 숫자 비밀번호를 입력하세요.");
            return;
        }
        this.pinNo = pinNo;
    }

    public void deposit(long amount) {
        if (amount <= 0) {
            System.out.println("0원 이하 입금은 불가합니다.");
            return;
        }
        this.balance += amount;
        System.out.println("입금 성공, 잔액: " + this.balance);
    }

    public void withdraw(long amount, int inputPin) {
        if (inputPin != this.pinNo) {
            System.out.println("비밀번호가 틀립니다. 다시 입력하세요.");
            return;
        }
        if (amount <= 0) {
            System.out.println("0원 이하 출금은 불가합니다.");
            return;
        }
        if (amount > this.balance) {
            System.out.println("잔액보다 많은 출금은 불가합니다.");
            return;
        }
        this.balance -= amount;
        System.out.println("출금 성공, 잔액: " + this.balance);
    }

    public void showAccountInfo() {
        System.out.println("예금주: " + this.accountHolder + "\n계좌번호: " + this.accountNo + "\n잔액: " + this.balance);
    }

    public int getAccountNo() {
        return accountNo;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public long getBalance() {
        return balance;
    }

    public int getPinNo() {
        return pinNo;
    }
}
