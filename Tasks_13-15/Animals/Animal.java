package Animals;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс с конструктором Animal
 */
public class Animal implements IAnimal {

    private int id;
    private String name;
    private String age;
    private String voise;
    private String eat;

    List<String> commands = new ArrayList<>();

    /**
     * Конструктор
     * @param id - ID животного
     * @param name - имя животного
     * @param age - возраст животного
     * @param voise - голос животного
     * @param eat - чем питается
     */
    protected Animal(int id, String name, String age, String voise, String eat) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.voise = voise;
        this.eat = eat;
    }

    @Override
    public int getID() {
        return id;
    }

    @Override
    public void setID(int id) {
        this.id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getAge() {
        return age;
    }

    @Override
    public void getAge(String age) {
        this.age = age;
    }

    @Override
    public String getVoise() {
        return voise;
    }

    @Override
    public void getVoise(String voise) {
        this.voise = voise;
    }

    @Override
    public String getEat() {
        return eat;
    }

    @Override
    public void getEat(String eat) {
        this.eat = eat;
    }

    @Override
    public String toString() {
        return "\nID: " + id + "\nName: " + name + "\nAge: " + age + "\nVoise: " + voise + "\nEat: " + eat;
    }

    public void addCommand(String command) {
        this.commands.add(command);
    }

    public void printCommand() {
        if (commands.size() == 0) {
            System.out.println("Список команд пуст");
        } else {
            for (int i = 0; i < commands.size() - 1; i++) {
                System.out.println(commands.get(i));
            }
        }
    }
}
