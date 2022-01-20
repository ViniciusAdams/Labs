import java.util.Arrays;

public class Assignment8 {
    public static void main(String[] args) {
        //Q1 Test =====================================
        //Test array

//Q1 Test =====================================
//Test array
            Module[] mlst = {
                    new Module("Programming","Donal",36),
                    new Module("Networks","Donal",36),
                    new Module("Graphics","Barry",36),
                    new Module("Web","Ruairi",36),
                    new Module("Hardware","Paddy",36),
                    new Module("Algorithms","Eoin",36),
                    new Module("OOP","Tony",36),
                    new Module("Maths","Paddy",36),
                    new Module("BigData","Osama",36)
            };

// Q1 end ======================================

// Q2 Test ======================================
            Arrays.sort(mlst);
            System.out.println("Default Sorting of Modules list:\n\n"+Arrays.toString(mlst));
// Q2 end =======================================

// Q3 Test ======================================
//sort employees array using Comparator by Name
            Arrays.sort(mlst, Module.lectCompare);
            System.out.println("\nModules list sorted by Lecturers :\n\n"+Arrays.toString(mlst));
        }
    }
