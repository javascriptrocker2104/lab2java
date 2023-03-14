//двумерный класс точки.
public class Point2d {
    private double xCoord;
    private double yCoord;
    //Конструктор инициализации
    public Point2d(double x, double y) {
        xCoord = x;
        yCoord = y;
    }
    //Конструктор по умолчанию
    public Point2d() {
        // Вызов конструктора с 2 параметрами
        this(0,0);
    }
    //Возвращение координат
    public double getX() {
        return xCoord;
    }
    public double getY() {
        return yCoord;
    }
    //Установка значений координат
    public void setX(double val) {
        xCoord = val;
    }
    public void setY(double val) {
        yCoord = val;
    }
}
