package Animals.Pet;

import Animals.Animal;

import java.util.ArrayList;
import java.util.List;

public class Pet extends Animal {

    List<String> commands = new ArrayList<>();

    Pet(int id, String name, String age, String voise, String eat ){
        super(id, name, age, voise, eat);
    }

    public void addCommand(String command){
        this.commands.add(command);
    }

    public void print(Pet pet){
        System.out.print(pet.toString() + "\nCommands: " + commands.toString());
    }
}
