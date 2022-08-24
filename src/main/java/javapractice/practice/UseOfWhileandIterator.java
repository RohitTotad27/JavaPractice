package javapractice.practice;

import java.util.ArrayList;
import java.util.Iterator;

public class UseOfWhileandIterator {

    public static void main(String[] args) {
        ArrayList<String> l = new ArrayList<String>();
        l.add("A");
        l.add("B");
        l.add("C");
        l.add("D");
        Iterator it=l.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    
}
}