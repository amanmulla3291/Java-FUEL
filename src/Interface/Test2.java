package Interface;

public class Test2 extends Test implements HDFCBank,ReserveBank {

    @Override
    public void Withdraw() {
        System.out.println("Withdrawing the amount...");
    }

    @Override
    public void Deposit() {
        System.out.println("Deposit the amount");
    }

    public static void main(String[] args) {
        Test2 T2 = new Test2();
        T2.Deposit();
        T2.Withdraw();
    }
}
