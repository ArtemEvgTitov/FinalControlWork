package Console;

import Animals.Animal;
import Animals.Pack_Animal.Camel;
import Animals.Pack_Animal.Donkey;
import Animals.Pack_Animal.Horse;
import Animals.Pack_Animal.PackAnimal;
import Animals.Pet.Cat;
import Animals.Pet.Dog;
import Animals.Pet.Hamster;
import Animals.Pet.Pet;
import Presenter.Exceptions.ChoiseError;

import java.util.ArrayList;
import java.util.List;


/**
 * Класс общения с пользователем
 */
public class View {

    GetValue getString = new GetValue();
    SetValue setString = new SetValue();
    List<Pet> pets = new ArrayList<>();
    List<PackAnimal> packAnimals = new ArrayList<>();

    public String GetString(String msg) {
        return getString.getValue(msg);
    }

    public void SetString(String msg) {
        String string = setString.setValueString(msg);
        System.out.println(string);
    }

    public void StartMessage() {
        System.out.println(
                """

                        Введите цифру необходимого действия:

                        1. Показать весь питомник
                        2. Показать только выбранный вид животных
                        3. Увидеть список команд, выполняемых животным
                        4. Обучить животное новым командам
                        5. Завести новое животное
                        
                        0. Выход из программы
                        """);
    }

    /**
    * Метод поиска животного по ID
    */
    private int searchID(){
        List<Animal> animals = new ArrayList<>();
        animals.addAll(pets);
        animals.addAll(packAnimals);
        int id = animals.size();
        return id;
    }

    /**
    * Метод добавления нового животного
    */
    public void addAnimal() throws ChoiseError {
        int choiseAnimals = 0;
        int choiseType = 0;

        String name = GetString("имя");
        String birthday = GetString("возраст");
        int id = searchID();
        System.out.println("""
                Выберите вид животных:\s
                1. Домашние
                2. Вьючные""");
        try {
            choiseAnimals = Integer.parseInt(GetString("Ваш выбор"));
        } catch (Exception e) {
            throw new ChoiseError();
        }
        if (choiseAnimals == 1){
            System.out.println("""
                    Выберите вид животных:\s
                    1. Кошки
                    2. Собаки
                    3. Хомяки
                    """);
            try {
                choiseType = Integer.parseInt(GetString("Ваш выбор"));
            } catch (Exception e) {
                throw new ChoiseError();
            }
            if (choiseType == 1) {
                Cat cat = new Cat(id, name, birthday);
                pets.add(cat);
            } else if (choiseType == 2) {
                Dog dog = new Dog(id, name, birthday);
                pets.add(dog);
            } else if (choiseType == 3) {
                Hamster hamster = new Hamster(id, name, birthday);
                pets.add(hamster);
            } else {
                throw new ChoiseError();
            }
        } else if (choiseAnimals == 2) {
            System.out.println("""
                    Выберите вид животных:\s
                    1. Верблюды
                    2. Ослы
                    3. Лошади
                    """);
            try {
                choiseType = Integer.parseInt(GetString("Ваш выбор"));
            } catch (Exception e) {
                throw new ChoiseError();
            }
            if (choiseType == 1) {
                Camel camel = new Camel(id, name, birthday);
                packAnimals.add(camel);
            } else if (choiseType == 2) {
                Donkey donkey = new Donkey(id, name, birthday);
                packAnimals.add(donkey);
            } else if (choiseType == 3) {
                Horse horse = new Horse(id, name, birthday);
                packAnimals.add(horse);
            } else {
                throw new ChoiseError();
            }
        } else {
            throw new ChoiseError();
        }
    }

    /**
    * Метод печати выбранного вида животных
    */
    public void printAnimals() throws ChoiseError {
        int choise = 0;
        System.out.println("""
                Выберите вид животных:\s
                1. Домашние
                2. Вьючные""");
        try {
            choise = Integer.parseInt(GetString("Ваш выбор"));
        } catch (Exception e) {
            throw new ChoiseError();
        }
        if (pets.size()==0){
            System.out.println("Список пуст");
        } else {
            if (choise == 1) {
                for (Pet pet : pets) {
                    System.out.println(pet.toString());
                    pet.printCommand();
                }
            } else if (choise == 2) {
                for (PackAnimal packAnimal : packAnimals) {
                    System.out.println(packAnimal.toString());
                    packAnimal.printCommand();
                }
            } else {
                throw new ChoiseError();
            }
        }
    }

    /**
    * Метод печати всех животных
    */
    public void printAllAnimals(){
        List<Animal> animals = new ArrayList<>();
        animals.addAll(pets);
        animals.addAll(packAnimals);
        if (animals.size()==0){
            System.out.println("Список пуст");
        } else {
            for (Animal a : animals) {
                System.out.println(a.toString());
                a.printCommand();
            }
        }
    }

    /**
    * Метод добавления новой команды
    */
    public void newCommand() throws ChoiseError {
        List<Animal> animals = new ArrayList<>();
        int id = 0;
        animals.addAll(pets);
        animals.addAll(packAnimals);
        if (animals.size()==0){
            System.out.println("Список пуст");
        } else {
            for (Animal a : animals) {
                System.out.println(a.toString());
            }
            System.out.println("\nВведите ID животного: ");
            try {
                id = Integer.parseInt(GetString("Ваш выбор"));
            } catch (Exception e) {
                throw new ChoiseError();
            }
            String command = GetString("команду");
            animals.get(id).addCommand(command);
        }
    }

    /**
    * Метод печати всех команд выбранного животного
    */
    public void printCommand() throws ChoiseError {
        List<Animal> animals = new ArrayList<>();
        int id = 0;
        animals.addAll(pets);
        animals.addAll(packAnimals);
        if (animals.size()==0){
            System.out.println("Список пуст");
        } else {
            for (Animal a : animals) {
                System.out.println(a.toString());
            }
            System.out.println("\nВведите ID животного: ");
            try {
                id = Integer.parseInt(GetString("Ваш выбор"));
            } catch (Exception e) {
                throw new ChoiseError();
            }
            animals.get(id).printCommand();
        }
    }
}
