package OopsConceptLearning.constructorwithtoString;

public class ConstructorUsingToString {
    String firstName;
    String secondName;

    public ConstructorUsingToString(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }

    @Override
    public String toString() {
        return "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'';
    }

    public static void main(String[] args) {
        ConstructorUsingToString constructorUsingToString = new ConstructorUsingToString("Sparsh","Bharat");
        System.out.println(constructorUsingToString);
    }
}
