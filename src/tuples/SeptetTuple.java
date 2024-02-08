package tuples;

public class SeptetTuple<A, B, C, D, E, F, G> {
    private A first;
    private B second;
    private C third;
    private D forth;
    private E fifth;
    private F sixth;
    private G seventh;


    /**
     * copy constructor
     * @param first
     * @param second
     * @param third
     * @param forth
     * @param fifth
     * @param sixth
     * @param seventh
     */
    public SeptetTuple(final A first, final B second, final C third,
                       final D forth, final E fifth,
                       final F sixth, final G seventh) {
        this.first = first;
        this.second = second;
        this.third = third;
        this.forth = forth;
        this.fifth = fifth;
        this.sixth = sixth;
        this.seventh = seventh;
    }


    public static <A, B, C, D, E ,F, G> SeptetTuple with
            (final A first, final B second, final C third, final D forth,
             final E fifth, final F sixth, final G seventh) {

        return new SeptetTuple(first, second, third,
                                forth, fifth, sixth, seventh);
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

    public void setSeventh(final G seventh) {
        this.seventh = seventh;
    }

    public G getSeventh() {
        return seventh;
    }

    /**
     * @return      the values of the tuple
     */
    @Override
    public String toString() {
        return ("Septet Tuple: " + " " + this.first + " " + this.second + " " + this.third
                + " " + this.forth + " " + this.fifth + " " + this.sixth + " " + this.seventh);
    }
}
