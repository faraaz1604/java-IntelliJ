package Lambda;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public interface Main {

    public static void main(String[] args) {

        Greeting g = () -> System.out.println("Good Morning Faraaz");
        g.greet();

//        Addable a = new Addable() {
//            @Override
//            public int add(int a, int b) {
//                return a+b;
//            }
//        };
//
//        System.out.println(a.add(5,10));
//    }

        Addable addable = (a,b) -> a + b;
        System.out.println(addable.add(10,20));

        Consumer<String> printer = msg -> System.out.println("hello "+ msg);
        printer.accept("Faraaz");

        Supplier<Integer> supplier = () -> 10;
        int result = supplier.get() * 2;
        System.out.println(result);

        Supplier<String > stringSupplier = () -> "Mohamed ";
        String rs = stringSupplier.get().toLowerCase()+"Faraaz";
        System.out.println(rs);

        Consumer<String> consumer = name -> System.out.println("hello " + name);
        consumer.accept("faraaz");

        Consumer<Integer> integerConsumer = num -> System.out.println(10 + num);
        integerConsumer.accept(10);

        Function<Integer, String> function = mul -> String.valueOf(mul*3);
        System.out.println(function.apply(2));

        Predicate<Integer> isEven = num -> num % 2 == 0;
        System.out.println(isEven.test(5));



    }


}
