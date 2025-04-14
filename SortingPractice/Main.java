package SortingPractice;

import java.time.LocalDate;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Students> studentsList = new ArrayList<>(Arrays.asList(
                new Students("Faraaz",25,98.02),
                new Students("Sam",10,89.98),
                new Students("Nush",23,59.00),
                new Students("jhon",15,33.09))
        );

        Collections.sort(studentsList);

       for (Students student : studentsList){
           System.out.println(student);
       }

       studentsList.sort((s1,s2)->s1.name.compareTo(s2.name));
        System.out.println(studentsList);

        System.out.println("--------------------8th problem---------------------------------");

        studentsList.sort(Comparator.comparing(Students::getMarks).thenComparing(Students::getName));
        System.out.println(studentsList);


        System.out.println("--------------------2nd product---------------------------------");


        List<Product> products = Arrays.asList(
                new Product("Phone", 25000.23, "5-start"),
                new Product("Book", 120.00, "5-start"),
                new Product("Rubix-Cube", 250.90, "4-start"),
                new Product("Laptop", 55000.23, "5-start")
        );

        products.sort(new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return Double.compare(o2.price, o1.price);
            }
        });

        for (Product product : products){
            System.out.println(product);
        }

        System.out.println("-----------------------3rd problem-----------------");

        List<String> names = new ArrayList<>(List.of("Faraazz","dmai","Dultan","bajaja"));

        names.sort((n1, n2) -> Integer.compare(n1.length(), n2.length()));
        System.out.println(names);

        System.out.println("------------------------4th problem-------------------");

        List<Employee> employees = Arrays.asList(
                new Employee("Faraaz", 90000.00),
                new Employee("rahul", 30000.00),
                new Employee("Sanjay", 100000.00),
                new Employee("apple", 100000.00),
                new Employee("Apple", 100000.00)
        );

        employees.sort((e1,e2) -> e1.name.compareToIgnoreCase(e2.name));
        System.out.println(employees);

        System.out.println("-------------------------Book 5th problm--------------------");

        List<Book> books = Arrays.asList(
                new Book("Adventure", "faraaz"),
                new Book("Sci-fi", "faraaz"),
                new Book("Horror", "sanjay"),
                new Book("Comedy", "Prakash")
        );

        books.sort((b1,b2) -> {
            int comAuthor = b1.author.compareTo(b2.author);
            if (comAuthor != 0) return comAuthor;
            return b1.title.compareTo(b2.title);

        });

        for (Book book: books){
            System.out.println(book);
        }

        System.out.println("-------------------------Integer 6th problm--------------------");

        List<Integer> integerList = new ArrayList<>(Arrays.asList(11,23,43,55,20,59,100));

        integerList.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(n -> System.out.print(n + ", "));

        System.out.println();

        integerList.sort((n2, n1) -> Integer.compare(n1,n2));
        System.out.print(integerList + ", ");

        integerList.sort(Comparator.reverseOrder());
        System.out.print(integerList + ", ");


        System.out.println("-------------------------Integer 7th problm--------------------");

        List<User> users = new ArrayList<>(Arrays.asList(
                new User("Faraaz", LocalDate.now()),
                new User("anju", LocalDate.now()),
                new User("Manoj", LocalDate.now().minusDays(20)),
                new User("Sanjay", LocalDate.now().minusYears(2)),
                new User("Prakash", LocalDate.now().minusMonths(200))
        )
        );

        users.sort((u1,u2) -> {
            int sortDates = u1.signupDate.compareTo(u2.signupDate);
            if (sortDates != 0) return sortDates;
            return u1.name.compareToIgnoreCase(u2.name);
        });

        for(User user : users){
            System.out.println(user);
        }



    }
}
