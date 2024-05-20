import java.util.*;

public class ListEx {
    public static void main(String[] args){
        ListEx experiment=new ListEx();
        experiment.start();
    }
    public void start(){
        List<String> names=new ArrayList<>();
        names.add("ruchi");
        names.add("raj");
        names.add("bhavi");
        names.add("jisha");
        Collections.sort(names);
        displaynames(names);
        String fetch=names.get(1);
        System.out.println("name="+fetch+"size="+names.size());
        names.remove(2);
        System.out.println("size="+names.size());
        names.set(0,"ruchitha chamatam");
        String name=names.get(0);
        System.out.println("name="+name);
        System.out.println("size="+names.size());
    }
    public void displaynames(List names){
        for(Object l:names){
            System.out.println(l);

        }
    }
}
