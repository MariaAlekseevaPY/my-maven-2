public class Main {
    public static void main(String[] args) {
        int currentAccount = 100;
        int topUp = 1500;
        int bonus = topUp / 100;
        int totalNoBonus = currentAccount + topUp;
        int totalWithBonus = currentAccount + topUp + bonus;

        if (topUp >= 1_000) {
            System.out.println("Итоговый счет: " + totalWithBonus + ", бонусные рубли: " + bonus);
        } else {
            System.out.println("Итоговый счет: " + totalNoBonus + ", бонусные рубли: " + bonus);
        }
    }
}
