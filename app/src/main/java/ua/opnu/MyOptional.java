package ua.opnu;
public class MyOptional<T> {

    private T value;
    private boolean present;

    public MyOptional() {
        this.present = false;
    }

    public MyOptional(T value) {
        this.value = value;
        if(checkNull()){
            throw new IllegalArgumentException("MyOptional не приймає null");
        }
        present = true;
    }

    private boolean checkNull() {
        if (value == null)
            return true;
        else
            return false;
    }

    public boolean isPresent() {
        return present;
    }

    public boolean isEmpty() {
        return !present;
    }

    public T get(){
        if (present)
            return value;
        else
            throw new IllegalStateException("Неможливе значення");
    }

    public T orElse(T defaultValue) {
        if (present)
            return value;
        else
            return defaultValue;
    }

    @Override
    public String toString() {
        if  (present)
            return value.toString();
        else
            return " ";
    }
}