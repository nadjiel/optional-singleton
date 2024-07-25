public class OptionalSingleton {

    private static OptionalSingleton instance;

    private final Dependency dependency;

    public OptionalSingleton(Dependency dependency) {
        this.dependency = dependency;
    }

    public static OptionalSingleton createSingleton(Dependency dependency) {
        OptionalSingleton.instance = new OptionalSingleton(dependency);

        return OptionalSingleton.instance;
    }

    public static OptionalSingleton getInstance() {
        return OptionalSingleton.instance;
    }

    @Override
    public String toString() {
        return "{" + this.dependency + "}";
    }

}
