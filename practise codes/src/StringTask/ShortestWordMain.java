package StringTask;

public class ShortestWordMain {
    public static void main(String[] args) {


    String[] strArray = new String[]{"ruchi","ruchitha","dad","monk" +
            ""};
    ShortestWord shortestword=new ShortestWord();
    String shortword=shortestword.findshortword(strArray);
        System.out.println("the shortest word "+shortword);
}
}
