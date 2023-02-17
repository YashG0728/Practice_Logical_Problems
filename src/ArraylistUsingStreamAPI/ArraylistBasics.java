package ArraylistUsingStreamAPI;

import java.util.ArrayList;
import java.util.List;

public class ArraylistBasics {
    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();
        names.add("Sans");
        names.add("Mahesh");
        names.add("Bharat");
        names.add("Hemant");
        names.add("Vishal");
        //Using Stream and Lambda expression
        long count = 0;
        for (String str : names) {
            if (str.length() < 5) {
                count++;
            }
        }
        System.out.println(count+" strings with length less than 5");

        long count1 = names.stream().filter(e -> e.length()<5).count();
        System.out.println("Stream api "+ count1);

    }
}
