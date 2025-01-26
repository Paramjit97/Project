package Jan18;

public class Name {
    private String firstname;
    private String middleName;
    private String lastName;

    public Name(String firstname, String middleName, String lastName) {
        this.firstname = firstname;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Name{" +
                "firstname='" + firstname + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
