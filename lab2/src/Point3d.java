import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
public class Point3d extends Point2d {
    private double zCoord;
    //Конструктор инициализации
    public Point3d(double x, double y, double z) {
        super(x,y);
        zCoord = z;
    }
//Конструктор по умолчанию
    public Point3d() {
        this(0, 0,0);
    }
    public void setZ(double c) {zCoord = c;}
    public double getZ() {return zCoord;}
    // Проверка координат точек на идентичность
    public boolean isEqual(Point3d point) {
        if (this.getX() == point.getX()) {
            if (this.getY() == point.getY()) {
                if (this.getZ() == point.getZ()) {
                    return true;
                }
            }
        }
        return false;
    }
    // Возвращает расстояние между двумя точками
    public double distanceTo(Point3d p) {
        return sqrt(pow(p.getX() - this.getX(), 2) + pow(p.getY() - this.getY(), 2) + pow(p.getZ() - this.getZ(), 2));
    }
}
