public class ExerciseExample15 {
    //Use a loop to display elements from a given array which are present at even positions
    //Given:
    //int[] numbers = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100}
    //Expected output:
    //20 40 60 80 100

    public static void main(String[] args) {
        int[] numbers = new int[]{10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        for (int i = 1; i < numbers.length; i = i + 2) {
            System.out.println(numbers[i]);
        }
    }
}

