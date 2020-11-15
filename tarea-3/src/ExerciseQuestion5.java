public class ExerciseQuestion5 {
    //Given an array iterate it and display numbers which are divisible by 5 and if you find number greater than 150 stop the loop iteration
    //int[] numbers = {12, 15, 32, 42, 55, 75, 122, 132, 150, 180, 200}
    //Expected Output:
    //15
    //55
    //75
    //150
    public static void main(String[] args) {
        int[] numbers = {12, 15, 32, 42, 55, 75, 122, 132, 150, 180, 200};
        for (int number : numbers) {
            if (number % 5 == 0 && number <= 150) {
                System.out.println(number);
            }
        }
    }


}

