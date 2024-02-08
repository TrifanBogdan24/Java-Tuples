package extended.tuples;

public class ExtendedPairTuple<A, B> extends ExtendedUnitTuple<A> {
    private B second;

    public ExtendedPairTuple(final A first, final B second) {
        super(first);
        this.second = second;
    }


    public static <A, B> ExtendedPairTuple with(final A first, final B second) {
        return new ExtendedPairTuple(first, second);
    }

    public B getSecond() {
        return second;
    }

    public void setSecond(final B second) {
        this.second = second;
    }

    @Override
    public String values() {
        return (super.values() + " " + this.second);
    }


    @Override
    public String toString() {
        return ("Pair tuple: " + this.values());
    }
}
