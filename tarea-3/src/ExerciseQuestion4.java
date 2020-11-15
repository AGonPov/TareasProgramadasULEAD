public class ExerciseQuestion4 {
    //Print multiplication table of given number
    //For example  num=2  so the output should be
    //2
    //4
    //6
    //8
    //10
    //12
    //14
    //16
    //18
    //20

    public static void main(String[] args) {
        int userNumber = 2;

        for (int multiple = 0; multiple < 10; multiple++) {
            System.out.println(userNumber * (multiple + 1));
        }
    }
}
