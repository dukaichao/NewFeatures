package BIT.generic;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:
 * User:Mr.Du
 * Date:2019-04-13
 * Time:14:23
 */
public class Wildcard {
    public static void main(String[] args) {
        Message<String> msg = new Message<>();
        msg.setMessage("99");
        fun(msg);
        Message<Integer> msg1 = new Message<>();
        msg1.setMessage(199);
        fun(msg1);

        Message1<Number> msg2 = new Message1<>();
        msg2.setMessage(10.0);
        fun(msg2);


    }

    public static void fun(Message<?> msg){
        System.out.println(msg.getMessage());
    }

    public static void fun(Message1<? super Double> msg){
        msg.setMessage(1000.0);
        System.out.println(msg.getMessage());
    }
}

class Message1<T extends Number>{
    //设置泛型上限
    private  T message;
    public T getMessage(){
        return message;
    }

    public void setMessage(T message) {
        this.message = message;
    }
}
class Message<T>{
    private  T message;
    public T getMessage(){
        return message;
    }

    public void setMessage(T message) {
        this.message = message;
    }
}
