import java.util.Scanner;

public class Test2 {
    public static int[][] array = new int[3][3];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        for (int i=array.length-1; i>=0; i--) {
            sum = sum + array[i][array.length-i-1];
        }
        System.out.println(sum);
    }
}
