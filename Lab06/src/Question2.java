public class Question2 {

class Module implements Comparable <Module>{
    private String lecturer;
    private String title;
    private int hours;

    Module (String tn,String ln,int h){
        lecturer = ln;
        title=tn;
        hours =h;
    }

}
public String lecturer(){
    return lecturer();
}
public String title (){
    return title();
}
int hours(){
    return hours();
}
public boolean equals (Object ob){
    if(!(ob instanceof Module))
        return false;
    Module mo = (Module)ob;
    return title.equals(mo.title);
public int hashCode(){
    return title.hashCode();
    }
    public String toString (){
    return title +"" + lecturer +"" + hours;
    }

public int compareTo(Module mo){
return (this.hours - mo.hours);
    }

}
}
