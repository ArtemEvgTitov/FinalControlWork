package Pack_Animal;

public class Camel extends Pack_Animal {

    public Camel(int id, String name, String birthday, int loadCapacity) {
        super(id, name, birthday, loadCapacity);
    }

    public static void Comands() {
        System.out.println("Выполняемые команды животного");
    }
}
