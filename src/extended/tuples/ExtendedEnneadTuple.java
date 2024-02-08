package extended.tuples;

public class ExtendedEnneadTuple<A, B, C, D, E, F, G, H, I>
        extends ExtendedOctetTuple<A, B, C, D, E, F, G, H>  {

    private I ninth;

    public ExtendedEnneadTuple(final A first, final B second, final C third,
                               final D forth, final E fifth, final F sixth,
                               final G seventh, final H eighth, final I ninth) {

        super(first, second, third, forth, fifth, sixth, seventh, eighth);
        this.ninth = ninth;
    }

    public static <A, B, C, D, E, F, G, H, I> ExtendedEnneadTuple with
            (final A first, final B second, final C third,
             final D forth, final E fifth, final F sixth,
             final G seventh, final H eighth, final I ninth) {

        return new ExtendedEnneadTuple(first, second, third,
                                        forth, fifth, sixth,
                                        seventh, eighth, ninth);
    }

    public void setNinth(final I ninth) {
        this.ninth = ninth;
    }

    public I getNinth() {
        return ninth;
    }


    @Override
    public String values() {
        return (super.values() + " " + this.ninth);
    }

    @Override
    public String toString() {
        return ("Ennead tuple: " + this.values());
    }
}
