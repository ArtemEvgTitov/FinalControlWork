package Java;

public class Animal {

    private int id;
    private String name;
    private String birthday;

    public Animal(int id, String name, String birthday) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
    }

    public int getId() {
        return id;
    }

    public int setId(int id) {
        return this.id = id;
    }

    public String getName() {
        return name;
    }

    public String setName(String name) {
        return this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public String setBirthday(String birthday) {
        return this.birthday = birthday;
    }

    public void feed() {
        System.out.println(name + " сыт.");
    }

    @Override
    public String toString() {
        return String.format("id: %d\nName: %s\nРожден: %s\n", this.id, this.name, this.birthday);

    }
}