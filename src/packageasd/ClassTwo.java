package packageasd;

public class ClassTwo {
    ClassOne classOne = new ClassOne();
    public void create() {
        classOne.setFirstname("Smruti");
        classOne.setLastname("lingayat");
    }
    public void show(){
        System.out.println(classOne);
    }
    public void update(){
        if(classOne.getFirstname().equals("Smruti")){
            classOne.setFirstname("Kajol");
            classOne.setLastname("lingayat");
        }
    }
    public void delete(){
        if(classOne.getFirstname().equals("Kajol")){
           classOne = null;
        }
    }
}
