package extended.tuples;

public class ExtendedOctetTuple<A, B, C, D, E, F, G, H>
        extends ExtendedSeptetTuple<A, B, C, D, E, F, G>  {

    private H eighth;

    public ExtendedOctetTuple(final A first, final B second, final C third,
                              final D forth, final E fifth, final F sixth,
                              final G seventh, final H eighth) {

        super(first, second, third, forth, fifth, sixth, seventh);
        this.eighth = eighth;
    }


    public static <A, B, C, D, E, F, G, H> ExtendedOctetTuple with
            (final A first, final B second, final C third,
             final D forth, final E fifth, final F sixth,
             final G seventh, final H eighth) {

        return new ExtendedOctetTuple(first, second, third, forth,
                                        fifth, sixth, seventh, eighth);
    }


    public void setEighth(final H eighth) {
        this.eighth = eighth;
    }

    public H getEighth() {
        return eighth;
    }

    @Override
    public String values() {
        return (super.values() + " " + this.eighth);
    }

    @Override
    public String toString() {
        return ("Octet tuple: " + this.values());
    }
}
