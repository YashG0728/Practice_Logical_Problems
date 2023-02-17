package CountCharacterInStrings;

public class CountCharactersInString {
    public static void main(String[] args) {
        String s = "Java Programming Java Oops";
//        int totalCount =s.length();
//        int totalCountAfterRemove = s.replace("J","").length();
//        int count = totalCount-totalCountAfterRemove;
//        System.out.println("Number Occurrance of a is: "+ count);
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.toLowerCase().charAt(i);
           if(ch=='j'){
               count++;
           }
        }
        System.out.println(count);
    }
}
