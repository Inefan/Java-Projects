package App;

import java.util.Scanner;

public class java2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Введіть перше число: ");
        int user1 = scan.nextInt();

        System.out.print("Введіть друге число: ");
        int user2 = scan.nextInt();

        System.out.print("Введіть операцію (+, -, *, /): ");
        char user3 = scan.next().charAt(0);

        int res;

        switch (user3) {
            case '*':
                res = user1 * user2;
                System.out.println("Результат: " + res);
                break;
            case '+':
                res = user1 + user2;
                System.out.println("Результат: " + res);
                break;
            case '/':
                if (user2 != 0) {
                    res = user1 / user2;
                    System.out.println("Результат: " + res);
                } else {
                    System.out.println("Помилка: ділення на нуль!");
                }
                break;
            case '-':
                res = user1 - user2;
                System.out.println("Результат: " + res);
                break;
            default:
                System.out.println("Помилка: невідома операція!");
        }

        scan.close();
    }
}
