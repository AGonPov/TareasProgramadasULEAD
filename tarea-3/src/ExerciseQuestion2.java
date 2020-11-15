public class ExerciseQuestion2 {
    //Print the following pattern1
    //1
    //1 2
    //1 2 3
    //1 2 3 4
    //1 2 3 4 5

    public static void main(String[] args){
        int NumberOfRows = 5;

        for(int rows = 1; rows <= NumberOfRows; ++rows) {
            for(int naturalNumber = 1; naturalNumber <= rows; ++naturalNumber) {
                System.out.print(naturalNumber + " ");
            }
            System.out.println();
        }
    }
}
