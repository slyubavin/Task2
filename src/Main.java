public class Main {
    public static void main(String[] args) {
        int currentBalance = 100; // Начальная сумма на счету

        int topUpAmount = 1001; // Сумма пополнения

        int bonus; // Рассчитываем бонус
        if (topUpAmount > 1000) {
            bonus = topUpAmount / 100;
        } else {
            bonus = 0;
        }

        int finalBalance = currentBalance + topUpAmount + bonus; // Рассчитываем итоговую сумму на счету

        // Выводим результат
        System.out.println("Бонусные рубли: " + bonus + " рублей");
        System.out.println("Итоговая сумма на счету: " + finalBalance + " рублей");
    }
}