/*Question 1
        Static members are often used to represent data or calculations that do not change in response to
        object state. To illustrate this, write a class called Converter that has static methods that convert
        Fahrenheit to Celsius, Celsius to Fahrenheit, miles to kilometers and kilometers to miles. The
        formulas in each case are: f = (c * 9.0/5.0) + 32, c = (f – 32)*5.0/9.0, k = 1.609*m, m = k
        /1.609. Use constants to represent the number in the formulae. Write a simple program to test your
class. Also make sure that the parameter values passed to methods are valid.*/

public class Assignment8 {
//f = (c * 9.0/5.0) + 32, c = (f – 32)*5.0/9.0, k = 1.609*m
final static  double v1 = 9.0;
final static double v2 = 5.0;
final static int point =32;
final static double distance = 1.609;

public static double CtoF (double c){
    return (c *v1/v2) + point;
}
public static double MtoKm(double k){
    return k/distance;
}
public static void main (String[]args){
    System.out.println (CtoF(30.5));
    System.out.println (MtoKm(34.5));

}

}
