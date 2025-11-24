package ua.opnu;

public class Main {
    public static void main(String[] args) {

        // 1. Порожнє значення (наприклад, у користувача немає по-батькові)
        MyOptional<String> middleName = new MyOptional<>();
        System.out.println(middleName); // MyOptional[empty]
        System.out.println("isPresent: " + middleName.isPresent()); // false
        System.out.println("orElse: " + middleName.orElse("немає")); // "немає"

        // 2. Заповнене значення (наприклад, логін користувача)
        MyOptional<String> username = new MyOptional<>("admin");
        System.out.println(username); // MyOptional[value=admin]
        System.out.println("isPresent: " + username.isPresent()); // true
        System.out.println("get(): " + username.get()); // "admin"
        System.out.println("orElse: " + username.orElse("guest")); // "admin"

        // 3. Перевіримо, що get() на порожньому об'єкті кидає помилку
        try {
            String test = middleName.get(); // має кинути IllegalStateException
            System.out.println("unexpected: " + test);
        } catch (IllegalStateException ex) {
            System.out.println("Очікуваний виняток: " + ex.getMessage());
        }

        // 4. Перевіримо, що конструктор не приймає null
        try {
            MyOptional<String> broken = new MyOptional<>(null);
            System.out.println("unexpected: " + broken);
        } catch (IllegalArgumentException ex) {
            System.out.println("Правильно не дозволив null: " + ex.getMessage());
        }

        System.out.println("\n\n");

        Printer myPrinter = new Printer();
        Integer[] intArray = {1, 2, 3};
        String[] stringArray = {"Hello", "World"};
        myPrinter.printArray(intArray);
        myPrinter.printArray(stringArray);

        System.out.println("\n\n");

        GenericTwoTuple<String, Integer> person =
                new GenericTwoTuple<>("Alice", 25);

        GenericTwoTuple<Double, String> product =
                new GenericTwoTuple<>(19.99, "USB Cable");

        System.out.println(person);
        System.out.println(product);

        System.out.println("\n\n");

        GenericThreeTuple<String, Integer, Boolean> user =
                new GenericThreeTuple<>("Bob", 42, true);

        GenericThreeTuple<Double, String, String> book =
                new GenericThreeTuple<>(4.7, "Dune", "Sci-Fi");

        System.out.println(user);
        System.out.println(book);

    }
}