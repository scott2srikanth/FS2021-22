package datastructures.queue;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

class Student implements Comparable<Student> {
    private int rank;
    private String name;
    Student(int rank, String name){
        this.rank=rank;
        this.name=name;
    }

    public int compareTo(Student st){
        if(rank<st.rank)
            return -1;
        else if(rank>st.rank)
            return 1;
        else
            return 0;
    }

    public String toString(){
        return "Name: "+ name +", Rank: "+rank;
    }
}
public class PQDemo2 {
    public static void main(String[] args) {
        Student s1 = new Student(11,"Scott");
        Student s2 = new Student(2,"Ram");
        Student s3 = new Student(8,"Bob");
        Student s4 = new Student(15,"Raj");
        Student s5 = new Student(1,"Sita");

        PriorityQueue<Student> sl = new PriorityQueue<>();
        sl.add(s1);
        sl.add(s2);
        sl.add(s3);
        sl.add(s4);
        sl.add(s5);
/*
        PriorityQueue<Long> min = new PriorityQueue<>(new Comparator<Long>() {
            public int compare(Long l1, Long l2) {
                return Long.compare(l1, l2);
            }
        });

        PriorityQueue<Long> max = new PriorityQueue<>(new Comparator<Long>() {
            public int compare(Long l1, Long l2) {
                return Long.compare(l2, l1);
            }
        });
*/

        sl.forEach(a->System.out.println(a));

        System.out.println(sl.poll());
        System.out.println(sl.poll());
        System.out.println(sl.poll());
        System.out.println(sl.poll());

    }

}
