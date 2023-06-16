package Animals.Pet;

/**
 * Класс с конструктором Dog
 */
public class Dog extends Pet {
    
    public Dog(int id, String name, String age) {
        super(id, name, age, "Лает", "Мясо, птица, рыба");
    }
}
