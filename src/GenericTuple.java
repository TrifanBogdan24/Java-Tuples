import java.util.ArrayList;
import java.util.List;

public class GenericTuple {
    private List<Object> elements;

    /**
     * `Object...`      variable number of arguments
     * @param elements
     */
    public GenericTuple(Object... elements) {
        this.elements = new ArrayList<>();

        for (Object element : elements) {
            this.elements.add(element);
        }
    }

    public Object getElement(int index) {
        if (index < 0 || index >= elements.size()) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        return elements.get(index);
    }

    @Override
    public String toString() {
        return switch (elements.size()) {
            case 0 -> "Empty tuple: []";
            case 1 -> "Unit tuple " + elements;
            case 2 -> "Pair tuple " + elements;
            case 3 -> "Triplet tuple " + elements;
            case 4 -> "Quartet tuple " + elements;
            case 5 -> "Quintet tuple " + elements;
            case 6 -> "Sextet tuple " + elements;
            case 7 -> "Septet tuple " + elements;
            case 8 -> "Octet tuple " + elements;
            case 9 -> "Ennead tuple " + elements;
            case 10 -> "Decade tuple " + elements;
            default -> "big tuple " + elements;
        };
    }
}
