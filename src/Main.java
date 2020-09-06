public class Main {
    public static void main(String[] args) {

        long initialBalance = 100;
        long depositBalance = 1050;
        long bonus;
        long limit = 1000;


        if (depositBalance <= limit) {
            bonus = 0;
        } else {
            bonus = depositBalance / 100;
        }

        System.out.println(bonus);
    }
}
