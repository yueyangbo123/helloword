package Test;

import com.google.common.collect.Lists;

import java.util.List;
import java.util.stream.Collectors;

public class Test3 {

    public static void main(String[] args) {
        // 创建集合
        List<String> list = Lists.newArrayList("sdf", "a", "asdf", "d", "basdfgh");

        // 统计长度大于2的
        long count = list.stream().filter((s) -> s.length() > 2).count();

        // 将符合要求的放入集合
        List<String> list2 = list.stream().filter((s) -> s.length() > 2).collect(Collectors.toList());

        System.out.println(count);
        list2.forEach(System.out::println);
    }

}
