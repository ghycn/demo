import model.Student;
import org.junit.Test;

import java.util.*;

public class CollectionTest {
    @Test
    public static void main(String[] args) {
        LinkedList<Student> list = new LinkedList<Student>();
        Set<Student> set = new HashSet<Student>();
        Student stu1  = new Student(3,"张三");
        Student stu2  = new Student(3,"张三");
        System.out.println("stu1 == stu2 : "+(stu1 == stu2));
        System.out.println("stu1.equals(stu2) : "+stu1.equals(stu2));
        list.add(stu1);
        list.add(stu2);
        System.out.println("list size:"+ list.size());

        set.add(stu1);
        set.add(stu2);
        System.out.println("set size:"+ set.size());
    }

    @Test
    public void test(){
        Map<String,String> map = new HashMap<>();
        map.put("a","abc");
        map.put("b","abc");
        map.put("c","abc");
        for(Map.Entry<String,String> m:map.entrySet()  ){
            System.out.println(m.getKey());
            System.out.println(m.getValue());
        }
        Map map1= Collections.synchronizedMap(new HashMap<>());
    }

}
