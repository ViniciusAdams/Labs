/*A module encapsulates three attributes: title of module, name of lecturer and the number of hours for delivery. An outline listing of the class and its attributes are given in the accompanying file. An equals method, a toString method and a hashCode are given. You are required to write a compareTo method that implements the Comparable<Module> interface and a Comparator that orders modules based on lecturer names. It should be called lectCompare and its signature is given as part of the class. Note: The following link is useful in solving this question:

https://www.journaldev.com/780/comparable-and-comparator-in-java-example.

The file Assignment8.java contains a short list of module instances. Write code to sort and print the list using both the natural ordering and the lecturer comparator.
*/

import java.util.*;
class Module implements Comparable<Module>{
    private String title;
    private String lecturer;
    private int hours;

    Module(String t, String l, int h){
        title = t;
        lecturer = l;
        hours = h;
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
    return (this.hours-m.hours);
    }
    public static Comparator <Module> lectCompare = new Comparator <Module>() {
    public int compare (Module m1,Module m2) {
    return m1.lecturer.compareTo(m2.lecturer);
    }
    };

}
