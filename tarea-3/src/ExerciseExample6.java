public class ExerciseExample6 {
    //Given a number count the total number of digits in a number
    //For example, the number is 75869, so the output should be 5.

    public static void main(String[] args) {
        int number = 75869;
        int digits = 0;

        for (; number != 0; number /= 10, digits++) {
        }
        System.out.println(digits);
    }
}
