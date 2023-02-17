package OopsConceptLearning.constructor;

public class NonParaConstructor {
    int x;
    public NonParaConstructor(){
        x =6;
    }
    public static void main(String[] args) {
        NonParaConstructor nonParaConstructor = new NonParaConstructor();
        System.out.println(nonParaConstructor.x);

    }
}
