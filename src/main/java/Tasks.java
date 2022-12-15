import java.util.Scanner;

public class Tasks {

    private final Scanner scan;

    public Tasks(Scanner scanner) {
        this.scan = scanner;
    }

    public void task1() {
        System.out.println("Введите число:");
        String line = scan.nextLine();
        int number = Integer.parseInt(line);
        if (number > 7) {
            System.out.println("Привет");
        }
    }

    public void task2() {
        System.out.println("Введите имя:");
        String name = scan.nextLine();
        if (name.equals("Вячеслав")) {
            System.out.println("Привет, Вячеслав");
        }
    }

    public void task3() {
        System.out.println("введите набор цифр разделенные пробелом");
        String[] numbers = scan.nextLine().split(" ");
        for (String i : numbers) {
            int number = Integer.parseInt(i);
            if (number % 3 == 0) {
                System.out.println(number);
            }
        }
    }

}