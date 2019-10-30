package Test;

import DTO.Person;
import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {

        List<Person> list = Lists.newArrayList(new Person(10, "小李"), new Person(15, "小王"), new Person(22, "小明"));
        list.stream().forEach(e -> {
            System.out.println(e.getAge());
        });
        list.stream().collect()



    }
}
