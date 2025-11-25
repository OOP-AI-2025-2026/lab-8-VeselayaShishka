package ua.opnu;

public class GenericThreeTuple<V,T,S> {

    public final GenericTwoTuple<V,T> tuple;
    public final S third;

    public GenericThreeTuple(V first,T second,S third) {
        this.tuple = new GenericTwoTuple<>(first,second);
        this.third = third;
    }

    @Override
    public String toString() {
        return "{"+ tuple + "," + third + '}';
    }
}
