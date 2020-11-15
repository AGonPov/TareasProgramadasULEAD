public class ExerciseExample8 {
    //Reverse the following array using for loop:
    //int[] numbers = {10, 20, 30, 40, 50}
    //Expected Output:
    //50
    //40
    //30
    //20
    //10

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        for (int i = numbers.length; i >= 1; i--) {
            System.out.println(numbers[i - 1]);
        }
    }
}
