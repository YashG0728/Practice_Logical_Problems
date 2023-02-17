package OopsConceptLearning.modifiers.nonacessmodifiersforclass.abstractclass;

abstract class AbstractKeywordInClass {

    void method(){
        System.out.println("The class cannot be used to create objects (To access an abstract class, it must be inherited from another class.");
    }
    public static void main(String[] args) {
         //AbstractKeywordInClass nonAcessModifiersInClassWithAbstractKeyword = new AbstractKeywordInClass();
        //we cant create a object when class is abstract

    }
}
