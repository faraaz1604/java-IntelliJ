package MethodRefrence;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Main {

    public static int square(int n){
        return n * n;
    }

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(2, 4, 6);

        List<Integer> list = numbers.stream().map(Main::square).toList();

        list.forEach(System.out::println);

        List<String> names = Arrays.asList("Faraaz", "Ali", "John");

        names.stream().map(String::toUpperCase).forEach(System.out::println);


        Supplier<Car> createCar = Car::new;

        Car fastCar = createCar.get();

        List<String> studentNames = Arrays.asList("Ali", "Sara", "Tom");

        List<Student> studentList = studentNames.stream().map(Student::new).toList();

        System.out.println(studentList);

        List<String> countries = Arrays.asList("India", "usa", "Germany", "france");

        countries.sort(String::compareToIgnoreCase);

        System.out.println(countries);

        Message message = new Message();

        Display d = message::printMsg;
        d.show();


        List<String> personNames = Arrays.asList("Alice", "Bob", "Charlie");

        personNames.stream().map(Person::new).forEach(person -> System.out.println(person.name));




    }
}
