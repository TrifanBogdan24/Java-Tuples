package tuples;

public class SextetTuple<A, B, C, D, E, F> {
    private A first;
    private B second;
    private C third;
    private D forth;
    private E fifth;
    private F sixth;


    /**
     * copy constructor
     * @param first
     * @param second
     * @param third
     * @param forth
     * @param fifth
     * @param sixth
     */
    public SextetTuple(final A first, final B second, final C third,
                       final D forth, final E fifth, final F sixth) {
        this.first = first;
        this.second = second;
        this.third = third;
        this.forth = forth;
        this.fifth = fifth;
        this.sixth = sixth;
    }


    /**
     * constructor helper: will return a tuple instance
     * @param first
     * @param second
     * @param third
     * @param forth
     * @param fifth
     * @param sixth
     * @return
     * @param <A>
     * @param <B>
     * @param <C>
     * @param <D>
     * @param <E>
     * @param <F>
     */
    public static <A, B, C, D, E, F> SextetTuple with
            (final A first, final B second, final C third,
             final D forth, final E fifth, final F sixth) {

        return new SextetTuple(first, second, third,
                                forth, fifth, sixth);
    }


    public void setFirst(final A first) {
        this.first = first;
    }

    public A getFirst() {
        return first;
    }

    public void setSecond(final B second) {
        this.second = second;
    }

    public B getSecond() {
        return second;
    }

    public void setThird(final C third) {
        this.third = third;
    }

    public C getThird() {
        return third;
    }

    public void setForth(final D forth) {
        this.forth = forth;
    }

    public D getForth() {
        return forth;
    }

    public void setFifth(final E fifth) {
        this.fifth = fifth;
    }

    public E getFifth() {
        return fifth;
    }

    public void setSixth(final F sixth) {
        this.sixth = sixth;
    }

    public F getSixth() {
        return sixth;
    }


    /**
     * @return      the values of the tuples
     */
    @Override
    public String toString() {
        return ("Sextet Tuple: " + this.first + " " + this.second
                + " " + this.third + " " + this.forth + " " + this.fifth + " " + this.sixth);
    }
}
