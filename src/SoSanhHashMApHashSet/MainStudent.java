package SoSanhHashMApHashSet;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MainStudent {
    public static void main(String[] args) {
        Student student1 = new Student("Thành",19,"PT");
        Student student2 = new Student("Mạnh",20,"HN");
        Student student3 = new Student("Nhung",19,"HN");
        Student student4 = new Student("Hoàng",21,"HP");
        Map<Integer,Student> MApStudent = new HashMap<Integer,Student>();
        MApStudent.put(1,student1);
        MApStudent.put(2,student2);
        MApStudent.put(3,student3);
        MApStudent.put(4,student4);
//        sắp xếp theo thứ tụ diền vào
        System.out.println("---------map");
        for (Map.Entry<Integer,Student> student: MApStudent.entrySet()) {
            System.out.println(student.toString());
        }
//        sắp xếp theo thứ tự random
        System.out.println("---------set");
        Set<Student> stundents = new HashSet<Student>();
        stundents.add(student1);
        stundents.add(student2);
        stundents.add(student3);
        stundents.add(student4);
        for (Student student : stundents
             ) {
            System.out.println(student.toString());

        }
    }
}
