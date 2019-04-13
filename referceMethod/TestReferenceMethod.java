package BIT.referceMethod;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:
 * User:Mr.Du
 * Date:2019-04-13
 * Time:11:02
 */
public class TestReferenceMethod {
    public static void main(String[] args) {

        //第一种方法   引用静态方法    类名::方法名称
        IUilt<String,Integer> iuilt = String::valueOf;
        String str = iuilt.print(100);
        System.out.println(str.length());

        //第二种方法   引用对象方法    实例对象::普通方法
        String s = "hello";
        IUilt1<String> stringIUilt1 = s::toUpperCase;
        System.out.println(stringIUilt1.print());

        //第三种方法   引用某个特定类的方法    类名称::普通方法
        IUilt2<Integer,String> stringStringIUilt2 = String::compareTo;
        System.out.println(stringStringIUilt2.print("asas","asas"));

        //第四种方法   引用构造方法    类名称::new
        IUilt3<Person1,String,Integer> personStringIUilt3 = Person1::new;
        System.out.println(personStringIUilt3.createPerson("name",18));
    }
}

@FunctionalInterface
interface IUilt3<A,B,C>{
    A createPerson(B b, C c);
}

class Person1{
    private String name;
    private int age;

    public Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

@FunctionalInterface
interface IUilt2<P,R> {
    P print(R r, R s);
}

@FunctionalInterface
interface IUilt1<P>{
    P print();
}

@FunctionalInterface
interface IUilt<P,R>{
    P print(R r);
}
