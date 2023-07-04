package Task_1;

public class Main {
    public static void main(String[] args) {
        Animal animalArray[] = {new Dog(), new Cat(), new Cow()};
        for (int i = 0; i< animalArray.length;i++){
            Animal animal = animalArray[i];
            animal.makeSound();
        }
    }
}