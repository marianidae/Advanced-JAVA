package shelter;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Shelter {
    private int capacity;
    private List<Animal> animalList;

    public Shelter(int capacity) {
        this.capacity = capacity;
        animalList = new ArrayList<>();
    }

    public void add(Animal animal) {
        if (animalList.size() < capacity){
            animalList.add(animal);
        }
    }

    public boolean remove(String name) {
        Animal animalToRemove = animalList
                .stream()
                .filter(e -> e.getName().equals(name))
                .findFirst()
                .orElse(null);

        if (animalToRemove != null){
            animalList.remove(animalToRemove);
            return true;
        }
        return false;
    }
    public Animal getAnimal(String name, String caretaker){
        return animalList
                .stream()
                .filter(e -> e.getName().equals(name))
                .findFirst()
                .orElse(null);

    }
    public Animal getOldestAnimal(){

        return animalList.stream().max(Comparator.comparingInt(Animal::getAge)).orElse(null);
    }
    public int getCount(){
        return animalList.size();
    }
    public String getStatistics(){

        StringBuilder sb = new StringBuilder();
        sb.append(String.format("The shelter has the following animals:"));
        for (Animal animal : animalList) {
            sb.append(animalList).append(System.lineSeparator());

        }
        return sb.toString();
    }

}
