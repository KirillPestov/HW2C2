public class Main {
    public static void main(String[] args) {
        int amount = 100;
        int placed = 1030;
        int x = 100;

        int bonus;
        int bonusAmount;
        if (placed >= 1000) {
            bonus = placed / x;
            bonusAmount = bonus + amount + placed;
        } else {
            bonus = 0;
            bonusAmount = amount + placed;
        }

        System.out.println("Итоговая сумма");

        System.out.println(bonusAmount);

        System.out.println("Начисленно бонусов");

        System.out.println(bonus);

    }
}