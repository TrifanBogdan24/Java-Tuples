package extended.tuples;

public class ExtendedQuintetTuple<A, B, C, D, E>
        extends ExtendedQuartetTuple<A, B, C, D>{

    private E fifth;

    public ExtendedQuintetTuple(final A first, final B second, final C third,
                                final D forth, final E fifth) {

        super(first, second, third, forth);
        this.fifth = fifth;
    }


    public static <A, B, C, D, E> ExtendedQuintetTuple with
            (final A first, final B second, final C third,
             final D forth, final E fifth) {

        return new ExtendedQuintetTuple(first, second, third, forth, fifth);
    }

    public void setFifth(final E fifth) {
        this.fifth = fifth;
    }

    public E getFifth() {
        return fifth;
    }

    @Override
    public String values() {
        return (super.values() + " " + this.fifth);
    }

    @Override
    public String toString() {
        return ("Quintet tuple: " + this.values());
    }
}
