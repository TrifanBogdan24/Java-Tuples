package tuples;

public class QuintetTuple<A, B, C, D, E> {
    private A first;
    private B second;
    private C third;
    private D forth;
    private E fifth;


    /**
     * copy constructor
     * @param first
     * @param second
     * @param third
     * @param forth
     * @param fifth
     */
    public QuintetTuple(final A first, final B second, final C third,
                        final D forth, final E fifth) {
        this.first = first;
        this.second = second;
        this.third = third;
        this.forth = forth;
        this.fifth = fifth;
    }

    /**
     * constructor helper: will return a tuple instance
     * @param first
     * @param second
     * @param third
     * @param forth
     * @param fifth
     * @return
     * @param <A>
     * @param <B>
     * @param <C>
     * @param <D>
     * @param <E>
     */
    public static <A, B, C, D, E> QuintetTuple with(final A first, final B second,
                                               final C third, final D forth,
                                               final E fifth) {
        return new QuintetTuple(first, second, third, forth, fifth);
    }


    public void setFirst(A first) {
        this.first = first;
    }


    public A getFirst() {
        return first;
    }

    public void setSecond(B second) {
        this.second = second;
    }

    public B getSecond() {
        return second;
    }

    public void setThird(C third) {
        this.third = third;
    }

    public C getThird() {
        return third;
    }

    public void setForth(D forth) {
        this.forth = forth;
    }

    public D getForth() {
        return forth;
    }

    public void setFifth(E fifth) {
        this.fifth = fifth;
    }

    public E getFifth() {
        return fifth;
    }


    /**
     * @return      the values of the tuple
     */
    @Override
    public String toString() {
        return ("Quintet Tuple: " + this.first + " " + this.second
                + " " + this.third + " " + this.forth + " " + this.fifth);
    }
}
