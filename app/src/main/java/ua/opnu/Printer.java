package ua.opnu;

public class Printer<T> {

    public void printArray(T[] array) {
        for (T item : array) {
            System.out.print(item+" ");
        }
        System.out.println();
    }
}
