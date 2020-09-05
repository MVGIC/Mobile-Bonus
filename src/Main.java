public class Main {
    public static void main(String[] args) {

        long InitialBalance = 100;
        long DepositBalance = 600;
        long Bonus;
        long Limit = 1000;


        if (DepositBalance <= Limit) {
            Bonus = 0;
        } else {
            Bonus = DepositBalance / 100;
        }

        System.out.println(Bonus);
    }
}
