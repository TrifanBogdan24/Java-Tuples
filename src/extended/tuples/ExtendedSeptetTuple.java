package extended.tuples;

public class ExtendedSeptetTuple<A, B, C, D, E, F, G>
        extends ExtendedSextetTuple<A, B, C, D, E, F> {

    private G seventh;

    public ExtendedSeptetTuple(final A first, final B second, final C third,
                               final D forth, final E fifth,
                               final F sixth, final G seventh) {

        super(first, second, third, forth, fifth, sixth);
        this.seventh = seventh;
    }

    public static <A, B, C, D, E, F, G> ExtendedSeptetTuple with
            (final A first, final B second, final C third,
             final D forth, final E fifth,
             final F sixth, final G seventh) {

        return new ExtendedSeptetTuple(first, second, third, forth,
                                        fifth, sixth, seventh);
    }


    public void setSeventh(G seventh) {
        this.seventh = seventh;
    }

    public G getSeventh() {
        return seventh;
    }


    @Override
    public String values() {
        return (super.values() + " " + this.seventh);
    }

    @Override
    public String toString() {
        return ("Septet tuple: " + this.values());
    }
}
