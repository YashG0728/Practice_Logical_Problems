package OopsConceptLearning.modifiers.acessmodifiersformethods;

public class ModifiersInMethods {

    public void publicMethod(){
        System.out.println("------------------------------------Public-------------------------------------------");
        System.out.println("the code is accessible for all classes and packages.");
        System.out.println();
    }

    private void privateMethod(){
        System.out.println("------------------------------------Private------------------------------------------");
        System.out.println("The code is only accessible within the declared class.");
        System.out.println();

    }

    void defaultMethod(){
        System.out.println("------------------------------------Default------------------------------------------");
        System.out.println("The code is only accessible in the same package.");
        System.out.println();
    }

    void protectedMethod(){
        System.out.println("-------------------------------------Protected---------------------------------------");
        System.out.println("The code is accessible in the same package and subclasses.");
        System.out.println("What is subclass?");
        System.out.println("Subclass: "+" "+"The derived class (the class that is derived from another class) is called a subclass. ");
        System.out.println("here we r using extends keyword for this.");
        System.out.println();
    }

    void note(){
        System.out.println("-------------------------------------Note--------------------------------------------");
        System.out.println("Same defination use for Attributes");
        System.out.println("-------------------------------------------------------------------------------------");

    }

    public static void main(String[] args) {
        ModifiersInMethods modifiersInMethods = new ModifiersInMethods();
        modifiersInMethods.publicMethod();
        modifiersInMethods.privateMethod();
        modifiersInMethods.defaultMethod();
        modifiersInMethods.protectedMethod();
        modifiersInMethods.note();


    }
}
