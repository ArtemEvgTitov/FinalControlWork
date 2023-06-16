package Animals;

/**
 * Интерфейс для Animal
 */
public interface IAnimal {

    int getID();
    void setID(int id);
    String getName();
    void setName(String name);
    String getAge();
    void getAge(String birthday);
    String getVoise();
    void getVoise(String voise);
    String getEat();
    void getEat(String eat);
    String toString();
}
