import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {
                new Dog("Тузик", 5),
                new Dog("Рекс", 2),
                new Dog("Бобик", 7),
                new Dog("Джек", 3),
                new Dog("Мухтар", 1),
                new Cat("Мурка", 2),
                new Cat("Васька", 1),
                new Cat("Белка", 4),
                new Cat("Стрелка", 8),
                new Cat("Леон", 3)
        };

        // Перекличка
        Arrays.stream(animals).forEach(x -> {
            try {
                System.out.printf("%s Сказал: ", x);
                x.getClass().getMethod("makeSound").invoke(x);
            } catch (IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
                throw new RuntimeException(e);
            }
        });
    }
}
