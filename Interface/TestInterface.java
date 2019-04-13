package BIT.Interface;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:
 * User:Mr.Du
 * Date:2019-04-13
 * Time:10:10
 */
public class TestInterface {
    public static void main(String[] args) {
        Sub sub = Sub.getInstance();
        System.out.println(Sub.i);
        System.out.println(sub.sub(10,5));
        sub.print();
    }
}

//jdk1.8前这样定义接口
interface  Add{
    //里面只能定义抽象方法和常量
    int add(int x, int y);
}

//jdk1.8后这样定义接口
interface Sub{
    int i = 0;
    int sub(int x, int y);
    default void print(){
        System.out.println("java新特性");
    }
    static Mmp getInstance(){
        return new Mmp();
    }
}

class Mmp implements Add, Sub {

    @Override
    public int add(int x, int y) {
        return x + y;
    }

    @Override
    public int sub(int x, int y) {
        return x - y;
    }
}
