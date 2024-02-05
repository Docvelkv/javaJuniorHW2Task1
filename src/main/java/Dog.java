public class Dog extends Animal{
    public Dog(String name, int age) {
        super(name, age);
    }

    public void makeSound(){
        super.makeSound("Гав");
    }

    @Override
    public String toString() {
        return String.format("%s: %s", getClass().getName(), super.toString());
    }
}
