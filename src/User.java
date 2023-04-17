import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

public class User implements Div {
    private String name;
    private int age;


//    Object obj = new Object();
//    List<Integer> list = new ArrayList<>();

//    public void doSomething() {

    //...какая-то логика, доступная для всех потоков

//        BitSet bitSet = new BitSet();
//        for (int a : list) {
//            bitSet.set(a);
//        }
//        System.out.println("BitSet"+bitSet);
//        synchronized (this) {
//            System.out.println(name+" from Kyrgyzstan");
//            System.out.println(age+" "+name);
//            System.out.println(this);
    //логика, которая одновременно доступна только для одного потока
//        }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

//    public Object getObj() {
//        return obj;
//    }
//
//    public void setObj(Object obj) {
//        this.obj = obj;
//    }
//
//    public List<Integer> getList() {
//        return list;
//    }
//
//    public void setList(List<Integer> list) {
//        this.list = list;
//    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
