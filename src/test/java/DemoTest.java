import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DemoTest {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "b");
        list.add("c");
        System.out.println(list);
        Set set = new HashSet();
        Person person = new Person();
        person.setName("XIA");
        set.add(person);
        person.setName("Jay");
        System.out.println(set.contains(person));
        System.out.println(set.remove(person));
        System.out.println(set.size());
    }
}
