package StringTask;

public class StringMain {
    public static void main(String[] args) {
        StringImp stringimp = new StringImp();
        int countvowels = stringimp.countvowels("hello");
        System.out.println("totalvowels=" + countvowels);
        String uniquevowels = stringimp.Uniquevowel("good morning everyone");
        System.out.println("uniquevowels=" + uniquevowels);
        String reversestring = stringimp.reversestring("ruchitha");
        System.out.println("reverse string=" + reversestring);
        String orderedstring = stringimp.orderedstring("good day");
        System.out.println("orderedstring=" + orderedstring);
        String subtractedstring = stringimp.subtractedstring("ruchitha", "hit");
        System.out.println("subtractedstring=" + subtractedstring);
        double changetonumberstring = stringimp.changetonumberstring("2289-89");
        System.out.println("change to number string=" + changetonumberstring);
        String parts = stringimp.partslengthgreaterthan3("hello-no-good-mor-ruchitha");
        String divide[] = parts.split(",");
        for (String part : divide) {
            System.out.println(part+",");

        }
        }
    }
