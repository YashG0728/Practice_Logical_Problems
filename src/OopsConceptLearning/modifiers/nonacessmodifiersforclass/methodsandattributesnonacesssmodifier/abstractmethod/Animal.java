package OopsConceptLearning.modifiers.nonacessmodifiersforclass.methodsandattributesnonacesssmodifier.abstractmethod;

abstract class NonAcessModifier {
    //if we have a abstract method then we need abstract class
    abstract void abstractvoidmethod();

    void newmethod(){
        System.out.println("Concrete method");
    }
}

class Dog extends NonAcessModifier {
    @Override
    void abstractvoidmethod() {
        System.out.println("Can only be used in an abstract class, and can only be used on methods.\n" +
                "The method does not have a body, for example abstract void run();.\n" +
                "The body is provided by the subclass (inherited from). You will learn more about\n" +
                "inheritance and abstraction in the Inheritance and Abstraction chapters");
    }

    public static void main(String[] args) {
        Dog a = new Dog();
        a.abstractvoidmethod();
        a.newmethod();
    }
}
