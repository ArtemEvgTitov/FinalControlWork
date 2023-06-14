package Pack_Animal;

public class Horse extends Pack_Animal {

    String saddle;

    public Horse(int id, String name, String birthday, int loadCapacity) {
        super(id, name, birthday, loadCapacity);
    }

    public static void Comands() {
        System.out.println("Выполняемые команды животного");
    }
}