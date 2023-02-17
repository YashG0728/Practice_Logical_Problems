package OopsConceptLearning.encapsalation;

public class LearnEncapsalationGS {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        LearnEncapsalation learnEncapsalation = new LearnEncapsalation();
        learnEncapsalation.setName("Smruti");
        System.out.println(learnEncapsalation.getName());
    }
}
