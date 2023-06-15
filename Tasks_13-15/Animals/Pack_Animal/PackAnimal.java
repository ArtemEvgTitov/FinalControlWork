package Animals.Pack_Animal;

import Animals.Animal;
import Animals.Pet.Pet;

import java.util.List;

public class PackAnimal extends Animal {

    List<String> commands;

    PackAnimal(int id, String name, String age, String voise, String eat ){
        super(id, name, age, voise, eat);
    }

    public void addCommand(String command){
        this.commands.add(command);
    }

    public void print(Pet pet){
        System.out.print(pet.toString() + "\nCommands: " + commands.toString());
    }
}
