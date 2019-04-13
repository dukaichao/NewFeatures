package BIT.ENum;

import java.util.Arrays;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:
 * User:Mr.Du
 * Date:2019-04-13
 * Time:9:19
 */
public class TestEnum1 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Color2.values()));
        System.out.println(Color2.BLUE.ordinal()+" "+ Color2.BLUE.name());
        System.out.println(Color3.RED);
        System.out.println(Color4.YELLOW.ordinal()+" "+ Color4.YELLOW.name());
        IColor ic = Color4.BLUE;
        System.out.println(ic.getInstance());
    }
}

interface IColor{
    String getInstance();
}

enum Color4 implements IColor {

    RED("红色"),BLUE("蓝色"),YELLOW("黄色");
    private String title;
    private Color4(String title){
        this.title = title;
    }

    @Override
    public String toString() {
        return this.title;
    }
    @Override
    public String getInstance() {
        return this.title;
    }
}

//如果定义有很多内容，枚举类型必须写在首位
enum Color3{
    RED("红色"),BLUE("蓝色"),YELLOW("黄色");
    private String title;
    private Color3(String title){
        this.title = title;
    }

    @Override
    public String toString() {
        return this.title;
    }
}

//用enum修饰的类自动继承Enum类，并且自动重写Enum类中的name(),ordinal()方法；
//values()方法是获取枚举的所有对象
enum Color2{
    RED,BLUE,YELLOW
}
