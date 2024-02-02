package clinic.clients;

@FunctionalInterface
public interface Flyable {
    void toFly();

    default double getFlySpeed() {
        return 40;
    }
}
