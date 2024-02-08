package tuples;

public class TripletTuple<A, B, C> {
    private A first;
    private B second;
    private C third;

    /**
     * copy constructor
     * @param first
     * @param second
     * @param third
     */
    public TripletTuple(final A first, final B second, final C third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }


    /**
     * constructor helper: will return a tuple instance
     * @param first
     * @param second
     * @return
     * @param <A>
     * @param <B>
     * @param <C>
     */
    public static <A, B, C> TripletTuple with(final A first, final B second, final C third) {
        return new TripletTuple(first, second, third);
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

    /**
     * @return      the values of the tuple
     */
    @Override
    public String toString() {
        return ("Triplet tuple: " + this.first + " " + this.second + " " + this.third);
    }
}
