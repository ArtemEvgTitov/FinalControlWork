package Pack_Animal;

import Java.Animal;

public class Pack_Animal extends Animal implements Employable {

    private int loadCapacity;

    public Pack_Animal(int id, String name, String birthday, int loadCapacity) {
        super(id, name, birthday);
        this.loadCapacity = loadCapacity;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void employ() {
    }

    @Override
    public String toString() {
        return String.format("id: %d\nName: %s\nРожден: %s\nГрузоподъемность: %s\n", getId(), getName(), getBirthday(),
                this.loadCapacity);
    }

}
