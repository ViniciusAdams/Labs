import java.util.Arrays;
import java.util.Objects;d
final class Person implements Comparable<Person> {
    private final String prsi;
    private final String name;
    private final String dateOfBirth;

    //Constructor
    Person(String prsi, String name, String dateOfBirth) {
        this.prsi = prsi;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }
//getters
    public String getPrsi() {
        return prsi;
    }

    public String getName() {
        return name;
    }

    public String getDateOfBirth() {

        return dateOfBirth;
        @Override
        public boolean equals (Object ob){
            if (ob == null) {
                return false;
            }
            if (!ob instanceof Person)){
            return false;
            }
            Person p = (Person)ob;

            if (this.getPrsi().equals(p.getPrsi())) {
                return true;
            }
            else {
                return false;
            }
        }
            public String toString() {
                return this.getPrsi() + " " + this.getName() + " " + this.getDateOfBirth();
            }
            public int hashCode (){
                return super.hashCode();
        }
                    public int compareTo (Person Person) {
            return this.getPrsi().compareTo(Person.getPrsi());
        }
        }
}