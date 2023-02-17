package OopsConceptLearning.modifiers.acessmodifiersforclasses;

public class PublicKeywordWithClass {
    String define;

    public PublicKeywordWithClass(String define) {
        this.define = define;
    }

    public static void main(String[] args) {
        PublicKeywordWithClass acessmodifiers = new PublicKeywordWithClass("Public class: The class is accessible in any other class and package");
        System.out.println(acessmodifiers.define);
    }
}
