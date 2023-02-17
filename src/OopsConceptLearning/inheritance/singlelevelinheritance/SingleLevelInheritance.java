package OopsConceptLearning.inheritance.singlelevelinheritance;

public class SingleLevelInheritance {
public void methodA(){

    System.out.println("----------------single level inheritance");
    System.out.println("Parent class method");
    System.out.println("As the name suggests, this type of inheritance occurs\n" +
            " for only a single class. Only one class is derived from the parent\n" +
            " class. In this type of inheritance, the properties are derived\n" +
            " from a single parent class and not more than that. As the properties\n" +
            " are derived from only a single base class the reusability of a code is\n" +
            " facilitated along with the addition of new features. The flow diagram of\n" +
            " a single inheritance is shown below:");
    }
}

class MethodB extends SingleLevelInheritance{
    public void methodB(){
        System.out.println("Child class method");
    }

    public static void main(String[] args) {
        SingleLevelInheritance singleLevelInheritance = new SingleLevelInheritance();
        singleLevelInheritance.methodA();
//        singleLevelInheritance.methodB(); //we cannot access child class method by using parent class object
        MethodB methodB = new MethodB();
        methodB.methodB();
        methodB.methodA();
    }
}
