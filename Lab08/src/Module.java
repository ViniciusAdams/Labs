/*
 * Assignment 08
 *
 * Student name:Vinicius Eduardo Adams de Castro
 * Student number:3052655
 *
 */
import java.util.*;
class Module implements Comparable<Module>{
    private String title;
    private String lecturer;
    private int hours;

    Module(String t, String l, int h){
        title = t; lecturer = l; hours = h;
    }

    public String title(){
        return title;
    }
    String lecturer(){
        return lecturer;
    }

    int hours(){
        return hours;
    }

    public boolean equals(Object ob){
        if(!(ob instanceof Module))
            return false;
        Module m = (Module)ob;
        return title.equals(m.title);
    }

    public int hashCode(){
        return title.hashCode();
    }

    public String toString(){
        return title+" "+lecturer+" "+hours;
    }

    public int compareTo(Module m){
    }

    public static Comparator<Module> lectCompare(){
    }
}
