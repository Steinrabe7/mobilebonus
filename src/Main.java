// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        int amount = 300;
        int deposit = 1500;


        if (deposit >= 1000) {
            System.out.println("Достаточная сумма для начисления бонусов");

        } else {
            System.out.println("Недостаточная сумма для начисления бонусов");
        }

        int bonus;


        if (deposit >= 1000) {
            bonus = deposit / 100;

        } else {
            bonus = 0;
        }

        int summaryTotal = bonus + amount;

        System.out.println("Итоговая сумма на счете:" + summaryTotal);




    }
}