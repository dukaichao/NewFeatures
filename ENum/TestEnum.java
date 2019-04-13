package BIT.ENum;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:
 * User:Mr.Du
 * Date:2019-04-13
 * Time:9:02
 */
public class TestEnum {
    public static void main(String[] args) {
        System.out.println(Color.getInstance(2));
        System.out.println(Color1.BLUE);
    }
}

enum Color1{
    RED,BLUE,YELLOW
}

//用多例实现该方法不足之处在于修改源码，违背了OCP原则，Java新特性给我们引出enum(枚举)
class Color {
    private String title;
    private static final int RED_FLG = 1;
    private static final int BLUE_FLG = 2;
    private static final int YELLOW_FLG = 3;
    private Color(String title){
        this.title = title;
    }
    private static Color RED = new Color("红色");
    private static Color BLUE= new Color("绿色");
    private static Color YELLOW = new Color("黄色");

    public static Color getInstance(int ch){
        switch(ch){
            case RED_FLG:
                return RED;
            case BLUE_FLG:
                return BLUE;
            case YELLOW_FLG:
                return YELLOW;
            default:
                return null;
        }
    }

    @Override
    public String toString() {
        return "Color{" +
                "title='" + title + '\'' +
                '}';
    }
}
