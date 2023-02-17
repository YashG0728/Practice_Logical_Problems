package OopsConceptLearning.modifiers.nonacessmodifiersforclass.methodsandattributesnonacesssmodifier.statickeyword;

public class Statickeyword {
    static void staticvoidmethod() {
        System.out.println("-----------Static Keyword------------");
        System.out.println("Attributes and methods belongs to the class, rather than an object");
        System.out.println("-----------------------------------");
    }

    public static void main(String[] args) {
        //here we dont need any object
        staticvoidmethod();
    }
}
