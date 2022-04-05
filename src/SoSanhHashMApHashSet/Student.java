package SoSanhHashMApHashSet;

import java.util.HashMap;
import java.util.Map;

public class Student {
    private String name;
    private int age;
    private String address;

    public Student() {
    }
    public Student(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
    public static class Language extends Student {
        private String language;

        public Language(String language) {
            this.language = language;
        }

        public Language(String name, int age, String address, String language) {
            super(name, age, address);
            this.language = language;
        }

        public Language() {
        }

        @Override
        public String toString() {
            return "Language{" +
                    "name='" + super.name + '\'' +
                    ", age=" + super.age +
                    ", address='" + super.address + '\'' +
                    ", language='" + language + '\'' +
                    '}';
        }

        public static void main(String[] args) {
            Student.Language sl1=new Student.Language("java");
            Student.Language sl2=new Student.Language("c");
            Student.Language sl3=new Student.Language("php");
            Student.Language sl4=new Student.Language("c++");
            Map<Integer, Student.Language> l1 = new HashMap<Integer,Student.Language>();
            l1.put(1,sl1);
            l1.put(2,sl2);
            l1.put(3,sl3);
            l1.put(4,sl4);
            System.out.println("========="+"\n"+l1.get(3));
        }

    }
}
