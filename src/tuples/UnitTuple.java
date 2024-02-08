package tuples;

public class UnitTuple<A> {
    private A first;

    /**
     * copy constructor
     * @param first the first element
     */
    public UnitTuple(final A first) {
        this.first = first;
    }


    /**
     * constructor helper: will return a tuple instance
     * @param first
     * @return
     * @param <A>
     */
    public static <A> UnitTuple with(final A first) {
        return new UnitTuple(first);
    }

    public A getFirst() {
        return this.first;
    }

    public void setFirst(final A first) {
        this.first = first;
    }


    /**
     * @return      the values of the tuple
     */
    @Override
    public String toString() {
        return ("Unit tuple: " + String.format("%s", this.first));
    }
}
