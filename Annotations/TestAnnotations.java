package BIT.Annotations;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:
 * User:Mr.Du
 * Date:2019-04-13
 * Time:9:51
 */
public class TestAnnotations {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        new Person().fun();
    }
}

class Person{
    public Person(){
        System.out.println("弟弟");
    }
    @Deprecated
    public void fun(){
        System.out.println("很秀");
    }

    public void fun(String s){
        System.out.println(s);
    }
}
