package BIT.generic;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:
 * User:Mr.Du
 * Date:2019-04-13
 * Time:15:04
 */
public class MessageImpl<T> implements IMessage<T>{
    @Override
    public void print(T t) {
        System.out.println(t);
    }
}
