import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberPeople;

        System.out.print("Приветствую пользователь!" + "\n" + "На сколько человек разделить счёт?");

        while (true) {
            if (scanner.hasNextInt()){
                numberPeople = scanner.nextInt();
                if (numberPeople > 1) {
                    System.out.println("\nЗамечательно, колличество гостей - " + numberPeople + "!\n" + "А теперь займёмся вашим меню!\n");
                    break;
                }
            } else
                scanner.next();
            System.out.println("Значение некорректное.\n" + "Нельзя вводить спец символы или буквы.");
            System.out.println("Колличество гостей не может быть равно 1 или 0, а так же не может быть отрицательным.\n");
        }
        DivisionCheck.divCheck(numberPeople);
    }
}