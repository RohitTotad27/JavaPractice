package javapractice.practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

public class IteratorEx {
    public static void main(String []args){
        ArrayList mylist = new ArrayList();
        mylist.add("Hello");
        mylist.add("Java");
        mylist.add("4");
        mylist.add("Hi How Are You!");
        Iterator it = mylist.iterator();
         while(it.hasNext()){
            // Object ele = it.
             System.out.println(it.next());

        }
    }
}
