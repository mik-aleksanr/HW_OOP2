@FunctionalInterface
public interface Goable {
    void toGo();

    default double getRunSpeed() {
        return 10;
    }
}
