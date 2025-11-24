package ua.opnu;

public class Contains {
    public <T extends Comparable<T>, V extends T> boolean contains(T[] arr, V value) {
        for(T t : arr)
            if(t.compareTo(value) == 0)
                return true;
        return false;
    }
}
