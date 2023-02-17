package OopsConceptLearning.constructor;

public class ParaConstructor {
    int id;
    String name;

    public ParaConstructor(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) {
        ParaConstructor paraConstructor = new ParaConstructor(7, "Sparsh");
        System.out.println(paraConstructor.id + " " + paraConstructor.name);
    }
}
