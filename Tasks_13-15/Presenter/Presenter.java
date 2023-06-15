package Presenter;


import Console.View;
import Presenter.Exceptions.ChoiseError;


public class Presenter {

    public void run() throws Exception {
        View view = new View();
        boolean start = true;


        while (start){

            view.StartMessage();
            int choiseStart = 0;

            try {
                choiseStart = Integer.parseInt(view.GetString("Ваш выбор"));
                if (choiseStart == 1) {
                    view.printAllAnimals();
                } else if (choiseStart == 2) {
                    view.printAnimals();
                } else if (choiseStart == 3) {
                    view.printCommand();
                } else if (choiseStart == 4) {
                    view.newCommand();
                } else if (choiseStart == 5) {
                    view.addAnimal();
                } else if (choiseStart == 0) {
                    start = false;
                } else {
                    throw new ChoiseError();
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
