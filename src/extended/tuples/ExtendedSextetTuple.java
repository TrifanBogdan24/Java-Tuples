package extended.tuples;

public class ExtendedSextetTuple<A, B, C, D, E, F>
        extends ExtendedQuintetTuple<A, B, C, D, E>  {

    private F sixth;

    public ExtendedSextetTuple(final A first, final B second, final C third,
                               final D forth, final E fifth, final F sixth) {

        super(first, second, third, forth, fifth);
        this.sixth = sixth;
    }

    public static <A, B, C, D, E, F> ExtendedSextetTuple with
            (final A first, final B second, final C third,
             final D forth, final E fifth, final F sixth) {

        return new ExtendedSextetTuple(first, second, third, forth, fifth, sixth);
    }


    public void setSixth(final F sixth) {
        this.sixth = sixth;
    }

    public F getSixth() {
        return sixth;
    }

    @Override
    public String values() {
        return (super.values() + " " + this.sixth);
    }

    @Override
    public String toString() {
        return ("Sextet tuple: " + this.values());
    }
}
