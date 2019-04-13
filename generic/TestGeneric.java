package BIT.generic;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:
 * User:Mr.Du
 * Date:2019-04-13
 * Time:11:49
 */
public class TestGeneric {
    public static void main(String[] args) {
        //泛型之前只能这样写，传基本数据类型只能用Object接收
        Point p = new Point();
        p.setX(10.1);
        p.setY("sasa");
        double x = (double)p.getX();
        String s = (String)p.getY();
        System.out.println(x+","+s);
        System.out.println(p);
        //泛型
        Point1<Integer> point = new Point1<Integer>();
        point.setX(10);
        point.setY(1);
        int a = point.getX();
        int b = point.getY();
        System.out.println(a+" "+b);
        System.out.println(point);
        point.getInstance(1000);

    }
}

class Point1<T>{
    T x;
    T y;

    public T getX() {
        return x;
    }

    public void setX(T x) {
        this.x = x;
    }

    public T getY() {
        return y;
    }

    public void setY(T y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return
                "x=" + x +
                        ", y=" + y;
    }
    /*此T和类的泛型T不是一个，调用该方法时，T表示传入数据的类型，
    public <T> void getInstance(T t){
        System.out.println(t.equals(100));
    }*/
    //为了便于区别，我们一般把方法泛型和类的泛型分开去修饰
    public <E> void getInstance(E t){
        System.out.println(t.equals(100));
    }
}

class Point{
    Object x;
    Object y;

    public Object getX() {
        return x;
    }

    public void setX(Object x) {
        this.x = x;
    }

    public Object getY() {
        return y;
    }

    public void setY(Object y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return
                "x=" + x +
                ", y=" + y
                ;
    }
}
