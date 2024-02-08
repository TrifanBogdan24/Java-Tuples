package tuples;


/**
 * generic type tuple with only two fields
 *
 * @param <A> the first element of the tuple
 *            generic data type
 * @param <B> the second element of the tuple
 *            generic data type
 */
public class PairTuple<A, B> {
    private A first;
    private B second;

    /**
     * copy constructor
     * @param first
     * @param second
     */
    public PairTuple(final A first, final B second) {
        this.first = first;
        this.second = second;
    }


    /**
     * constructor helper: will return a tuple instance
     * @param first
     * @param second
     * @return
     * @param <A>
     * @param <B>
     */
    public static <A, B> PairTuple with(final A first, final B second) {
        return new PairTuple(first, second);
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


    /**
     * @return      the values of the tuple
     */
    @Override
    public String toString() {
        return ("Pair tuple: " + this.first + " " + this.second);
    }
}
