package tuples;

public class QuartetTuple<A, B, C, D> {
    private A first;
    private B second;
    private C third;
    private D forth;

    /**
     * copy constructor
     * @param first
     * @param second
     * @param third
     * @param forth
     */
    public QuartetTuple(final A first, final B second,
                        final C third, final D forth) {
        this.first = first;
        this.second = second;
        this.third = third;
        this.forth = forth;
    }


    /**
     * constructor helper: will return a tuple instance
     * @param first
     * @param second
     * @param third
     * @param forth
     * @return
     * @param <A>
     * @param <B>
     * @param <C>
     * @param <D>
     */
    public static <A, B, C, D> QuartetTuple with(final A first, final B second,
                                                 final C third, final D forth) {
        return new QuartetTuple(first, second, third, forth);
    }

    public A getFirst() {
        return first;
    }

    public void setFirst(final A first) {
        this.first = first;
    }

    public B getSecond() {
        return second;
    }

    public void setSecond(final B second) {
        this.second = second;
    }

    public C getThird() {
        return third;
    }

    public void setThird(final C third) {
        this.third = third;
    }

    public D getForth() {
        return forth;
    }

    public void setForth(final D forth) {
        this.forth = forth;
    }


    /**
     * @return      the values of the tuple
     */
    @Override
    public String toString() {
        return ("Quartet tuple: " + this.first + " " + this.second
                + " " + this.second + " " + this.third);
    }
}
