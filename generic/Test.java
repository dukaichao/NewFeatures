package BIT.generic;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:
 * User:Mr.Du
 * Date:2019-04-13
 * Time:15:04
 */
public class Test {
    public static void main(String[] args) {
        IMessage<String> im = new MessageImpl();
        im.print("hh");
    }
}
