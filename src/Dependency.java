/**
 * This class is in this project only to serve as
 * an representation of a dependency. So that in the
 * OptionalSingleton implementation the dependency
 * inversion principle can be shown.
 * It is known that when following SOLID principles,
 * classes should always strive to have abstractions
 * so that the code can be the less coupled possible,
 * but since this is a simple example and this class is
 * extremely simple as well, it doesn't
 * have any interfaces or anything to abstract it.
 */
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
