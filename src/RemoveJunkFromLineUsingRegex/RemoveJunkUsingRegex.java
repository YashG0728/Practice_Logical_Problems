package RemoveJunkFromLineUsingRegex;

public class RemoveJunkUsingRegex {
    public static void main(String[] args) {
        String sentence = "Hello !@##%$%^&^*&(*&)(* Yash 28091998";
        sentence = sentence.replaceAll("[^a-zA-Z-0-9]","");
        System.out.println(sentence);
    }
}
