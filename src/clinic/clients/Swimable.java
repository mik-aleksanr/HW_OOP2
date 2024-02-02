package clinic.clients;

@FunctionalInterface
public interface Swimable {
    void toSwimm();

    default double getSwimmSpeed() {
        return 5;
    }
}
