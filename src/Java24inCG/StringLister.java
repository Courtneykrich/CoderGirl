package Java24inCG;
import java.util.*;
import static java.lang.System.out;


public class StringLister {
    String[]names ={"Carly","Sam","Kiki","Lulu","Hayden","Elizabeth","Kristina","Molly","Laura"};

    public StringLister(String[] morenames){
        ArrayList<String> list = new ArrayList<String>();
        for (int i =0; i < names.length; i++){
            list.add(names[i]);
        }
        for (int i = 0; i < morenames.length; i++){
            list.add(morenames[i]);
        }
        Collections.sort(list);
        for (String name : list){
            out.println(name);
        }
    }
    public static void main(String[]args){
        StringLister lister = new StringLister(args);
    }
}
