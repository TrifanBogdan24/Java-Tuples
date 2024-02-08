package tuples;

public class EnneadTuple<A, B, C, D, E, F, G, H, I> {
    private A first;
    private B second;
    private C third;
    private D forth;
    private E fifth;
    private F sixth;
    private G seventh;
    private H eighth;
    private I ninth;


    /**
     * copy constructor
     * @param first
     * @param second
     * @param third
     * @param forth
     * @param fifth
     * @param sixth
     * @param seventh
     * @param eighth
     * @param ninth
     */
    public EnneadTuple(final A first, final B second, final C third,
                      final D forth, final E fifth, final F sixth,
                      final G seventh, final H eighth, final I ninth) {
        this.first = first;
        this.second = second;
        this.third = third;
        this.forth = forth;
        this.fifth = fifth;
        this.sixth = sixth;
        this.seventh = seventh;
        this.eighth = eighth;
        this.ninth = ninth;
    }


    /**
     * constructor helper: will return a tuple instance
     * @param first
     * @param second
     * @param third
     * @param forth
     * @param fifth
     * @param sixth
     * @param seventh
     * @param eighth
     * @param ninth
     * @return
     * @param <A>
     * @param <B>
     * @param <C>
     * @param <D>
     * @param <E>
     * @param <F>
     * @param <G>
     * @param <H>
     * @param <I>
     */
    public static <A, B, C, D, E, F, G, H, I> EnneadTuple with
            (final A first, final B second, final C third,
             final D forth, final E fifth, final F sixth,
             final G seventh, final H eighth, final I ninth) {

        return new EnneadTuple(first, second, third, forth, fifth,
                                sixth, seventh, eighth, ninth);
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

    public void setEighth(final H eighth) {
        this.eighth = eighth;
    }

    public H getEighth() {
        return eighth;
    }

    public void setNinth(I ninth) {
        this.ninth = ninth;
    }

    public I getNinth() {
        return ninth;
    }

    /**
     * @return      the values of the tuple
     */
    @Override
    public String toString() {
        return ("Septet Tuple: " + this.first + " " +  this.second + " " + this.third
                + " " + this.forth + " " + this.fifth + " " + this.sixth
                + " " + this.seventh + " " + this.eighth + " " + this.ninth);
    }
}

