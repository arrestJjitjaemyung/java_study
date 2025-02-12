package Chapter_10_AccessModifier;

public class BankAccessModifierMain {
    public static void main(String[] args) {
        BankAccessModifier account1 = new BankAccessModifier();
        BankAccessModifier account2 = new BankAccessModifier(12345678);
        BankAccessModifier account3 = new BankAccessModifier(23456789, "김삼");
        BankAccessModifier account4 = new BankAccessModifier(34567890, "김사", 100000);
        BankAccessModifier account5 = new BankAccessModifier(45678901, "김오", 200000, 1234);

        account1.setAccountNo(56789012);
        account1.setAccountHolder("깅일");
        account1.setBalance(10000000000L); // long int 명시
        account1.setPinNo(2345);

        account2.setAccountHolder("김이");
        account2.setBalance(2000);
        account2.setPinNo(3456);

        account3.setBalance(30000);
        account3.setPinNo(4567);

        account4.setPinNo(5678);

        account1.showAccountInfo();
        account2.showAccountInfo();
        account3.showAccountInfo();
        account4.showAccountInfo();
        account5.showAccountInfo();

        account1.withdraw(100000000000L, 2345);
    }
}
