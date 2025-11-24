package ua.opnu;

import java.util.Arrays;
import java.util.function.Predicate;

public class Filter<T> {
       public T[] Filter(T[] arr,  Predicate<T> pr) {

           T[] arr2 = (T[])new Object[arr.length];

           int counter = 0;
           for (T t : arr) {
               if (pr.test(t)) {
                arr2[counter] = t;
                counter++;
               }
           }

           return Arrays.copyOf(arr2, counter);
       }
}
