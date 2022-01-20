public class Converter {
    public static double celsiustofahrenheit(double celsius) {
        double f = (9.0 / 5) * celsius + 32;
        return f;
    }

    public static double fshrenheitTocelsius(double fahrenheit) {
        double c = (5.0 / 9) * (fahrenheit - 32);
        return c;
    }
    //f = (c * 9.0/5.0) + 32, c = (f – 32)*5.0/9.0, k = 1.609*m, m = k
    ///1.609
    public static double kmtomile (double km){
     double miles = 1609 * km;
    return miles;
    }
    public static double milestokm (double miles){
      double  km = 0.621371 * miles;
      return km;
    }
}


