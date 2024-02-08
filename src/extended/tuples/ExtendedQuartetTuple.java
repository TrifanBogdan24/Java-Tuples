package extended.tuples;

public class ExtendedQuartetTuple<A, B, C, D>
        extends ExtendedTripletTuple<A, B, C> {

    private D forth;

    public ExtendedQuartetTuple(final A first, final B second, final C third, final D forth) {
        super(first, second, third);
        this.forth = forth;
    }


    public static <A, B, C, D> ExtendedQuartetTuple with
            (final A first, final B second, final C third, final D forth) {

        return new ExtendedQuartetTuple(first, second, third, forth);
    }


    public void setForth(final D forth) {
        this.forth = forth;
    }

    public D getForth() {
        return forth;
    }

    @Override
    public String values() {
        return (super.values() + " " + this.forth);
    }

    @Override
    public String toString() {
        return ("Quartet tuple: " + this.values());
    }
}
