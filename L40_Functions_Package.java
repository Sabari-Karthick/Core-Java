import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

/**
 * Types :
 * <p>
 * Function<T, R> : takes T as input and returns R --> Transform input to output
 * Eg: String to Integer4
 * <p>
 * Predicate<T> : takes T as input and returns boolean --> Used for conditional
 * checks Eg: Even or Odd
 * <p>
 * Consumer<T> : takes T as input and returns nothing --> Used for printing or
 * displaying Eg: Print a value
 * <p>
 * Supplier<T> : takes nothing as input and returns T --> Used to generate or
 * supply values Eg: Random Number
 * <p>
 * UnaryOperator<T> : takes T as input and returns T --> Used for operations on
 * a single operand Eg: Increment a number Eg: Increment a number or square a
 * number
 * <p>
 * BinaryOperator<T> : takes T, T as input and returns T --> Used for operations
 * on two operands Eg: Addition or Multiplication
 * <p>
 * BiFunction<T, U, R> : takes T, U as input and returns R --> Used for
 * operations on two different types Eg: Concatenate String and Integer
 * <p>
 * BiConsumer<T, U> : takes T, U as input and returns nothing --> Used for
 * operations on two different types without returning a value Eg: Print two
 * values
 */

public class L40_Functions_Package {

    public static void main(String[] args) {

        System.out.println("This is a demonstration of functions and packages in Java.");

        // Function

        Function<String, Integer> function = str -> str.length();

        // Here what apply do is it takes the input and pass it to the lambda expression
        // and return the output
        System.out.println("Length of 'Hello': " + function.apply("Hello")); // Output: 5

        // Predicate

        //Here what test do is it takes the input and pass it to the lambda expression
        Predicate<Integer> isEven = num -> num % 2 == 0;
        System.out.println("Is 4 even? " + isEven.test(4)); // Output: true

        // Consumer

        Consumer<String> logConsumer = messageCode -> System.out.println("Response Code: " + messageCode);


        //Here what accept do is it takes the input and pass it to the lambda expression
        logConsumer.accept("200 OK"); // Output: Response Code: 200 OK


        //Supplier 

        Supplier<Map<Integer,String>> mapSupplier = () -> new HashMap<>(10);
        
        //Here get do is it takes nothing as input and return the output from the lambda expression
        Map<Integer,String> map = mapSupplier.get();
        System.out.println("Map created with initial capacity: " + map.values()); // Output: Set created with initial capacity: 0


        //UnaryOperator
        // It is same as Function but it takes and returns the same type
        UnaryOperator<Integer> squareFunction = num -> num * num;
        System.out.println("Square of 5: " + squareFunction.apply(5)); // Output: 25

        //BiConsumer
        BiConsumer<String,Integer> responseLogger = (messageCode, responseTime) -> {
            System.out.println("Response Code: " + messageCode);
            System.out.println("Response Time: " + responseTime + "ms");
        };

        responseLogger.accept("NOT_FOUND", 1); // Output: Response Code: NOT_FOUND Response Time: 1ms

        //BiFunction
        BiFunction<String, Integer, String> concatenateFunction = (str, num) -> str + num;
        System.out.println("Concatenated Result: " + concatenateFunction.apply("Error Code: ", 404)); // Output: Error Code: 404

        //BinaryOperator
        // It is same as BiFunction but it takes and returns the same type
        BiFunction<Integer, Integer, Integer> addFunction = (a, b) -> a + b;
        System.out.println("Sum of 5 and 10: " + addFunction.apply(5, 10)); // Output: 15
    }
}