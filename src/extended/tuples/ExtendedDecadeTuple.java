package extended.tuples;

public class ExtendedDecadeTuple<A, B, C, D, E, F, G, H, I, J>
        extends ExtendedEnneadTuple<A, B, C, D, E, F, G, H, I> {

    private J tenth;

    public ExtendedDecadeTuple(final A first, final B second, final C third,
                               final D forth, final E fifth, final F sixth,
                               final G seventh, final H eighth,
                               final I ninth, final J tenth) {

        super(first, second, third, forth, fifth, sixth, seventh, eighth, ninth);
        this.tenth = tenth;
    }


    public static <A, B, C, D, E, F, G, H, I, J> ExtendedDecadeTuple with
            (final A first, final B second, final C third,
             final D forth, final E fifth, final F sixth,
             final G seventh, final H eighth,
             final I ninth, final J tenth) {

        return new ExtendedDecadeTuple(first, second, third, forth, fifth,
                                        sixth, seventh, eighth, ninth, tenth);
    }

    public void setTenth(final J tenth) {
        this.tenth = tenth;
    }

    public J getTenth() {
        return tenth;
    }


    @Override
    public String values() {
        return (super.values() + " " + this.tenth);
    }

    @Override
    public String toString() {
        return ("Decade tuple: " + this.values());
    }
}
