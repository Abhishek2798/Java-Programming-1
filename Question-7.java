class Triangle<T extends Number>{

    public double areaTriangle(T x,T y, T z) {
        double a = x.doubleValue();
        double b = y.doubleValue();
        double c = z.doubleValue();

        if (a<0||b<0||c<0) return 0;

        double s = (a + b + c) / 2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-b));
    }

}
public class abhi {
    public static void main(String[] args) {
            System.out.println("Area : " + new Triangle().areaTriangle(1,2,3));
            System.out.println("Area : " + new Triangle().areaTriangle(1.11d,5.14d,64d));
            System.out.println("Area : " + new Triangle().areaTriangle(1.45f,8.56f,6.45f));
            System.out.println("Area : " + new Triangle().areaTriangle(5,6.12d,8.45f));
    }
}
