package com.yu.day3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo {
    public static void main(String[] args) {
        Collection<String> c=new ArrayList<String>();
        c.add("hello");
        c.add("word");
        c.add("java");
        boolean con = c.contains("jaa");
        System.out.println(c.hashCode());
        System.out.println(con);
        System.out.println(c);
        Iterator<String> it = c.iterator();
        Collection<String> c2=new ArrayList<String>();
        boolean b = c2.addAll(c);
        System.out.println(b);
        System.out.println(c2);



    }
}
