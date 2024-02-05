public class Dog extends Animal{

    private final String breed;

    public Dog(String name,String breed, int age) {
        super(name, age);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void makeSound(){
        super.makeSound("Гав");
    }

    @Override
    public String toString() {
        return String.format("%s, порода %s: %s",
                getClass().getName(),
                getBreed(),
                super.toString());
    }
}
