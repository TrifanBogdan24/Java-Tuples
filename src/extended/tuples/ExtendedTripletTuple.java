package extended.tuples;

public class ExtendedTripletTuple<A, B, C> extends ExtendedPairTuple<A, B> {
    private C third;

    public ExtendedTripletTuple(final A first, final B second, final C third) {
        super(first, second);
        this.third = third;
    }

    public static <A, B, C> ExtendedTripletTuple with(final A first, final B second, final C third) {
        return new ExtendedTripletTuple(first, second, third);
    }


    public void setThird(final C third) {
        this.third = third;
    }

    public C getThird() {
        return third;
    }


    @Override
    public String values() {
        return (super.values() + " " + this.third);
    }

    @Override
    public String toString() {
        return ("Triple tuple: " + this.values());
    }

}
