
public class ExerciseExample13 {
    //Write a loop to find the factorial of any number
    //The factorial (symbol: !) means to multiply all whole numbers from our chosen number down to 1.
    //For example: calculate the factorial of 5
    //5! = 5 × 4 × 3 × 2 × 1 = 120
    //Expected Output:
    //120

    public static void main(String[] args) {

        int factorialNumber = 5;
        int value = 1;

        for (int i = 1; i <= factorialNumber; ++i) {
            value = value * i;
        }
        System.out.println(value);
    }
}
