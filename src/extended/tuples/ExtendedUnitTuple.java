package extended.tuples;

public class ExtendedUnitTuple<A> {
    private A first;

    public ExtendedUnitTuple(final A first) {
        this.first = first;
    }

    public static <A> ExtendedUnitTuple with(final A first) {
        return new ExtendedUnitTuple(first);
    }


    public A getFirst() {
        return first;
    }

    public void setFirst(final A first) {
        this.first = first;
    }

    public String values() {
        return (String.format("%s", this.first));
    }

    @Override
    public String toString() {
        return ("Unit tuple: " + this.values());
    }
}
