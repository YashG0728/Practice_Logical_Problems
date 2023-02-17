package OopsConceptLearning.encapsalation;

public class LearnEncapsalation {
    String name;
    private String sec;

    public String getSec() {
        return sec;
    }

    public void setSec(String sec) {
        this.sec = sec;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public static void main(String[] args) {
        LearnEncapsalation learnEncapsalation = new LearnEncapsalation();
        learnEncapsalation.setName("bharat");
        learnEncapsalation.setSec("sparsh");
        System.out.println(learnEncapsalation.getName());

    }
}
//
//    String name;
//    String sec;
//
//    @Override
//    public String toString() {
//        return "LearnEncapsalation{" +
//                "name='" + name + '\'' +
//                ", sec='" + sec + '\'' +
//                '}';
//    }
//
//    public static void main(String[] args) {
//        LearnEncapsalation learnEncapsalation = new LearnEncapsalation();
//        learnEncapsalation.name="bharat";
//        learnEncapsalation.sec="sparsh";
//        System.out.println(learnEncapsalation);
//
//    }