public class Main {
    public static void main(String[] args) {
        // Начальный баланс
        int balance = 100;
        // Сумма пополнения
        int amount = 1100;

        int bonus = 0;

        if (amount > 1000) {
            bonus = amount / 100;
        }

        // Итоговый расчет
        int finalBalance = balance + amount + bonus;

        // Результат
        System.out.println("Итоговый счет: " + finalBalance + " рублей");
        System.out.println("Бонусные рубли: " + bonus + " рублей");
    }
}