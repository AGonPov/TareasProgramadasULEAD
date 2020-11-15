public class ExerciseExample12 {
    //Display Fibonacci series up to 10 terms
    //Expected Output:
    //Fibonacci sequence:
    //0  1  1  2  3  5  8  13  21  34

    public static void main(String[] args) {

        int numberOfTerms = 10, firstTerm = 0, secondTerm = 1;

        for (int i = 1; i <= numberOfTerms; ++i) {
            System.out.print(firstTerm + " ");

            int sumOfFirstAndSecondTerms = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = sumOfFirstAndSecondTerms;
        }
    }
}


