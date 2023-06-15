package Presenter.Exceptions;

public class ChoiseError extends Exception{
    @Override
    public String getMessage(){
        return "[CAUTION] Ошибка ввода";
    }
}
