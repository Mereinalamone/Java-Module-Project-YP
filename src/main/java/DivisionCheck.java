import java.util.ArrayList;
import java.util.Scanner;

public class DivisionCheck {
    public static String rub (float sum) {
        if (sum % 10 == 1 && sum % 100 != 11) {
            return "рубль";
        } else if ((sum % 10 == 2 || sum % 10 == 3 || sum % 10 == 4)&& sum % 100 != 12 && sum % 100 != 13 && sum % 100 != 14) {
            return "рубля";
        } else {
            return "рублей";
        }
    }

    public static void divCheck (int numberPeople) {

        int i = 0;
        String name;
        float price;
        float sum = 0;
        ArrayList<Product> productList = new ArrayList<>();

        while (true) {
            i = i + 1;
            while(true) {
                try{
                    System.out.printf("Введите название товара №%d: ", i);
                    Scanner scanner = new Scanner(System.in);
                    name = scanner.next();
                    break;
                }
                catch(Exception e) {
                    System.out.println("Ошибка ввода. Возможно введены недопустимые символы.");
                }
            }
            while(true) {
                try{
                    System.out.printf("Введите цену товара №%d: ", i);
                    Scanner scanner = new Scanner(System.in);
                    price = scanner.nextFloat();
                    if (price > 0) {
                        break;
                    }
                    else {System.out.println("Ошибка ввода. Цена не может быть отрицательной или нулевой.");}
                }
                catch(Exception e) {
                    System.out.println("Ошибка ввода. Необходимо ввести число.");
                }
            }
            productList.add(new Product(name, price));
            sum = sum + price;
            System.out.println("Товар добавлен в список. Продолжаем? ");
            System.out.println("Для продолжения введите любой символ, для завершения введите \"завершить\".");
            Scanner scanner = new Scanner(System.in);
            String reply = scanner.next();
            if (reply.equalsIgnoreCase("завершить"))
            {break;}
        }
        System.out.println("Список добавленных товаров");
        System.out.println("|Наименование товара |Стоимость |");
        for (i = 0; i < productList.size(); i = i + 1) {
            System.out.println("|" + String.format("%-20s", productList.get(i).name) + "|" + String.format("%-10.2f", productList.get(i).price) + "|");
        }
        System.out.printf("Итоговая сумма: %.2f %s\t\n", sum, rub(sum));
        System.out.printf("Количество гостей: %d\t\t\n", numberPeople);
        System.out.printf("Итого на человека: %.2f %s\t\t\n", sum / numberPeople, rub(sum / numberPeople));
    }
}

class Product {
    String name;
    float price;
    Product (String name, float price) {
        this.name = name;
        this.price = price;
    }
}