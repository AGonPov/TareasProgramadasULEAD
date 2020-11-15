public class ExerciseExample11 {
    //Java program to display all the prime numbers within a range
    //Note: A Prime Number is a whole number that cannot be made by multiplying other whole numbers
    //Examples:
    //
    //6 is not a Prime Number because it can be made by 2×3 = 6
    //37 is a Prime Number because no other whole numbers multiply together to make it.
    //
    //Given:
    //int start = 25
    //int end = 50

    public static void main(String[] args) {

        int multiple;

        for (int number = 25; number < 50; number++) {
            multiple = 0;
            for (int i = 1; i <= number; i++) {
                if (number % i == 0)
                    multiple = multiple + 1;
            }
            if (multiple == 2)
                System.out.println(number);
        }
    }
}

