package Presenter.Exceptions;

/**
 * Класс обработки ошибок ввода
 */
public class ChoiseError extends Exception{

    @Override
    public String getMessage(){
        return "[CAUTION] Ошибка ввода";
    }
}
