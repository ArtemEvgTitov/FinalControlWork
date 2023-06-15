package Console;

import java.util.Scanner;

/**
 * Класс запроса ввода от пользователя
 */
public class GetValue implements IGetValue {

    Scanner in = new Scanner(System.in);

    @Override
    /**
     * Метод запроса ввода от пользователя
     */
    public String getValue(String msg) {
        System.out.print("Введите " + msg + ": ");
        return in.nextLine();
    }

}
