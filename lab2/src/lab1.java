import java.util.Scanner;
public class lab1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x, y, z;
        System.out.print("Введите координаты первой точки.\n>>> ");
        x = in.nextDouble();
        y = in.nextDouble();
        z = in.nextDouble();
        Point3d a = new Point3d(x,y,z);
        System.out.print("Введите координаты второй точки.\n>>> ");
        x = in.nextDouble();
        y = in.nextDouble();
        z = in.nextDouble();
        Point3d b = new Point3d(x,y,z);
        System.out.print("Введите координаты третьей точки.\n>>> ");
        x = in.nextDouble();
        y = in.nextDouble();
        z = in.nextDouble();
        Point3d c = new Point3d(x,y,z);
        // Если одна из точек равна другой то площадь не вычисляется
if (a.isEqual(b) || b.isEqual(c) || c.isEqual(a)) {
    System.out.println("Это не треугольник");
} else System.out.printf("Площадь треугольника: %.2f %n ", computeArea(a,b,c));
    }
    public static double computeArea(Point3d p1, Point3d p2, Point3d p3) {
            double x = p1.distanceTo(p2);
            double y = p2.distanceTo(p3);
            double z = p3.distanceTo(p1);
            double p = (x+y+z)/2;
            return (Math.sqrt(p*(p-x)*(p-y)*(p-z)));
    }
}
