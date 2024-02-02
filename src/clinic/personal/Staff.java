import java.time.LocalDate;

public abstract class Staff {
    protected String fullName;
    protected String gender;
    protected LocalDate dateOfBirth;
    protected String jobTitle;

    public Staff(String fullName, String gender, LocalDate dateOfBirth, String jobTitle) {
        this.fullName = fullName;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.jobTitle = jobTitle;
    }

    public Staff() {
        this("Имя Фамилия Отчество", "Пол",
                LocalDate.of(1977, 6, 19), "Должность");
    }

    public String getFullName() {
        return (fullName);
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public String toString() {
        return String.format("fullName = %s, jobTitle = %s, gender = %s, dateOfBirth = %s",
                fullName, jobTitle, gender, dateOfBirth);
    }
}
