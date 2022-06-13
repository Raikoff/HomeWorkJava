import java.util.Scanner;

// +Написать программу вычисления n-ого треугольного числа.

public class Task3 {

    public static void main(String[] args) {

        
        CheckIsDigit check = new CheckIsDigit();
        Scanner console = new Scanner(System.in); // строчка для подключения консольного ввода
        String name = console.nextLine();

        if (check.isDigit(name) == true) {
            System.out.println(triangle(Integer.parseInt(name)));
        } else {
            System.out.println("Введите целые числа");
        }
    }

    public static int triangle(int n) {

        if (n == 1)
            return 1;
        else
            return (n + triangle(n - 1));

    }
}
