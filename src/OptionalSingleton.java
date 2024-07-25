/**
 * This class shows the structure of the OptionalSingleton pattern.
 * Such structure consists of a class with a public constructor, which
 * allows the creation of multiple different instances whenever necessary,
 * but also methods to access and create an instance that is stored in a
 * static field, which could be used anywhere in the application as the
 * Singleton pattern would allows.
 * The advantage of this implementation is that having the possibility to
 * create multiple instances allows for better testability, guaranteeing that
 * each test can have its own private state.
 * This approach is not perfect tough, as sharing global state is always
 * dangerous and can open up space for undesired side effects in the code
 * when interacting with instances from multiples places.
 * The objective of this pattern is to provide a global access to classes
 * that implement it, while also leaving room for a controlled amount of
 * shared states and although it can be as dangerous as a Singleton, there
 * are times when this kind of approach can be put to good use.
 *
 * @author Daniel de O. Sousa
 */
public class OptionalSingleton {

    /**
     * This static property stores the single instance of
     * this class that is available in the entire application
     * using static getters.
     */
    private static OptionalSingleton instance;

    /**
     * This property is only here to illustrate a possible
     * dependency that this class could have, which is
     * injected through its constructor.
     */
    private final Dependency dependency;

    public OptionalSingleton(Dependency dependency) {
        this.dependency = dependency;
    }

    /**
     * This method allows the creation of the Singleton instance of this class.
     * It takes, just like the constructor, the dependencies to be injected in
     * this new instance.
     * Note that this method opens the possibility of the creation of different
     * Singleton instances through the life-cycle of the application, which may
     * be undesired, if so, that can be fixed with the traditional getInstance()
     * method common in Singleton implementations.
     * Such method would create a new instance only if there isn't already one created,
     * else, it would return the existing instance.
     * 
     * @param dependency This parameter illustrates the injection of dependencis
     * to this new Singleton instance.
     * @return The new global instance created.
     */
    public static OptionalSingleton createSingleton(Dependency dependency) {
        OptionalSingleton.instance = new OptionalSingleton(dependency);

        return OptionalSingleton.instance;
    }

    /**
     * Here is the static getter that returns the global instance of
     * this class and makes it available everywhere in the application.
     */
    public static OptionalSingleton getInstance() {
        return OptionalSingleton.instance;
    }

    @Override
    public String toString() {
        return "{" + this.dependency + "}";
    }

}
