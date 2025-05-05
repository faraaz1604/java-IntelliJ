package Map.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Student {

    private String name;
    private Integer id;

    public Student(String name, Integer id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

    @Override
    public boolean equals(Object o) {
        if(this == o)return true;
        if(o == null || this.getClass() != o.getClass())return false;
        Student s = (Student) o;
        return id == s.id && name.equals(((Student) o).name);
    }

    public static void main(String[] args) {

        Map<Student, String> studentMap = new HashMap<>();

        Student s1 = new Student("Faraaz", 89);
        Student s2 = new Student("Faraaz", 89);

        studentMap.put(s1,"PASS");

        System.out.println(studentMap.get(s2));
    }
}
