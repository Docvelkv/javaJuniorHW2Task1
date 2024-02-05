import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {
                new Dog("Туз", "Алабай", 5),
                new Dog("Рекс", "Лабрадор", 2),
                new Dog("Бобин", "Ротвейлер", 7),
                new Dog("Джек", "Бигль", 3),
                new Dog("Урбуш", "Эрдельтерьер", 1),
                new Cat("Мурка", "Мейн-кун", 2),
                new Cat("Санни", "Рэгдолл", 1),
                new Cat("Кефир", "Манчкин", 4),
                new Cat("Зола", "Нибелунг", 8),
                new Cat("Леон", "Ангора", 3)
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
