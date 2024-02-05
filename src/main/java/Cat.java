public class Cat extends Animal{
    public Cat(String name, int age) {
        super(name, age);
    }

    public void makeSound(){
        super.makeSound("Мяу");
    }

    @Override
    public String toString() {
        return String.format("%s: %s", getClass().getName(), super.toString());
    }
}
