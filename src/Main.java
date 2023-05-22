// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        int amount = 1000;
        int deposit = 1500;




        int bonus;


        if (deposit >= 1000) {
            bonus = deposit / 100;

        } else {
            bonus = 0;
        }

        int summaryTotal = bonus + amount + deposit;

        System.out.println("Итоговая сумма на счете:" + summaryTotal);




    }
}