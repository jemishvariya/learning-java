import java.awt.*; 
import java.util.Arrays; 

public class learn_java{

    private static int add(int a, int b){
        int result = a + b; 
        return result;         
    }

    private static void find_rental_yield(){
        System.out.println(); 
        System.out.println(); 
        
        double monthly_rental_income = 1300, annual_rental_income = 12 * monthly_rental_income; 
        double property_value = 250_000; 

        double rental_yield = (annual_rental_income / property_value) * 100 ; 
        System.out.println(rental_yield); 
        
        System.out.println(); 
        System.out.println(); 
    }

    // Classes 
    static class Cat {
        String name; 
        void meow () {
            System.out.println(name + ": mewo..."); 
        }
    }

    public static void main(String[] args){
        // java first code 
        System.out.println("Hello Java 🎉");
        System.out.println(10 + 10);

        // single line comment
        /* Multi 
           Line 
           Comment
        */

        // primitives 
        int number1 = 10; 
        int number2 = 10; 
        int result = number1 + number2; 
        System.out.println(result);
        double pi = 3.14; 
        boolean isAdult = true;
        char a = 'A'; 

        // Arithmatic operations 
        int numberOne = 10; 
        int numberTwo = 3; 
        System.out.println(numberOne + numberTwo); 
        System.out.println(numberOne - numberTwo); 
        System.out.println(numberOne * numberTwo); 
        System.out.println(numberOne / numberTwo); 
        System.out.println(numberOne % numberTwo); 

        // BODMAS Rule 
        // B - Brackets
        // O - Orders (power/root)
        // D - Division
        // M - Multiplication
        // A - Addition
        // S - Substraction 

        System.out.println((2+2) * (3/1)*2); 

        // Increment Operator ++ 
        int number = 0; 
        System.out.println(number++); 
        System.out.println(number);
        number = 0;  
        System.out.println(++number); 
        System.out.println(number);

        // Decrement Operator ++ 
        number = 0; 
        System.out.println(number--); 
        System.out.println(number);
        number = 0;  
        System.out.println(--number); 
        System.out.println(number);

        // Comparision Operators 
        // < <= > => == != 
        System.out.println(10 > 10); 
        System.out.println(10 >= 10); 
        System.out.println(10 < 10); 
        System.out.println(10 <= 10); 
        System.out.println(10 == 10);
        System.out.println(10 != 10); 

        System.out.println(); 

        boolean isAdult1 = 15 > 16; 
        System.out.println(isAdult1); 

        /* 
            x += y ==> x = x + y
            x -= y ==> x = x - y
            x *= y ==> x = x * y
            x /= y ==> x = x / y
            x %= y ==> x = x % y
            
        */
        number1 = 10; 
        number2 = 2; 
        number2 += number1; 
        System.out.println(number2);

        //Strings 
        String brand = "AmigosCode"; 
        System.out.println(brand);

        // Concatenaiton
        String amigos = "Amigos"; 
        String code = "code"; 
        brand = amigos + code; 
        System.out.println(brand);
        System.out.println(brand.toUpperCase());
        System.out.println(brand.toLowerCase());
        System.out.println(brand.substring(0,6));
        System.out.println("   ".isEmpty());
        System.out.println(brand.isBlank()); 
        System.out.println("  a  ".trim()); 

        // Reference types / objects 
        Point pointA = new Point(10, 10); 
        System.out.println("pointA = " + pointA); 
        pointA.move(10,11); 
        System.out.println("pointA = " + pointA); 
         
        // Arrays 
        int[] numbers = new int[3]; 
        numbers[0] = 1; 
        numbers[1] = 33; 
        numbers[2] = 6; 
        System.out.println(Arrays.toString(numbers)); 

        int[] numbers2 = {0,5,6,8,9} ; 
        System.out.println(Arrays.toString(numbers2)); 
        numbers2[1] = 55; 
        System.out.println(Arrays.toString(numbers2)); 
        System.out.println(numbers2.length);

        String[] names = {"Jamila", "Alex"}; // array of strings. 

        // Arrays null values 
        int[] numbers3 = new int[3];
        Arrays.fill(numbers3, -1); // to initialize the array with -1;  
        numbers3[2] = 27; 
        System.out.println(Arrays.toString(numbers3));
        String[] names1 = new String[3]; 
        names[1] = "Jamila"; 
        System.out.println(Arrays.toString(names1)); 

        // Loops 
        String[] names2 = {
            "James", 
            "Nadia", 
            "Sophia",
            "Alex"
        }; 
        System.out.println(names2[0]); 
        System.out.println(names2[1]); 
        System.out.println(names2[2]); 
        System.out.println(names2[3]);
        
        for(int i=0; i<names2.length; i++){
            System.out.println(names2[i]); 
        }

        // If statements 
        if (true){
            System.out.println("This code runs when true"); 
        } 
        else {
            System.out.println("This code runs when false"); 
        }
        System.out.println("code outside if"); 

        // package : is a folder which allows to structure the code of the application. 

        // Methods: 
        /*
            - Access Modifier
            - Optional static
            - Return type
            - name 
            - Optional Parameters 
            - Method Body 
            - Optional return value.  
        */ 

        int result2 = add (10, 20); // function Call  
        System.out.println(result2);  

        find_rental_yield(); // calling function named rental yield 

        // Making an object of class Cat. 
        Cat cat = new Cat(); 
        cat.meow(); 
    }
}