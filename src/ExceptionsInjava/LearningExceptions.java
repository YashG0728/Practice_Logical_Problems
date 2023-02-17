package ExceptionsInjava;

class ArithmaticExceceptionThrow extends Exception {
    @Override
    public String toString() {
        return "Radius Cannot be negative...";
    }

    @Override
    public String getMessage() {
        return "Radius Cannot be negative...!!!";
    }
}

public class LearningExceptions {

    public static double area(int radius) throws ArithmaticExceceptionThrow {
        if(radius<0){
            throw new ArithmaticExceceptionThrow();
        }
        double result = Math.PI * radius * radius;
        return result;
    }

    public static void main(String[] args) throws ArithmaticExceceptionThrow{

            double var = area(-6);
            System.out.println(var);

            System.out.println("Radius cannnot negative Something is wrong");


        System.out.println("I am learning java");
    }
}