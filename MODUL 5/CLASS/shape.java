package soal1;

public abstract class shape {
    protected String shapeName;

    public shape(String name) {
        shapeName = name;
    }

    protected abstract Double area();

    public String toString() {
        return shapeName;
    }
}
