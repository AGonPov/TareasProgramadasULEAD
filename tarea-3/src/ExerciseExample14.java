public class ExerciseExample14 {
    //Reverse a given integer number
    //Given:
    //76542
    //Expected output:
    //24567

    public static void main(String[] args) {

        int number = 76542;
        int reversedNumber = 0;

        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }
        System.out.println(reversedNumber);
    }
}

