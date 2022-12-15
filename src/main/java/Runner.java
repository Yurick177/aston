import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tasks tasks = new Tasks(scanner);
        tasks.task1();
        tasks.task2();
        tasks.task3();
        scanner.close();
    }
//  Ответ на вопрос номер 4
//    "Нет" - необходимо поменять вторую круглую открывающеюся скобку на квадратную открывающеюся
}