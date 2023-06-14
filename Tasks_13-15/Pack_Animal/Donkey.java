package Pack_Animal;

public class Donkey extends Pack_Animal {

    public Donkey(int id, String name, String birthday, int loadCapacity) {
        super(id, name, birthday, loadCapacity);
    }
    
    public void Comands(){
        System.out.println("Выполняемые команды животного");
    }
}