import java.util.Comparator;

public class Module implements Comparable <Module> {
    private String title;
    private String lecturer;
    private int hours;


    Module(String nt, String nl, int nh) {
        title = nt;
        lecturer = nl;
        hours = nh;
    }

    public String title() {
        return title;
    }

    public String lecturer() {
        return lecturer;

    }

    int hours() {
        return hours;
    }

    public boolean equals(Object ob) {
        if (!(ob instanceof Module))
            return false;
        Module m = (Module) ob;
        return title.equals(m.title);
    }

    public int hashCode() {
        return title.hashCode();
    }

    public String toString() {
        return title + "" + lecturer + "" + hours;
    }

    public int compareTo(Module module) {
        return (this.hours - module.hours);
    }

    public static Comparator<Module> lectCompare = new Comparator<Module>() {

        @Override
        public int compare(Module o1, Module o2) {
            return o1.lecturer.compareTo(o2.lecturer);


        }
            };
        }


