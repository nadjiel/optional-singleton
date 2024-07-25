/**
 * This class only contains a simple code to illustrate how the
 * OptionalSingleton pattern would allow different instances while
 * still giving the option of having global single instances.
 */
public class Main {

    public static void main(String[] args) {
        OptionalSingleton globalInstance = OptionalSingleton.createSingleton(new Dependency(100));
        OptionalSingleton instance1 = new OptionalSingleton(new Dependency(1));
        OptionalSingleton instance2 = new OptionalSingleton(new Dependency(2));

        System.out.println("Instance 1: " + instance1);
        System.out.println("Instance 2: " + instance2);
        System.out.println("Global Instance: " + OptionalSingleton.getInstance());
    }

}
