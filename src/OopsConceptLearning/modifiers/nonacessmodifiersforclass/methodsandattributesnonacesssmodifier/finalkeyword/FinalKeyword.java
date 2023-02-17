package OopsConceptLearning.modifiers.nonacessmodifiersforclass.methodsandattributesnonacesssmodifier.finalkeyword;

public class FinalKeyword {
    final void finalvoidmethod(){
        System.out.println("-----------FinalKeyword------------");
        System.out.println("Attributes and methods cannot be overridden/modified");
        System.out.println("-----------------------------------");
    }

    public static void main(String[] args) {
        FinalKeyword finalKeyword = new FinalKeyword();
        finalKeyword.finalvoidmethod();
    }
}
