public class Animal {
    private final String name;
    private final int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void makeSound(String voice){
        System.out.println(voice);
    }

    @Override
    public String toString() {
        return String.format("имя - %s, возраст - %d.", getName(), getAge());
    }
}
