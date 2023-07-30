import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Приветствую пользователь!");
        System.out.println("На скольких человек разделить счёт? ");
        int numberPeople;
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                numberPeople = scanner.nextInt();
                if (numberPeople > 1) {
                    System.out.println("Замечательно, колличество гостей - " + numberPeople + "!");
                    System.out.println("А теперь займёмся вашим меню!");
                    break;
                } else if (numberPeople == 1) {
                    System.out.println("Значение некорректное. В этом случае нет смысла ничего считать и делить.");
                } else {
                    System.out.println("Значение некорректное. В этом случае нет смысла ничего считать и делить.");
                }
            } catch (Exception e) {
                System.out.println("Значение некорректное. Необходимо ввести целое число.");
            }
        }
        DivisionCheck.divCheck(numberPeople);
    }
}