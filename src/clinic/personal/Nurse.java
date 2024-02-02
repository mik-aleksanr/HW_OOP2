import java.time.LocalDate;

public class Nurse extends Staff {
    public Nurse(String fullName, String gender, LocalDate dateOfBirth, String jobTitle) {
        super(fullName, gender, dateOfBirth, jobTitle);
    }

    public Nurse() {
        super();
    }

    public void toBandage() {
        System.out.println("Медсестра делает перевязку");
    }

}
