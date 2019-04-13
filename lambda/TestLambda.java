package BIT.lambda;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:
 * User:Mr.Du
 * Date:2019-04-13
 * Time:10:27
 */
public class TestLambda {
    public static void main(String[] args) {
        //传统面向对象过程
        IMessage message = new IMessage() {
            @Override
            public void print() {
                System.out.println("弟弟");
            }
        };
        message.print();
        //函数式编程
        IMessage im = ()-> System.out.println("haha");
        im.print();

        ITest itest = (x, y)-> x+y;
        System.out.println(itest.add(3,5));

        ITest1 itest1 = ()->{
            System.out.print("haha ");
            System.out.println("NB");
        };
        itest1.print();
    }
}

@FunctionalInterface
interface ITest1{
    void print();
}

@FunctionalInterface
interface  ITest{
    int add(int x, int y);
}

interface IMessage{
    void print();

}
