/*
 * Victor Dodan / 002
 *
 * This java file contains several simple tree problems that need to be
 * codified. These routines  must use the TreeMap and TreeSet library
 * classes from the Java Collection Framework.
 *
 */

import java.util.*;

public class TreeProblems {

    /**
     * Method different()
     *
     * Given two TreeSets of integers, return a TreeSet containing all elements
     * that are NOT in both sets. In other words, return a TreeSet of all the
     * elements that are in one set but not the other.
     */

    public static Set<Integer> different(Set<Integer> setA, Set<Integer> setB) {

        Set<Integer> copyA = new TreeSet<>();
        copyA.addAll(setA);
        copyA.removeAll(setB);

        Set<Integer> copyB = new TreeSet<>();
        copyB.addAll(setB);
        copyB.removeAll(setA);

        copyA.addAll(copyB);
        return copyA;

        // This can be done numerous ways, but once such will only that
        // *several* lines of code. Hint: create two temporary TreeSets and utilize the
        // methods retainAll(), addAll(), and removeAll(). But in the end, get something to work.

    }


    /**
     * Method removeEven()
     *
     * Given a treeMap with the key as an integer, and the value as a String,
     * remove all <key, value> pairs where the key is even.
     */

    public static void removeEven(Map<Integer, String> treeMap) {

        Iterator<Map.Entry<Integer,String>> iterator = treeMap.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<Integer, String> x = iterator.next();
            if (x.getKey()%2 == 0) iterator.remove();
        }

    }


    /**
     * Method treesEqual()
     *
     * Given two treeMaps, each with the key as an integer, and the value as a String,
     * return a boolean value indicating if the two trees are equal or not.
     */

    public boolean treesEqual(Map<Integer, String> tree1,Map<Integer, String> tree2 ) {

        for(Map.Entry<Integer, String> x : tree1.entrySet()){
            if(!(tree2.containsKey(x.getKey()) && tree2.containsValue(x.getValue()))) return false;
        }

        return true;

    }

} // end treeProblems class
