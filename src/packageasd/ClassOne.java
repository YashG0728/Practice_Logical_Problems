package packageasd;
// pojo class :
// Variables - private - not access in other classes;
// getter/setter  - if we want to access in other class we need get set methods;
// constructor
// toString ;  //when we have more than one variable

public class ClassOne {
 private String firstname;
 private String lastname;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return "ClassOne{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }
}
