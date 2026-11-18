public class Main {
    public static void main(String[] args) {
        int currentAccount = 100;
        int topUp = 1500;
        int bonus;

        if (topUp > 1_000) {
            bonus = topUp / 100;
        } else {
            bonus = 0;
        }

        int total = currentAccount + topUp + bonus;
        System.out.println("Итоговый счет: " + total + ", бонусные рубли: " + bonus);
    }
}
