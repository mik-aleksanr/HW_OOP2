package clinic.clients;

public class Owner {
    String fullName;

    public Owner(String fullName) {// конструктор с полем fullName
        this.fullName = fullName;
    }

    @Override
    public String toString() {
        return "Owner{" + "fullName='" + fullName + '\'' + '}';
    }
}
