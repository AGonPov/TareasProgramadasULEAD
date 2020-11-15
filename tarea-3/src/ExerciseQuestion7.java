public class ExerciseQuestion7 {
    //Print the following pattern using for loop
    //5 4 3 2 1
    //4 3 2 1
    //3 2 1
    //2 1
    //1

    public static void main(String[] args) {
        int rows = 5;

        for (int i = rows; i >= 1; --i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

