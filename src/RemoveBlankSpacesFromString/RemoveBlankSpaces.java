package RemoveBlankSpacesFromString;

public class RemoveBlankSpaces {
    public static void main(String[] args) {
        String str = "Java programming for remove strings spaces";
        str= str.replaceAll("\\s","");
        System.out.println("After Removing: "+ str);
        
    }
}
