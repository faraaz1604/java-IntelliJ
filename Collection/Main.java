package Collection;

import Collection.LinkedList.LinkedList;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(34);
        list.add(100);
        System.out.println(list.getFirst());
        System.out.println(list.size());

        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        list.forEach(System.out::println);

        System.out.println();

        for (Integer i: list){
            System.out.println(i);
        }

        boolean doesContain = list.contains(34);
        System.out.println(doesContain);

        list.remove(1);
        System.out.println(list);

        list.add(1,29);
        System.out.println(list);

        list.set(1,30);
        System.out.println(list);

        List<Student> students = new ArrayList<>();
        students.add(new Student("Faraaz", 9.8, 25));
        students.add(new Student("Pavan", 7.1, 22));
        students.add(new Student("Apple", 8.9, 25));
        students.add(new Student("Nithik", 9.0, 24));

//        Collections.sort(students);

        System.out.println(students);

        students.sort(new Comparator<Student>() {

            @Override
            public int compare(Student o1, Student o2) {
                int age =  Integer.compare(o1.getAge(), o2.getAge());
                if (age != 0) return age;
                return o1.getName().compareTo(o2.getName());
            }
        });

        System.out.println(students);

        students.sort((s1, s2) -> s1.getName().compareTo(s2.getName()));
        System.out.println("---------final--------------");

        students.sort(Comparator.comparing(Student::getName).thenComparing(Student::getGpa));
        System.out.println(students);

        students.sort(Comparator.comparing(Student::getGpa).reversed());

        List<Integer> nums = Arrays.asList(12,-2,33,34,56,21);

        int min = nums.stream()
                        .min(Integer::compareTo).get();
        int max = nums.stream()
                        .max(Integer::compareTo).get();

        System.out.println(min +" | "+ max);

        nums.sort((n1, n2) -> n1 - n2);
        System.out.println(nums.get(0));
        System.out.println(nums.get(nums.size()-1));

        LinkedList myList = new LinkedList();

        myList.add(20);
        myList.add(30);
        myList.add(40);
        myList.add(80);

        myList.printList();





    }
}
