public class Main {
    //
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 10000;
        int miles = service.calculate(price);
        System.out.println(miles);
    }
}

// Мое предыдущее решение:
        // price - Сумма оплаченная за билет клиентом.
        // fixed - фиксированное число, 20 рублей
        // mili - количество миль начисленных клиенту
        // Если в результате деления 1 цифра после точки больше 5, то округляем в большую сторону, если меньше, то в меньшую.

        //double price = 4998;
       // int fixed = 20;
       // double mili;

        //if (price >= 20) {
        //    mili = (price / fixed);
        //} else {
       //     mili = 0;
        //}
       // System.out.println("Вам начислилось: " + (int)Math.round(mili) + "миль");
        //System.out.println("Спасибо за покупку!");


