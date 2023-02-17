package OopsConceptLearning.inheritance.learninheritanceexample;

class LearnInheritance {                //parent
    void method(){
        System.out.println("I am parent class...!");
    }
}
class ChildClass extends LearnInheritance{ //child class
    public static void main(String[] args) {
        LearnInheritance learnInheritance = new LearnInheritance();
        learnInheritance.method();
        ChildClass childClass = new ChildClass();
        childClass.method();
    }
}
