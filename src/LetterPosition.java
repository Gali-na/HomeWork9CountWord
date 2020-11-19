import java.util.Objects;

public class LetterPosition {
    private Character word;
    private Integer position;

    public LetterPosition(Character word, int position) {
        this.word = word;
        this.position = position;
    }

    public LetterPosition() {
    }

    public Character getWord() {
        return word;
    }

    public void setWord(Character word) {
        this.word = word;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LetterPosition)) return false;
        LetterPosition that = (LetterPosition) o;
        return position == that.position &&
                Objects.equals(word, that.word);
    }

    @Override
    public int hashCode() {
        return Objects.hash(word, position);
    }

    @Override
    public String toString() {
        return "LetterPosition{" +
                "word=" + word +
                ", position=" + position +
                '}';
    }
}
