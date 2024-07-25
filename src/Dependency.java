public class Dependency {

    private final int id;

    public Dependency(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return Integer.toString(this.id);
    }

}
