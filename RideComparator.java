package src.comparator;

// RideComparator.java

import src.pojo.Visitor;

import java.util.Comparator;

/*
* 自定义比较器 RideComparator，实现 Comparator 接口
* */
public class RideComparator implements Comparator<Visitor> {
    @Override
    public int compare(Visitor v1, Visitor v2) {
        // 示例：先按年龄排序，再按姓名排序
        if (v1.getAge() != v2.getAge()) {
            return v1.getAge() - v2.getAge();
        } else {
            return v1.getNickname().compareTo(v2.getNickname());
        }
    }
}
