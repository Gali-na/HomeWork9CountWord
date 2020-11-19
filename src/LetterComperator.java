import java.util.Comparator;

public class LetterComperator implements Comparator<LetterPosition> {

    @Override
    public int compare(LetterPosition o1, LetterPosition o2) {
        return o2.getPosition().compareTo(o1.getPosition());
    }
}
