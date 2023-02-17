package OopsConceptLearning.modifiers.acessmodifiersforclasses;

class DefaultClass {
    String define;

    public DefaultClass(String define) {
        this.define = define;
    }

    public static void main(String[] args) {
        DefaultClass defaultClass = new DefaultClass("Default class: The class is only accessible by classes in the same package.");
        System.out.println(defaultClass.define);
    }
}
