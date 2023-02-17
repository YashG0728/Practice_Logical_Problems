package OopsConceptLearning.modifiers.nonacessmodifiersforclass.finalkeywordinclass;

final class NonAcessModifiersInClassWithFinalkeyword {
    void method(){
         System.out.println("The class cannot be inherited by other classes");
    }

    public static void main(String[] args) {
        NonAcessModifiersInClassWithFinalkeyword nonAcessModifiersInClass = new NonAcessModifiersInClassWithFinalkeyword();
        nonAcessModifiersInClass.method();
    }
}
