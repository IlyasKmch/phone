import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int onTheAccount = 342;
        int bonusScale = 100;
        int replenisment = 3546;
        int bonus;

        if (replenisment > 1000) {
            bonus = replenisment / bonusScale;
        } else {
            bonus = 0;
        }

        int totalAccount = onTheAccount + replenisment + bonus;
        System.out.println("Вы пополнили счет на " + replenisment + "руб.");
        System.out.println("Ваш бонус составил " + bonus + "руб.");
        System.out.println("Ваш баланс " + totalAccount + "руб.");

    }
}
