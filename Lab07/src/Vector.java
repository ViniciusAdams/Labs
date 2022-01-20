import java.util.Objects;

final class Vector implements Comparable <Vector> {
    private double a, b;

    Vector(double a0, double b0) {
        this.a = a0;
        this.b = b0;
    }

    //getters
    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public String toString() {
        return this.getA() + "I" + " + " + this.getB() + " j";
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Vector))
            return false;
        Vector vector = (Vector) obj;
        return Double.compare(vector.a, a) == 0 && Double.compare(vector.b, b) == 0;
    }

    //modifed equals method
    public boolean equals(Vector v) {
        if (this.getA() == v.getA() & this.getB() == v.getB()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(a, b);
    }


    public int compareTo(Vector v) {
        if (this.getB() == v.getB()) {
            if (this.getA() > v.getA()) {
                return 1;
            } else {
                return -1;
            }
        } else if (this.getA() == v.getA()) {
            if (this.getB() > v.getB()) {
                return 1;
            } else {
                return -1;
            }
        } else {
            return 0;
        }
    }
}
